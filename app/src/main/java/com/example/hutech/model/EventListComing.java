package com.example.hutech.model;

import com.google.firebase.Timestamp;
import com.google.gson.annotations.SerializedName;

public class EventListComing {
    private String id;
    private String name;
    private String description;
    private String location;
    private String poster;
    private String faculty;
    private Timestamp beginTime;
    private Long quantity;

    // Constructor
    public EventListComing(String id, String name, String description, String location, String poster, String faculty, Timestamp beginTime, Long quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.poster = poster;
        this.faculty = faculty;
        this.beginTime = beginTime;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
