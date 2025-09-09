package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@Autowired
	StudentsRepo repo1;
	SubjectsRepo repo2;
	@PostMapping("/cse/insert")
	public String insert(@RequestBody Students data)
		{
		  repo1.save(data);
		  return "SUCESS";
		
	}


}
