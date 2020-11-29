package com.example.datasiswa.datasiswa.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.datasiswa.datasiswa.entity.DataSiswaEntity;

@Repository
public interface DataSiswaRepository extends JpaRepository<DataSiswaEntity, Integer>{
	
	@Query("SELECT s FROM DataSiswaEntity s WHERE s.nis=:nis")
    public DataSiswaEntity filter(@RequestParam("nis") String nis);

}
