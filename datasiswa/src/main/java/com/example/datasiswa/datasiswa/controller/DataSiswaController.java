package com.example.datasiswa.datasiswa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.datasiswa.datasiswa.entity.DataSiswaEntity;
import com.example.datasiswa.datasiswa.service.DataSiswaService;

@Controller
@RequestMapping("/dataSiswa")
public class DataSiswaController {
	
	public DataSiswaController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private DataSiswaService dataSiswaService;
	
	@PostMapping("/addSiswa")
	@ResponseBody
	public Map<String, Object> tambahSiswa(@RequestParam(name = "nama_siswa") String namaSiswa, 
			@RequestParam(name = "nis") String nis, 
			@RequestParam(name = "kelas") String kelas, 
			@RequestParam(name = "nama_sekolah") String namaSekolah, 
			@RequestParam(name = "ttl") String ttl, 
			@RequestParam(name = "email") String email, 
			@RequestParam(name = "noHp") String noHp, 
			@RequestParam(name = "nilai") String nilai){
		
		Map<String, Object> data = dataSiswaService.addSiswa(namaSiswa, nis, kelas, namaSekolah, ttl, email, noHp, nilai);
		
		return data;
	}
	
	@GetMapping("/showAllSiswa")
	@ResponseBody
	public Map<String, Object> showDataSiswa(){
		return dataSiswaService.showAll();
	}
	
	@PostMapping("/filterDataSiswa")
	@ResponseBody
	public Map<String, Object> filterDataSiswa(@RequestParam(name = "nis") String nis){
		Map<String, Object> map = dataSiswaService.filterSiswa(nis);
		return map;
	}

}
