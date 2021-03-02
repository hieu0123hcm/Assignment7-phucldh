package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "loanbundle")
public class LoanBundle implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bundleId;

    @Column(name = "rate")
    private int rate;

    public LoanBundle() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getBundleId() {
        return bundleId;
    }

    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
