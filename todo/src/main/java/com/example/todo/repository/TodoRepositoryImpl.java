package com.example.todo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import com.example.todo.model.Todo;


@Repository
public class TodoRepositoryImpl implements TodoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Todo findById(int id) {
        return jdbcTemplate.queryForObject("select * from todo where id=?", new BeanPropertyRowMapper<Todo>(Todo.class), id);
    }

    @Override
    public int save(Todo todo) {
        return jdbcTemplate.update("insert into todo(title, content, completed, create_ad) values(?, ?, ?, ?)", new Object[] {todo.getTitle(), todo.getContent(), todo.getCompleted(), todo.getCreateDateTime()});
    }

    @Override
    public List<Todo> findAll() {
        RowMapper<Todo> rowMapper = new BeanPropertyRowMapper<Todo>(Todo.class);
        return jdbcTemplate.query("select * from todo", rowMapper);
    }

    @Override
    public int edit(Todo todo, int id) {
        return jdbcTemplate.update("update todo set title=?, content=?, completed=?, create_ad=?  where id=?", new Object[] {todo.getTitle(), todo.getContent(), todo.getCompleted(), todo.getCreateDateTime(), id});
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from todo where id=?", id);
    }

}