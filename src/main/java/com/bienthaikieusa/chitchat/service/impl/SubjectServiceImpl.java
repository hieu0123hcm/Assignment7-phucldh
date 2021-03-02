package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Subject;
import com.bienthaikieusa.chitchat.repository.SubjectRepository;
import com.bienthaikieusa.chitchat.service.SubjectSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class SubjectServiceImpl implements SubjectSevice {
    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectServiceImpl(final SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> findAllSubject() {
        return (List<Subject>) subjectRepository.findAll();
    }

    @Override
    public Optional<Subject> findById(String id) {
        return subjectRepository.findById(id);
    }

    @Override
    public Subject updateSubject(Subject subject) {
        Subject existingSubject = subjectRepository.findById(subject.getSubjectid()).orElse(null);
        existingSubject.setSubject(subject.getSubject());
        existingSubject.setTuitionFee(subject.getTuitionFee());
        existingSubject.setDescription(subject.getDescription());
        return subjectRepository.save(existingSubject);
    }

    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void remove(Subject subject) {
        subjectRepository.delete(subject);
    }
}
