package com.example.demo.model;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.annotation.Nonnull;

@Entity
@Table (name="list")
public class Todo {
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	@Column
	@Nonnull
 private Long Id;
	@Column	
	@Nonnull
 private String title;
	@Column
	@Nonnull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
 private Date date;
	@Column
	@Nonnull
 private String status;
 
  public Todo(){
	  
  }
public Long getId() {
	return Id;
}
public void setId(Long id) {
	this.Id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
 
	
}
