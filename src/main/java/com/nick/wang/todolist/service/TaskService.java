package com.nick.wang.todolist.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.nick.wang.todolist.data.TaskEntity;
import com.nick.wang.todolist.model.Task;
import com.nick.wang.todolist.model.TaskStatus;
import com.nick.wang.todolist.repo.TaskRepository;

@Service
public class TaskService {

	private TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public Task createTask(Task task) {
		task.setTaskStatus(TaskStatus.OPEN);
		task.setTaskId(UUID.randomUUID().toString());
		
		TaskEntity entity = convertTask(task);
		TaskEntity newEntity = taskRepository.save(entity);
		return convertTask(newEntity);
	}
	
	private TaskEntity convertTask(Task task) {
		TaskEntity entity = new TaskEntity();
		entity.setTaskId(task.getTaskId());
	    entity.setNote(task.getNote());
	    entity.setDueDate(task.getDueDate());
	    entity.setTaskStatus(task.getTaskStatus());
	    return entity;
	}
	
	private Task convertTask(TaskEntity task) {
		Task entity = new Task();
		entity.setTaskId(task.getTaskId());
	    entity.setNote(task.getNote());
	    entity.setDueDate(task.getDueDate());
	    entity.setCreatedTimestamp(task.getCreatedTimestamp());
	    entity.setUpdatedTimestamp(task.getUpdatedTimestamp());
	    entity.setTaskStatus(task.getTaskStatus());
	    return entity;
	}
}
