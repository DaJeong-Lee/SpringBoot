package com.ldj.SpringBoot2.rest;

import java.net.URI;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class RestTemplateTest {
	Logger logger = Logger.getLogger(this.getClass());
	String baseUrl = "http://localhost:8080";
	RestTemplate restTemplate = new RestTemplate();

	//GET 요청(ALL) 
	public void requestIndex(){
		logger.info("requestIndex");
		URI uri = URI.create(baseUrl+"/api/articles");
		logger.info(uri);
		//RestTemplate.getForObject()로 HttpMethod.GET을 요청
		//리턴타입은 Json문자열
		String responseString = restTemplate.getForObject(uri, String.class);

		logger.info(responseString);
	}
	
	// Object -> JsonString
	private String jsonStringFromObject(Object obj) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(obj);
	}
}
