package com.nick.wang.todolist.data;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

import com.nick.wang.todolist.model.TaskStatus;

@Data
@Entity
@Table(name = "task")
public class TaskEntity {

    @Id
    @Column(name = "task_id", length = 50)
    private String taskId;

    @Column(name = "note", columnDefinition = "TEXT")
    private String note;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "created_timestamp", nullable = false, updatable = false)
    private Timestamp createdTimestamp = new Timestamp(System.currentTimeMillis());

    @Column(name = "updated_timestamp", nullable = false)
    private Timestamp updatedTimestamp = new Timestamp(System.currentTimeMillis());

    @Enumerated(EnumType.STRING)   // <--- Important
    @Column(name = "task_status", length = 20)
    private TaskStatus taskStatus;
    
    @PreUpdate
    public void updateTimestamp() {
        this.updatedTimestamp = new Timestamp(System.currentTimeMillis());
    }
}