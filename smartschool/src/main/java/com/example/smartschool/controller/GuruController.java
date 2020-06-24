package com.example.smartschool.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.smartschool.model.GuruModel;
import com.example.smartschool.service.GuruService;

@Controller
public class GuruController {
	
	@Autowired
	private GuruService guruService;
	
	@RequestMapping ("/")
	public String guru() {
		
		String home = "/guru/guru";
		return home;
	}
	
	@RequestMapping ("/guru/create")
	public String guruCreate(HttpServletRequest request, Model model) {
	
		String nipGuru = request.getParameter("nipGuru");
		String namaGuru = request.getParameter("namaGuru");
		String teleponGuru = request.getParameter("teleponGuru");
		String genderGuru = request.getParameter("genderGuru");
		String gelarGuru = request.getParameter("gelarGuru");
		String alamatGuru = request.getParameter("alamatGuru");
		
		GuruModel guruModel = new GuruModel();
		
		guruModel.setNipGuru(nipGuru);
		guruModel.setNamaGuru(namaGuru);
		guruModel.setTeleponGuru(teleponGuru);
		guruModel.setGenderGuru(genderGuru);
		guruModel.setGelarGuru(gelarGuru);
		guruModel.setAlamatGuru(alamatGuru);
		
		this.guruService.create(guruModel);
		
		this.ListGuru(model);
		
		String home = "/guru/guru";
		return home;
	}
	
	public void ListGuru (Model model) {
		List<GuruModel> guruModelList = new ArrayList<GuruModel>();
		guruModelList = guruService.readData();
		model.addAttribute("guruModelList", guruModelList);
	}
	

}
