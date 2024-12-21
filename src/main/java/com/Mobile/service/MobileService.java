package com.Mobile.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mobile.Dao.MobileDao;
import com.Mobile.entity.Mobile;
import com.Mobile.exception.BrandException;

@Service
public class MobileService {
	@Autowired
	MobileDao md;
	public String all(List<Mobile> e) {
		return md.all(e);
	}
	public List<Mobile> get() {
		return md.get();
	}
	public Mobile one(int a) {
		return md.one(a);
	}
	public Mobile max() {
		List<Mobile> ar = md.get();
		Mobile max = ar.get(0);
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getPrice()>max.getPrice()) {
				max = ar.get(i);
			}
		}
		return max;
		
		
	}
	public Mobile Max1() {
		List<Mobile> ar = md.get();
		Mobile a = ar.stream().min(Comparator.comparing(Mobile::getPrice)).get();
		return a;
		
	}
	public Mobile length() { 
		List<Mobile> aa = md.get();
		Mobile b = aa.stream().max(Comparator.comparing(Mobile::getBrand)).get();
		return b;
		
	}
	public String brand(int a) throws BrandException{
		String name = md.one(a).getBrand();
		if(name.startsWith("q")) {
			return name;
		}
		else {
			throw new BrandException("invalid name");
		}
		
	}
	
	
	

}
