package com.beautifulsoup.permission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beautifulsoup.permission.common.ResponseData;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/test")
@Controller
@Slf4j
public class TestController {
	
	@RequestMapping("/get.json")
	@ResponseBody
	public ResponseData hello() {
		log.info("hello ssm-permission");
		return ResponseData.success("Hello SSM-Permission!");
	}
}
