package com.example.demo.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class TestController {

	@PostMapping("/upload")
	public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException
	{
		System.out.println(nickname);
		//獲取圖片的原始名稱
		System.out.println(photo.getOriginalFilename());
		//獲取文件類型
		System.out.println(photo.getContentType());
		
		String path = request.getServletContext().getRealPath("/upload/");
		System.out.println(path);
		saveFile(photo, path);
		return "上傳成功"+ photo;
		
	}
	
	public void saveFile(MultipartFile photo, String path) throws IOException{
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		File file = new File(path + photo.getOriginalFilename());
		photo.transferTo(file);
	}
	
}
