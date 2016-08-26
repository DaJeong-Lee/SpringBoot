package com.ldj.SpringBoot2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
	
	@Autowired
	ArticleService articleservice;

	//GET ALL (전체 조회)
	@RequestMapping(value="/api/articles", method=RequestMethod.GET)
	@ResponseBody
	public List<Article> index(){
		return articleservice.getArticles();
	}
	
	//GET (조회)
	@RequestMapping(value="/api/articles/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Article show(@PathVariable long id){
		return articleservice.getArticles(id);
	}
	
	//POST (생성)
	@RequestMapping(value="/api/articles", method=RequestMethod.POST)
	@ResponseBody
	public Article create(@RequestBody Article article){
		return article;
	}
	
	//PATCH(수정), 기존에는 PUT을 사용했었는데 최근에는 부분 업데이트 개념으로 PATCH를 사용 (전체 업데이트는 PUT 사용)
	@RequestMapping(value="/api/articles/{id}", method=RequestMethod.PATCH)
	@ResponseBody
	public Article patch(@PathVariable long id, @RequestBody Article article){
		return article;
	}
	
	//PUT(전체 수정)
	@RequestMapping(value="/api/articles/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Article update(@PathVariable long id, @RequestBody Article article){
		return article;
	}
	
	//DELETE(삭제)
	@RequestMapping(value="/api/articles/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public List<Article> destroy(@PathVariable long id){
		return articleservice.deleteArticle(id);
	}
	
}
