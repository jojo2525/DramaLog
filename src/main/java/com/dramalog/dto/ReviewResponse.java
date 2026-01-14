package com.dramalog.dto;

import java.math.BigDecimal;

public class ReviewResponse {
	private Integer reviewID;
	private Integer dramaID;
	private Integer userID;
	private Integer episodeSelected;
	private BigDecimal rating;
	private Integer watchStatus;
	private String content;
	
	public ReviewResponse(Integer reviewID, Integer dramaID, Integer userID, Integer episodeSelected, BigDecimal rating,
			Integer watchStatus, String content) {
		this.reviewID = reviewID;
		this.dramaID = dramaID;
		this.userID = userID;
		this.episodeSelected = episodeSelected;
		this.rating = rating;
		this.watchStatus = watchStatus;
		this.content = content;
	}

	public Integer getReviewID() {return reviewID;}
	public Integer getDramaID() {return dramaID;}
	public Integer getUserID() {return userID;}
	public Integer getEpisodeSelected() {return episodeSelected;}
	public BigDecimal getRating() {return rating;}
	public Integer getWatchStatus() {return watchStatus;}
	public String getContent() {return content;}
}
