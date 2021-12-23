package com.DAO;

import java.util.List;
import com.model.Todo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findByUserName(String user);
}