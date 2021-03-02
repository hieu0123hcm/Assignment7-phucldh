package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "subject")
public class Subject implements Serializable {


    @Id
    private String subjectid;
    @Column(name="tuitionfee")
    private float tuitionFee;

    @Column(name="subject")
    private String subject;

    @Column(name="description")
    private String description;

    public Subject(){};

    public Subject(String subjectid, float tuitionFee, String subject, String description) {
        this.subjectid = subjectid;
        this.tuitionFee = tuitionFee;
        this.subject = subject;
        this.description = description;
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    public float getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(float tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject1 = (Subject) o;
        return Float.compare(subject1.tuitionFee, tuitionFee) == 0 &&
                Objects.equals(subjectid, subject1.subjectid) &&
                Objects.equals(subject, subject1.subject) &&
                Objects.equals(description, subject1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectid, tuitionFee, subject, description);
    }
}