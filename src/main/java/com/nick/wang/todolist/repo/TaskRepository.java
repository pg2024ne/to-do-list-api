package com.nick.wang.todolist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nick.wang.todolist.data.TaskEntity;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, String> {
    // You can add custom queries here if needed
}
