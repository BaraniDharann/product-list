package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Todo;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.repo.IToDoRepo;
@Service
public class Todoservice {

	@Autowired
	IToDoRepo repo;
	public List<Todo>getAllTodoItem(){
		ArrayList<Todo> todolist=new ArrayList<>();
        repo.findAll().forEach(todo->todolist.add(todo));
        return todolist;
	}
	public Todo getTodoItemById(Long id) {
		return repo.findById(id).get();
	
	}
	public boolean updateStatus(Long id) {
		Todo todo=getTodoItemById(id);
		todo.setStatus("completed");
		return saveOrUpdateTodoItem(todo); 
	}
	 public boolean saveOrUpdateTodoItem(Todo todo){
		Todo updatedobj=repo.save(todo);
		if(getTodoItemById(updatedobj.getId())!=null){
			return true;
		}
		return false;
	}
	public boolean deleteTodoItem(Long id) {
		repo.deleteById(id);
		if(repo.findById(id).isEmpty()) {
			return true;
		}
		return false;
		
	}
}
