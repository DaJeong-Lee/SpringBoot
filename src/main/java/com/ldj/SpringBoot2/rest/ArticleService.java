package com.ldj.SpringBoot2.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	
	@Autowired
	ArticleList articles;
	
	public List<Article> getArticles(){
		return articles.getArticles();
	}
	
	
	public Article getArticles(long id){
		List<Article> articles = this.getArticles();
		Article article = articles.stream()
							.filter(a -> a.getId() == id)
							.collect(Collectors.toList()).get(0);
		
		return article;
	}
	
	public List<Article> deleteArticle(long id){
		List<Article> articles = this.getArticles();
		articles.removeIf(p -> p.getId() == id);
		return articles;
	}
	
}
