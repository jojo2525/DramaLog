package com.dramalog.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.dramalog.repository.DramaRepository;

@Service
public class DramaService {
	
	private final DramaRepository dramaRepo;
	
	public DramaService(DramaRepository dramaRepo) {
		this.dramaRepo = dramaRepo;
	}
	
	List<DramaDetialResponse> getAllDramas(){}
	
	public DramaSummaryResponse 
	public DramaDetailResponse getDramaDetail(Integer dramaID)
}
