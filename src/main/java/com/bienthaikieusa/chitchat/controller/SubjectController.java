package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Subject;
import com.bienthaikieusa.chitchat.service.SubjectSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectController {

    @Autowired
    private SubjectSevice service;

    @RequestMapping(value = "/addSubject", method = RequestMethod.POST)
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
        Subject sub = service.save(subject);
        return new ResponseEntity<>(sub, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/subjects", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Subject>> findAllSubject() {
        List<Subject> list = service.findAllSubject();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/subject/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subject> findById(@PathVariable String id) {
        Optional<Subject> subject =  service.findById(id);

        if (!subject.isPresent()) {
            return new ResponseEntity<>(subject.get(), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(subject.get(), HttpStatus.OK);
    }

    @RequestMapping( value = "/update", method =  RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subject> updateSubject(@RequestBody Subject subject) {
        Subject updatesub = service.updateSubject(subject);
        if(updatesub != null ) {
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>( HttpStatus.OK);
    }
    @RequestMapping( value = "/delete/{id}", method =  RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subject> deleteSubject(@PathVariable("id") String id) {
        Optional<Subject> findBysubject = service.findById(id);
        if (!findBysubject.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.remove(findBysubject.get());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
