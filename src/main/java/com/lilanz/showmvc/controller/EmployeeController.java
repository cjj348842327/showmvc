package com.lilanz.showmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.lilanz.microservice.common.entity.Result;
//import com.lilanz.microservice.common.tools.ResultUtil;
import com.lilanz.showmvc.model.Employee;

/**
 * EmployeeController
 * @author cjj
 *
 */
@Controller
public class EmployeeController {

	/**
	 * 测试@PathVariable注解
	 * @param name 姓名
	 * @return String
	 */
	//http://localhost:8080/path/zhangsan
	@GetMapping("/path/{name}")
	public String path(@PathVariable String name) {
		System.out.println(name);
		return "name";
	}
	
	/**
	 * 测试@RequestParam注解
	 * @param name 姓名
	 * @param age 年龄
	 * @return String
	 */
	//http://localhost:8080/param?name=lisi&age=20
	@GetMapping("/param")
	public String param(@RequestParam String name,@RequestParam int age) {
		System.out.println(name+","+age);
		return "name";
	}
	
	/**
	 * 测试@ResponseBody和@RequestBody注解
	 * @param employee 员工实体对象
	 * @return Result
	 */
	//http://localhost:8080/reqBody
	/*
	 {
		"name":"zhangsan",
		"age":20,
		"salary":3000.0
	 }
	 
	@PostMapping("/reqBody")
	public @ResponseBody Result<?> reqBody(@RequestBody Employee employee) {
		System.out.println(employee);
		return ResultUtil.success(employee);
	}
	*/
}
