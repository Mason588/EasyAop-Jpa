package com.example.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;

public class preHandler implements HandlerInterceptor{
	public boolean preHandler(HttpServletRequest request, HttpServletRequest response, Object handler) {
		System.out.println("LoginInterceptor");
		return true;
	}
	
}
