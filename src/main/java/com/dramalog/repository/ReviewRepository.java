package com.dramalog.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dramalog.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
	
	// List<Review> findByEpisode(Integer dramaId, Integer episodeSelected);
	// List<Review> findByDrama(Integer dramaId);
	List<Review> findByDramaIdAndEpisodeSelected(Integer dramaId, Integer episodeSelected);
	List<Review> findByDramaId(Integer dramaId);
	List<Review> findByUserId(Integer userId);
}
