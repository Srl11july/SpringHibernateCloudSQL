package com.sam.forum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sam.forum.model.Article;

@Repository
public class HibernateDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Article getArticle(String articleID){
		return (Article) getSessionFactory().openSession().get(Article.class, articleID);
	}
	public void saveArticle(Article article){
		System.out.println("saveArticle......"+article.getArticleID());
		Session session =  getSessionFactory().openSession();
		session.beginTransaction();
		session.save(article);
		session.getTransaction().commit();
		session.close();		
	}
}
