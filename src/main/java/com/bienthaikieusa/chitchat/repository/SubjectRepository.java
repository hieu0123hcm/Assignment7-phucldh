package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Study;
import com.bienthaikieusa.chitchat.model.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, String> {
    @Query("SELECT s.tuitionFee  FROM Subject s WHERE LOWER(s.subjectid) = LOWER(:subjectid)")
    public float findSubjectTuitionFee(@Param("subjectid") String subjectID);
}
