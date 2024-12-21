package com.Mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mobile.entity.Mobile;
import com.Mobile.exception.BrandException;
import com.Mobile.service.MobileService;

@RestController
@RequestMapping(value="/mobile")
public class MobileController {
	@Autowired
	MobileService ms;
	@PostMapping(value="/getAll")
	public String all(@RequestBody List<Mobile> e) {
		return ms.all(e);
	}
	@GetMapping(value="/findAll")
	public List<Mobile> get(){
		return ms.get();
	}
	@GetMapping(value="/getOne/{a}")
	public Mobile one(@PathVariable int a) {
		return ms.one(a);
	}
	@GetMapping(value="/getMax")
	public Mobile max() {
		return ms.max();
	}
	@GetMapping(value="/getMin")
	public Mobile Max1() {
		return ms.Max1();
	}
	@GetMapping(value="/length")
	public Mobile length() {
		return ms.length();
		
	}
	@GetMapping(value="/BrandException/{a}")
	public String brand(@PathVariable int a) throws BrandException{
		return ms.brand(a);
	}

}
