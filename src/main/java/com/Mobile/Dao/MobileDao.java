package com.Mobile.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Mobile.entity.Mobile;
import com.Mobile.repository.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;
	public String all(List<Mobile> e) {
		mr.saveAll(e);
		return "posted";
		
	}
	public List<Mobile> get() {
		return mr.findAll();
	}
	public Mobile one(int a) {
		return mr.findById(a).get();
	}
	
	

}
