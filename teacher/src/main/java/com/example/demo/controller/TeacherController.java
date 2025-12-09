package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class TeacherController {
	
	@Autowired
	private TeacherRepository tr;
	
	@PostMapping("add")
	public void postMethodName(@RequestBody Teacher entity) {
		tr.save(entity);
	}
	
	@GetMapping("display")
	public List<Teacher> getMethodName(@RequestParam String param) {
		return tr.findAll();
	}
	

}
