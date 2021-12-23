package com.service;
import java.util.List;
import java.util.Optional;

import com.model.*;

public interface TodoService {

    List < Todo > getTodosByUser(String user);

    Optional <Todo> getTodoById(long id);

    void updateTodo(Todo todo);

    void addTodo(String name, String desc,boolean isDone);

    void deleteTodo(long id);

    void saveTodo(Todo todo);
}