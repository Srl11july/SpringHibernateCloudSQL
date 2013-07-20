package com.sam.forum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sam.forum.dao.HibernateDaoImpl;
import com.sam.forum.model.Article;


public class SpringhibDemo {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl daoImpl = ctxt.getBean("hibernateDaoImpl",HibernateDaoImpl.class);
	    Article article = new Article();
		
		article.setArticleID("19");
		article.setArticleContent("Hibernate is a pure Java object-relational mapping (ORM) and persistence");
		article.setArticleBy("sam@gamil.com");
		article.setArticleTitle("intro Spring hibernate");
		daoImpl.saveArticle(article);
		/*
		article = null;
		article =  daoImpl.getArticle("19");
		 
		System.out.println("Article Info \n"+article.getArticleContent());*/
		
		//System.out.println("Length : "+daoImpl.getArticle("10"));
	}
	
}
