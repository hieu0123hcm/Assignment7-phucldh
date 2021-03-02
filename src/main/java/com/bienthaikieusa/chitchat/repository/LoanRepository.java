package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long> {
    @Query("SELECT l FROM Loan l WHERE LOWER(l.studentId) = LOWER(:studentid) ORDER BY l.loanId DESC")
    public List<Loan> findByStudentID(@Param("studentid") String studentid);
//    @Query(value =
//            "insert into Loan (loan_id,studentid , bundleid, amountreturned,loanstatus,amount,expireddate,loandate) " +
//                    "values (:name, :age, :email, :status)",
//            nativeQuery = true)
//    int insertLoan(@Param("loan_id") int loan_id,
//                    @Param("studentid") String studentid,
//                    @Param("bundleid") int bundleid,
//                    @Param("amountreturned") int amountreturned,
//                    @Param("loanstatus") String loanstatus,
//                    @Param("amount") int amount,
//                    @Param("expireddate") Date expireddate,
//                    @Param("loandate") Date loandate
//    );
}
