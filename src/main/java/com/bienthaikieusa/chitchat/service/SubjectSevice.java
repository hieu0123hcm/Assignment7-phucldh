package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectSevice {
    List<Subject> findAllSubject();

    Optional<Subject> findById(String id);

    Subject updateSubject(Subject subject);

    Subject save(Subject subject);

    void remove(Subject subject);
}
