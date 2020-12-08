package com.example.datasiswa.datasiswa.service;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.datasiswa.datasiswa.entity.DataSiswaEntity;
import com.example.datasiswa.datasiswa.repository.DataSiswaRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class DataSiswaService {

	@Autowired
	private DataSiswaRepository dataSiswaRepository;
	
	@Transactional
	public Map<String, Object> addSiswa(DataSiswaEntity dataSiswaEntity){
		DataSiswaEntity addData = new DataSiswaEntity();
//		addData.setNamaSiswa("Juned Junaidi");
//		addData.setNis("20189100919");
//		addData.setKelas("11 IPA 1");
//		addData.setNamaSekolah("SMA Negeri 1 Jakarta");
//		addData.setTtl("Bandung, 11-04-1999");
//		addData.setEmail("juned@gmail.com");
//		addData.setNohp("081212121212");
		
		addData.setNama_siswa(dataSiswaEntity.getNama_siswa());
		addData.setNis(dataSiswaEntity.getNis());
		addData.setKelas(dataSiswaEntity.getKelas());
		addData.setNama_sekolah(dataSiswaEntity.getNama_sekolah());
		addData.setTtl(dataSiswaEntity.getTtl());
		addData.setEmail(dataSiswaEntity.getEmail());
		addData.setNohp(dataSiswaEntity.getNohp());
		
		Map<String, Object> map = new HashMap<>();
		map.put("statusCode", 200);
		map.put("message", "success");
		map.put("data", dataSiswaRepository.save(addData));
		
		return map;
	}
	
	@Transactional
	public Map<String, Object> showAll(){
		List<DataSiswaEntity> list = dataSiswaRepository.findAll();
		
		Map<String, Object> map = new HashMap<>();
		map.put("statusCode", 200);
		map.put("message", "success");
		map.put("data", list);
		
		return map;
		
	}
	
	@Transactional
	public Map<String, Object> filterSiswa(String nis){
		DataSiswaEntity data = dataSiswaRepository.filter(nis);
		Map<String, Object> map = new HashMap<>();
		
		if(data == null) {
			map.put("statusCode", 404);
			map.put("message", "data is not found");
		}else {
			map.put("statusCode", 200);
			map.put("message", "success");
			map.put("data", data);
		}
		return map;
	}
}
