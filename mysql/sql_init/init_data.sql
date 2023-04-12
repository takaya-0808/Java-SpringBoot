CREATE DATABASE IF NOT EXISTS sample;

use sample

CREATE TABLE user(
    user_id serial primary key,
    user_name char(16) NOT NULL,
    password char(16) NOT NULL
);

INSERT INTO user(user_name, password) VALUES('user', 'password');


CREATE TABLE todo (
    id int(11) NOT NULL AUTO_INCREMENT,
    title VARCHAR(50),
    content VARCHAR(500),
    completed BOOLEAN, 
    PRIMARY KEY(id)
);

INSERT INTO todo(title, content, completed) VALUES('user', 'password', true);
INSERT INTO todo(title, content, completed) VALUES('hoge', 'hogehoge', false);