package com.dramalog.service;

import org.springframework.stereotype.Service;
import com.dramalog.model.User;
import com.dramalog.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
public class AuthService {
	
	private final UserRepository userRepo;
	
	public AuthService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Transactional
	public User loginRegister(String name, String pin4) {
		// 로그인 시도
        return userRepo.findByNameAndPin4(name, pin4)
                .map(user -> {
                    System.out.println(name + "님, 로그인되었습니다.");               
                    return user;
                })
                .orElseGet(() -> {
                    // 회원가입
                    User newUser = new User();
                    newUser.setName(name);
                    newUser.setPin4(pin4);

                    User saved = userRepo.save(newUser);
                    System.out.println(name + "님, 회원가입되었습니다.");
                    return saved;
                });
	}
}
