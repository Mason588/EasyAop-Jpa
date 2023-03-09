package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.proxy.ApiPermission;

@RestController
public class ProxyController {
	@RequestMapping("upup")
	//通過此註解作切入點使方法增強
	@ApiPermission
	public void update() {
		System.out.println("執行修改操作");
	}

}
