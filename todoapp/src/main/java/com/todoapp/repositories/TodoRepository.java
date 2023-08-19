package com.todoapp.repositories;

import com.todoapp.models.dao.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Integer> {

  List<Todo> findAll();

  List<Todo> findAllByIsDone(Boolean isDone);

//  @Query(value = "SELECT * FROM todos WHERE title LIKE %kuty%", nativeQuery = true)
  List<Todo> findAllByTitleContainsIgnoreCase(String q);

  List<Todo> findAllByIsDoneAndTitleContainsIgnoreCase(Boolean isDone, String q);

}
