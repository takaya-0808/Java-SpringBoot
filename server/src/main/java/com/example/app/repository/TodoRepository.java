package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.app.model.TodoModel;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<TodoModel, Long> {

}