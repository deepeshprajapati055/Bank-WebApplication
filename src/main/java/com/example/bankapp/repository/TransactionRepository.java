package com.example.bankapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
	List<Transaction> findByAccountId(Long accountId);
	
}
