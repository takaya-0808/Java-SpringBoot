CREATE DATABASE IF NOT EXISTS sample;

use sample

CREATE TABLE user(
    user_id serial primary key,
    user_name char(16) NOT NULL,
    password char(16) NOT NULL
);

INSERT INTO user(user_name, password) VALUES('user', 'password');