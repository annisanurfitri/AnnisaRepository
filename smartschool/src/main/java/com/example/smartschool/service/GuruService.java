package com.example.smartschool.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartschool.model.GuruModel;
import com.example.smartschool.repository.GuruRepository;

@Service
@Transactional
public class GuruService {
	
	@Autowired
	private GuruRepository guruRepository;
	
	public void create(GuruModel guruModel) {
		this.guruRepository.save(guruModel);
		//save = nyimpan data ke? tabel guruModel
	}

	
	public List<GuruModel> readData() {
		//untuk tampilin semua data
		return this.guruRepository.findAll();
	}
	
	public void update(GuruModel guruModel) {
		this.guruRepository.save(guruModel);
	}


}
