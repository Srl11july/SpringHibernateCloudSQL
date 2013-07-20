package com.sam.forum.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="article_tab")
@Table(name="article_tab")
public class Article {
	@Id
	private String articleID;
	private String articleTitle;
	private String articleContent;
	private String articleBy;
	
	public String getArticleID() {
		return articleID;
	}
	public void setArticleID(String articleID) {
		this.articleID = articleID;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public String getArticleBy() {
		return articleBy;
	}
	public void setArticleBy(String articleBy) {
		this.articleBy = articleBy;
	}

}
