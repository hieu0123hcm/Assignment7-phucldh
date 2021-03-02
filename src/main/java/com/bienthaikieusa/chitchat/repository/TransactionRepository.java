package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    @Query("SELECT t FROM Transaction t WHERE LOWER(t.loanId) = LOWER(:loanid) ORDER BY t.id DESC")
    public List<Transaction> findByLoanId(@Param("loanid") Long loanId);
}
