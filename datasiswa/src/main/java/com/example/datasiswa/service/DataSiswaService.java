package com.example.datasiswa.service;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.datasiswa.entity.DataSiswaEntity;
import com.example.datasiswa.repository.DataSiswaRepository;

@Service
public class DataSiswaService {

	@Autowired
	DataSiswaRepository dataSiswaRepository;
	
	public Map<String, Object> addSiswa(DataSiswaEntity dataSiswaEntity){
		DataSiswaEntity addData = new DataSiswaEntity();
		addData.setNamaSiswa(dataSiswaEntity.getNamaSiswa());
		addData.setNis(dataSiswaEntity.getNis());
		addData.setKelas(dataSiswaEntity.getKelas());
		addData.setNamaSekolah(dataSiswaEntity.getNamaSekolah());
		addData.setTtl(dataSiswaEntity.getTtl());
		addData.setEmail(dataSiswaEntity.getEmail());
		addData.setNohp(dataSiswaEntity.getNohp());
		
		Map<String, Object> map = new HashMap<>();
		map.put("statusCode", 200);
		map.put("message", "success");
		map.put("data", dataSiswaRepository.save(addData));
		
		return map;
	}
	
	public Map<String, Object> showAll(){
		java.util.List<DataSiswaEntity> list = dataSiswaRepository.findAll();
		
		Map<String, Object> map = new HashMap<>();
		map.put("statusCode", 200);
		map.put("message", "success");
		map.put("data", list);
		
		return map;
		
	}
}
