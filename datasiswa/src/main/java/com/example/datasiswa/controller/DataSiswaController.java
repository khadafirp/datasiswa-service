package com.example.datasiswa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.datasiswa.entity.DataSiswaEntity;
import com.example.datasiswa.service.DataSiswaService;

@org.springframework.stereotype.Controller
@RequestMapping("/dataSiswa")
public class DataSiswaController {
	
	@Autowired
	DataSiswaService dataSiswaService;
	
	@PostMapping("/addSiswa")
	@ResponseBody
	public Map<String, Object> addSiswa(@RequestParam DataSiswaEntity dataSiswaEntity){
		return dataSiswaService.addSiswa(dataSiswaEntity);
	}
	
	@GetMapping("/showAllSiswa")
	@ResponseBody
	public Map<String, Object> showDataSiswa(){
		return dataSiswaService.showAll();
	}

}
