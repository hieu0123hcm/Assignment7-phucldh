package com.bienthaikieusa.chitchat.model.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class LoanDTO {

    private Long loanId;
    private Date loanDate;
    private String studentId;
    private Date expiredDate;
    private Long bundleId;
    private Long amount;
    private String loanStatus;
    private Long amountReturned;
    private int rate;

    public LoanDTO() {
    }

    public Long getloanId() {
        return loanId;
    }

    public void setloanId(Long loanId) {
        this.loanId = loanId;
    }

    public Date getDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Long getBundleId() {
        return bundleId;
    }

    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getloanStatus() {
        return loanStatus;
    }

    public void setloanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public Long getAmountReturned() {
        return amountReturned;
    }

    public void setAmountReturned(Long amountReturned) {
        this.amountReturned = amountReturned;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
