package com.example.smartschool.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.smartschool.model.GuruModel;

public interface GuruRepository extends JpaRepository<GuruModel, String> {
	



}
