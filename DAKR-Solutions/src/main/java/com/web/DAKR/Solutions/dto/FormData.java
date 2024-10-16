package com.web.DAKR.Solutions.dto;

import jakarta.persistence.*;

@Entity
@Table
public class FormData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String goal;
    @Column(nullable=false)
    private String roadmap;

    public FormData(String name, String goal, String roadmap) {
        this.name = name;
        this.goal = goal;
        this.roadmap = roadmap;
    }

    public FormData() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getRoadmap() {
        return roadmap;
    }

    public void setRoadmap(String roadmap) {
        this.roadmap = roadmap;
    }
}
