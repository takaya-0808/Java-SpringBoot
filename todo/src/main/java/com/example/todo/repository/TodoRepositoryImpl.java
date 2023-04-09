package com.example.todo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.todo.model.Todo;


@Repository
public class TodoRepositoryImpl implements TodoRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Todo findById(int id) {
        return jdbcTemplate.queryForObject("select * from todo where id=?", new BeanPropertyRowMapper<Todo>(Todo.class), id);
    }


}