package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.model.Study;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyRepository extends CrudRepository<Study, Long> {

//    @Query("SELECT s FROM Study s WHERE LOWER(s.studentID) = LOWER(:studentid) AND LOWER(s.studyStatus) = LOWER(:studystatus) ORDER BY s.id DESC")
//    public List<Study> find(@Param("studentid") String studentID, @Param("studystatus") String studyStatus);


    @Query("SELECT s, t.tuitionFee FROM Study s JOIN Subject t ON s.subjectID = t.subjectid WHERE LOWER(s.studentID) = LOWER(:studentid) AND LOWER(s.studyStatus) = LOWER(:studystatus)" )
    public List<Study> find(@Param("studentid") String studentID, @Param("studystatus") String studyStatus);
}
