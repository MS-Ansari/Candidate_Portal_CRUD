/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.testportal.service;

import com.qaswatech.testportal.dao.CandidateDao;
import com.qaswatech.testportal.model.CandidateModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class CandidateService {
    public String insertcandidate(CandidateModel cm) throws SQLException{
        CandidateDao cd = new CandidateDao();
        return cd.insertcandidate(cm);
        
    }
    public ArrayList<CandidateModel>selectAll() throws SQLException{
        CandidateDao cd  = new CandidateDao();
        return cd.selectAll();
    }

    public CandidateModel selectById(int id) {
        CandidateDao cd = new CandidateDao();
        return cd.selectById(id);
    }
    public String UpdateCandidate(CandidateModel cm){
        CandidateDao cd = new CandidateDao();
        return cd.UpdateCandidate(cm);
    }
    public String DeleteCandidate(int id){
        CandidateDao cd = new CandidateDao();
        return cd.DeleteCandidate(id);
    }
    
    public int login(String phone , String password){
        CandidateDao cd  = new CandidateDao();
        return cd.login(phone,password);
    }
}
