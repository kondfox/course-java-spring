CREATE DATABASE practice DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci;

USE practice;

CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT DEFAULT 0,
    gender ENUM('male', 'female')
);

CREATE TABLE IF NOT EXISTS cars (
	id INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    color VARCHAR(50),
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES users(id)
);

INSERT INTO users (name, age, gender) VALUES
	('John', 32, 'male'),
    ('Jane', 33, 'female'),
    ('Kate', 28, 'female'),
    ('Jack', 8, 'male'),
    ('Gizi', 18, 'female')
;

INSERT INTO cars (type, color, owner_id) VALUES
	('Ferrari', 'red', null),
    ('Trabant', 'white', 1),
    ('Audi', 'white', 2),
    ('Suzuki', 'blue', 1),
    ('Suzuki', 'red', 3)
;

SELECT * FROM users;

SELECT name, age FROM users;

SELECT COUNT(*) AS amount FROM users;

SELECT * FROM users
WHERE age < 30;

SELECT name FROM users
WHERE age < 30
AND gender = 'female';

SELECT gender, COUNT(*) AS amount FROM users
GROUP BY gender;

SELECT users.name FROM users
JOIN cars ON users.id = cars.owner_id
WHERE cars.color = 'white';

UPDATE users
SET age = 19
WHERE id = 5;

DELETE FROM users
WHERE id = 5;

INSERT INTO users (name, age, gender) VALUES
	('Gizi 2', 32, 'female');
