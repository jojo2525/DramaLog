package com.dramalog.dto;

import java.math.BigDecimal;

public class DramaDetailResponse {
    private Integer dramaId;
    private String title;
    private String writer;
    private String genre;
    private String synopsis;
    private String mainActor1;
    private String mainActor2;
    private Integer releaseDate;
    private Integer episodeCount;
    private String coverImage;
    private BigDecimal avgRating;
    private Integer hotEpisode;

    public DramaDetailResponse(
            Integer dramaId, String title, String writer, String genre, String synopsis,
            String mainActor1, String mainActor2, Integer releaseDate, Integer episodeCount,
            String coverImage, BigDecimal avgRating, Integer hotEpisode
    ) {
        this.dramaId = dramaId;
        this.title = title;
        this.writer = writer;
        this.genre = genre;
        this.synopsis = synopsis;
        this.mainActor1 = mainActor1;
        this.mainActor2 = mainActor2;
        this.releaseDate = releaseDate;
        this.episodeCount = episodeCount;
        this.coverImage = coverImage;
        this.avgRating = avgRating;
        this.hotEpisode = hotEpisode;
    }

    public Integer getDramaId() { return dramaId; }
    public String getTitle() { return title; }
    public String getWriter() { return writer; }
    public String getGenre() { return genre; }
    public String getSynopsis() { return synopsis; }
    public String getMainActor1() { return mainActor1; }
    public String getMainActor2() { return mainActor2; }
    public Integer getReleaseDate() { return releaseDate; }
    public Integer getEpisodeCount() { return episodeCount; }
    public String getCoverImage() { return coverImage; }
    public BigDecimal getAvgRating() { return avgRating; }
    public Integer getHotEpisode() { return hotEpisode; }
}
