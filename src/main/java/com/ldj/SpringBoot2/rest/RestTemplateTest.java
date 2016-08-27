package com.ldj.SpringBoot2.rest;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class RestTemplateTest {
	Logger logger = Logger.getLogger(this.getClass());
	String baseUrl = "http://localhost:8080";
	URI uri = URI.create(baseUrl+"/api/articles");
	RestTemplate restTemplate = new RestTemplate();

	@Autowired
	ArticleService articleService;
	String result;
	
	//GET 요청(ALL) 
	public String requestIndex(){
		uri = URI.create(baseUrl+"/api/articles");
		
		logger.info("requestIndex");
		logger.info(uri);
		//RestTemplate.getForObject()로 HttpMethod.GET을 요청
		
		//리턴타입은 Json문자열
//		String responseString = restTemplate.getForObject(uri, String.class);
//		logger.info(responseString);
//		result = responseString;

		//리턴타입을  객체로 지정할 수 있음(Article배열로 리턴)
		List<Article> resultArticles = Arrays.asList(restTemplate.getForObject(uri, Article[].class));
		logger.info("resultArticles");
		logger.info(resultArticles.toString());
		
		result = resultArticles.toString();
		
		return result;
	}
	
	//POST 요청 
	public String requestCreate(){
		uri = URI.create(baseUrl+"/api/articles");
		
		Article article = new Article();
		article.setTitle("testing1");
		article.setContent("testContent");
		
		//post요청에서 받는 쪽은 Article객체를 매핑하기 위해서는 반드시 @RequetBody로 받아야함 
		Article resultArticle = restTemplate.postForObject(uri, article, Article.class);
		logger.info(resultArticle);
		
		return resultArticle.toString();
	}
	
	// Object -> JsonString
	private String jsonStringFromObject(Object obj) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(obj);
	}
	
	//DELETE 요청
	public String requestDelete(){
		long id = 2;
		
		uri =  URI.create(baseUrl+"/api/articles/"+id);
		
		//기본 DELETE 요청은 리턴값이 없음 ( 리턴이 필요없을 때 사용 )
//		Article article = articleService.getArticles(id);
//		restTemplate.delete(uri); 
		//기본 DELETE 요청 종료 
		
		//리턴 값 있는 DELETE 요청
		HttpHeaders headers = new HttpHeaders();
		HttpEntity entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> responseEntity = restTemplate.exchange(uri, HttpMethod.DELETE, entity, String.class);
		logger.info(responseEntity.toString());
		//리턴 값 있는 DELETE 요청 종료 
		
//		return "success";
		return responseEntity.toString();
	}
	
	//PUT 요청
	public String requestPut(){
		long id = 1;
		
		uri =  URI.create(baseUrl+"/api/articles/"+id);
		
		Article article = articleService.getArticles(id);
		article.setTitle("change title");
		article.setContent("change content");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Article> entity = new HttpEntity(article, headers);
		ResponseEntity<String> responseEntity = restTemplate.exchange(uri, HttpMethod.PUT, entity, String.class);
		logger.info(responseEntity.toString());
		
		return responseEntity.toString();
	}
}
