package com.example.datasiswa.datasiswa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datasiswa.datasiswa.entity.DataSiswaEntity;

@Repository
public interface DataSiswaRepository extends JpaRepository<DataSiswaEntity, Integer>{

}
