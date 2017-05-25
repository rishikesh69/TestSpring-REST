package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/getEmployee")
public class TestRESTController {
	
	@RequestMapping(value="{name}", method=RequestMethod.GET)
	public @ResponseBody Employee getEmpInJson(@PathVariable String name){
		Employee emp = new Employee();
		emp.setEmpName(name);
		emp.setSalary(25000);
		return emp;
	}
}

