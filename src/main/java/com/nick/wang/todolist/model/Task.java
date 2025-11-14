package com.nick.wang.todolist.model;

import java.sql.Timestamp;
import java.time.LocalDate;

import lombok.Data;

@Data
public class Task {

	private String taskId;
	private String note;
	private LocalDate dueDate;
	private Timestamp createdTimestamp;
	private Timestamp updatedTimestamp;
	private TaskStatus taskStatus;
	
}
