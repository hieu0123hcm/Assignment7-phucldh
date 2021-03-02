package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Loan;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


public interface LoanService {
    List<LoanDTO> getLoanByStudentID(String studentId);
    List<Loan> getAll();
    //int insertLoan(int loan_id, String studentid , int bundleid,
      //             int amountreturned, String loanstatus, int amount, Date expireddate,Date loandate);
}
