package com.example.bankapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
	Optional<Account> findByUsername(String username);
	
}
