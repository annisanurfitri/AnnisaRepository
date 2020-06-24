package com.example.smartschool.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.smartschool.service.SayurService;

@Controller
@RequestMapping (value ="sayur")
public class SayurController {
	//DI - Dependency Injection
	//agar gaperlu buat instance berulang
	@Autowired
	private SayurService sayurService;
	
	
	//controller untuk mapping/manage halaman ui melalui backend
	//memanggil halaman frontend aja

	//panggil file html welcome adar muncul di browser
	@RequestMapping (value="welcome")
	//itu adalah urlnya di browser
	public String methodWelcome(Model model) { //ada inputan
		String buah1Backend = "Mangga Manis";
		String html = "sayur/welcome"; 
		//artinya ada di folder sayur, filenya welome.html
		model.addAttribute("buah1Frontend", buah1Backend);
		
		//instance kelas bisa digantikan dgn DI - dpendency injection
		//instance kelas sayurService
		//SayurService ss = new SayurService();
		String impor1 = sayurService.buahImpor();
		
		model.addAttribute("impor1Frontend", impor1);
		
		return html;
	}
	@RequestMapping (value="lanjut.do")
	public String methodNext(HttpServletRequest request, Model model) {
		String buah2Backend = request.getParameter("buah2Frontend");
		model.addAttribute("buah2FrontendNext", buah2Backend);
		
		String html ="sayur/next";
		return html;
	}
	
	
}
