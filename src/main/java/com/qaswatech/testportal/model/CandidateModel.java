/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.testportal.model;

/**
 *
 * @author Hp
 */
public class CandidateModel {
    int id;
    String name;
    String phone;
    String email;
    String college;
    String address;
    String degree;
    String semester;
    int fees;
    String city;
    String state;
    String CreatedAt;
    String ModifiedAt;

    public CandidateModel(int id, String name, String phone, String email, String college, String address, String degree, String semester, int fees, String city, String state, String CreatedAt, String ModifiedAt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.college = college;
        this.address = address;
        this.degree = degree;
        this.semester = semester;
        this.fees = fees;
        this.city = city;
        this.state = state;
        this.CreatedAt = CreatedAt;
        this.ModifiedAt = ModifiedAt;
    }


    public CandidateModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    public void setModifiedAt(String ModifiedAt) {
        this.ModifiedAt = ModifiedAt;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCollege() {
        return college;
    }

    public String getAddress() {
        return address;
    }

    public String getDegree() {
        return degree;
    }

    public String getSemester() {
        return semester;
    }

    public int getFees() {
        return fees;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

   

    public String getModifiedAt() {
        return ModifiedAt;
    }
    
    
}
