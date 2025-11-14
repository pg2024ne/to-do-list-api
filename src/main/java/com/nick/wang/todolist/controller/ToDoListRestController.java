package com.nick.wang.todolist.controller;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nick.wang.todolist.model.Task;
import com.nick.wang.todolist.model.TaskStatus;
import com.nick.wang.todolist.service.TaskService;


@RestController
@RequestMapping("/api/tasks")
public class ToDoListRestController {
	
	private static final org.slf4j.Logger log =
		    org.slf4j.LoggerFactory.getLogger(ToDoListRestController.class);
	
	private TaskService taskService;
	
	public ToDoListRestController(TaskService taskService) {
		this.taskService = taskService;
	}

	@PostMapping
	public Task addTask(@RequestBody Task task) {
		log.info("create a task.");
		return taskService.createTask(task);
	}
	
	@GetMapping
	public List<Task> getTasks() {
		log.info("return all tasks");
		return new ArrayList<Task>();
	}
	
	@GetMapping("/{taskId}")
	public List<Task> getTask(@PathVariable("taskId") String taskId) {
		log.info("return a task by taskId" + taskId);
		return new ArrayList<Task>();
	}
	
	@PutMapping("/{taskId}")
	public Task updateTask(@PathVariable("taskId") String taskId, @RequestBody Task task) {
		log.info("update the task by taskId " + taskId);
		return task;
	}
	
	@DeleteMapping("/{taskId}")
	public void deleteTask(@PathVariable("taskId") String taskId) {
		log.info("delete the task by taskId " + taskId);
	}

}
