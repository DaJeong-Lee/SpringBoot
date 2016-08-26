package com.ldj.SpringBoot2.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ArticleList {
	List<Article> articles = new ArrayList<Article>();
	
	public List<Article> getArticles(){
		Article a1 = new Article();
		a1.setId(1);
		a1.setTitle("a");
		a1.setContent("content1");
		articles.add(a1);
		
		Article a2 = new Article();
		a2.setId(2);
		a2.setTitle("a2");
		a2.setContent("content2");
		articles.add(a2);
		
		return articles;
	}
}
