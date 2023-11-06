package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;
@Repository
public interface IToDoRepo extends JpaRepository<Todo,Long> {

	
	

}
