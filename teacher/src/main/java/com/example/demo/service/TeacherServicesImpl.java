package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherServicesImpl implements TeacherServices {

	@Autowired
	private TeacherRepository tr;
	
	@Override
	public void add(Teacher t) {
		tr.save(t);
	}

	@Override
	public List<Teacher> display() {
		return tr.findAll();
	}

	@Override
	public void delete(Integer id) {
		tr.deleteById(id);
	}

	@Override
	public void update(Integer id, Teacher t) {
		t.setId(id);
		tr.save(t);
	}

}
