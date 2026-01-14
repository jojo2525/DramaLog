package com.dramalog.dto;

import java.math.BigDecimal;

public class ReviewCreateRequest {
	private Integer userID;
	private Integer episodeSelected;
	private BigDecimal rating;
	private Integer watchStatus;
	private String content;
	
	public Integer getUserID() {return userID;}
	public Integer getEpisodeSelected() {return episodeSelected;}
	public BigDecimal getRating() {return rating;}
	public Integer getWatchStatus() {return watchStatus;}
	public String getContent() {return content;}
	
	public void setUserID(Integer userID) {this.userID = userID;}
	public void setEpisodeSelected(Integer episodeSelected) {this.episodeSelected = episodeSelected;}
	public void setRating(BigDecimal rating) {this.rating = rating;}
	public void setWatchStatus(Integer watchStatus) {this.watchStatus = watchStatus;}
	public void setContent(String content) {this.content = content;}
}
