package com.beautifulsoup.permission.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.beautifulsoup.permission.common.exception.PermissionException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PermissionExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		String requestUrl=request.getRequestURL().toString();
		ModelAndView mv;
		String defaultMessage="System Error";
		
		if(requestUrl.endsWith(".json")) {
			if(ex instanceof PermissionException) {
				ResponseData responseData=ResponseData.fail(ex.getMessage());
				mv=new ModelAndView("jsonView",responseData.toMap());
			}else {
				log.error("Error",ex.getMessage());
				ResponseData responseData=ResponseData.fail(defaultMessage);
				mv=new ModelAndView("jsonView",responseData.toMap());
			}
		}else if(requestUrl.endsWith(".page")){
			ResponseData responseData=ResponseData.fail(defaultMessage);
			mv=new ModelAndView("exception",responseData.toMap());
		}else {
			ResponseData responseData=ResponseData.fail(defaultMessage);
			mv=new ModelAndView("jsonView",responseData.toMap());
		}
		
		return mv;
	}

}
