package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Study;
import com.bienthaikieusa.chitchat.model.DTO.StudyDTO;
import com.bienthaikieusa.chitchat.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudyController {

    @Autowired
    private StudyService studyService;

    @RequestMapping(value = "/studying", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Study>> findAllStudying(){
        List<Study> studies = studyService.findAll();
        if(studies.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studies, HttpStatus.OK);
    }

    @RequestMapping(value = "/studying/{studentID}/{studyStatus}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudyDTO>> getFailedStudying(@PathVariable("studentID") String studentID, @PathVariable("studyStatus") String studyStatus) {
        List<StudyDTO>  studies = studyService.findByStatusAndStudentID(studentID, studyStatus);
        if(studies.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studies, HttpStatus.OK);
    }
}
