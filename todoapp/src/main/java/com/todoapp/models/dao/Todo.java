package com.todoapp.models.dao;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todos")
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(length = 100)
  private String title;
  private boolean isDone;
  @ManyToOne
  @JsonIdentityReference(alwaysAsId = true)
  @JsonProperty(value = "ownerId")
  private TodoUser owner;

  public Todo() {
  }

  public Todo(String title, boolean isDone) {
    this.title = title;
    this.isDone = isDone;
  }

}
