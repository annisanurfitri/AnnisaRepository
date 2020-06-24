package com.example.smartschool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartschool.model.GuruModel;
import com.example.smartschool.service.GuruService;

@RestController
//di sini boleh dimapping
@RequestMapping("/api/guru")
public class GuruApi {
	
	//			| DI API NAMANYA :
	//INSERT	| POST
	//READ		| GET
	
	@Autowired
	private GuruService guruService;
	
	//POST || INSERT
	@PostMapping ("/post") //digunakan untuk  me-mapping suatu method sebagai fungsi insert data dalam API

	@ResponseStatus(code=HttpStatus.CREATED)
	public Map<String, Object> postMapping(@RequestBody GuruModel guruModel) {

		this.guruService.create(guruModel);
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", Boolean.TRUE);
		map.put("pesan", "masukkkkk");
		return map;
	}
	
	//GET || READ
	@GetMapping("/get")
	//kalo mau lihat data, pake OK
	//200
	@ResponseStatus(code=HttpStatus.OK)
	public List<GuruModel> getMapping(){
		
		List<GuruModel> guruModelList = new ArrayList<GuruModel>();
		guruModelList = this.guruService.readData();
		return guruModelList;
	}
	
	
	//pada dasarnya update tu isi data kan?
	//nah update pakai fungsi yg hampir sama kaya pas create data
	
	
	//PUT || UPDATE
	@PutMapping ("/put")
	@ResponseStatus(code=HttpStatus.OK)
	public Map<String, Object> putMapping(@RequestBody GuruModel guruModel){
		
		this.guruService.update(guruModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", Boolean.TRUE);
		map.put("pesan", "update berhasil");
		return map;
	}

}
