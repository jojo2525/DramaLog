package com.dramalog.dto;

import java.math.BigDecimal;

public class DramaSummaryResponse {
    private Integer dramaId;
    private String title;
    private String genre;
    private String coverImage;
    private BigDecimal avgRating;

    public DramaSummaryResponse(Integer dramaId, String title, String genre, String coverImage, BigDecimal avgRating) {
        this.dramaId = dramaId;
        this.title = title;
        this.genre = genre;
        this.coverImage = coverImage;
        this.avgRating = avgRating;
    }

    public Integer getDramaId() { return dramaId; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getCoverImage() { return coverImage; }
    public BigDecimal getAvgRating() { return avgRating; }
}
