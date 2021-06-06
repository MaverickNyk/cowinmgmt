package com.cowinMgmt.model;

import lombok.Data;

import java.util.List;

@Data
public class Session {
    private String sessionId;
    private String date;
    private String availableCapacity;
    private String minAgeLimit;
    private String vaccine;
    private List<String> slots;
    private String availableCapacityDose1;
    private String availableCapacityDose2;
}