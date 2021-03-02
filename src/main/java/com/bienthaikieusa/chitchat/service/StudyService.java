package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Study;
import com.bienthaikieusa.chitchat.model.DTO.StudyDTO;

import java.util.List;

public interface StudyService {
    List<Study> findAll();
    List<StudyDTO>  findByStatusAndStudentID(String studentID, String studyStatus);
}
