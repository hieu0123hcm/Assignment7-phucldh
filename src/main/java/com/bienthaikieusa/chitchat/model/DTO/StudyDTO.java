package com.bienthaikieusa.chitchat.model.DTO;

import javax.persistence.Column;

public class StudyDTO {
    private Long id;
    private String subjectID;
    private String studentID;
    private String studyStatus;
    private String subject;
    private int semesterNo;

    private float tuitionFee;

    public StudyDTO(Long id, String subjectID, String studentID, String studyStatus, String subject, int semesterNo, float tuitionFee) {
        this.id = id;
        this.subjectID = subjectID;
        this.studentID = studentID;
        this.studyStatus = studyStatus;
        this.subject = subject;
        this.semesterNo = semesterNo;
        this.tuitionFee = tuitionFee;
    }

    public StudyDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

    public float getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(float tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
}
