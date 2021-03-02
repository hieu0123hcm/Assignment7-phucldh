package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @RequestMapping(value = "/loan/{studentid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LoanDTO>> getLoanByStudentId(@PathVariable("studentid") String studentId) {
        List<LoanDTO> loanDTO = loanService.getLoanByStudentID(studentId);
        if (loanDTO.isEmpty()) {
            return new ResponseEntity<>(loanDTO, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loanDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/loans", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Loan>> findAllLoan() {
        List<Loan> loans = loanService.getAll();
        if (loans.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loans, HttpStatus.OK);
    }
//    @RequestMapping(value = "/loan", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
//    public  ResponseEntity<Integer> insertLoan(@RequestBody LoanDTO loanDTO) {
//
//
//    }
}
