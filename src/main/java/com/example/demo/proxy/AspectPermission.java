package com.example.demo.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectPermission {
	//切入點
	@Pointcut("@annotation(com.example.demo.proxy.ApiPermission)")
	public void point() {
		
	}
	@Before("point()")
	public void before(){
		System.out.println("通過session或者redis 獲取我們用戶token");
		System.out.println("通過token解析出用戶id");
		System.out.println("再去查訊是否有權限");
		
	}
}
