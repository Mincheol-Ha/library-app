show databases;
show tables;
DROP table user;
SELECT * FROM user_loan_history;
DROP TABLE IF EXISTS user;
DESCRIBE user;
SELECT * from Book;


CREATE DATABASE IF NOT EXISTS library;

use library;

create table book(id bigint auto_increment,
name varchar(255),    
primary key (id));

create table  user_loan_history ( id bigint auto_increment,    
user_id bigint,    
book_name varchar(255),    
is_return tinyint(1),   
primary key (id));

CREATE TABLE IF NOT EXISTS user (
    id BIGINT AUTO_INCREMENT,
    name VARCHAR(25),
    age INT,
    PRIMARY KEY (id)
);


SHOW TABLES LIKE 'user';