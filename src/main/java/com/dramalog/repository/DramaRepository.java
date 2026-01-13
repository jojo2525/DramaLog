package com.dramalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dramalog.model.Drama;

public interface DramaRepository extends JpaRepository<Drama, Integer> {
	
}
