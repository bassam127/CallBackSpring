package com.bassam.callBack;

import java.util.Date;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

public class ArticleLictener {
	@PrePersist
	public void beforrpersit(Article article) {
		article.setDate(new Date());
	}

	@PostPersist
	public void afterpersit() {
		System.out.println("After persist Article");
	}
}
