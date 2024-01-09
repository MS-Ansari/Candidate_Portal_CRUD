/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.testportal.dao;

import com.qaswatech.testportal.database.DataBase;
import com.qaswatech.testportal.model.CandidateModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class CandidateDao {
    String sql = null;
    String message = null;
    CallableStatement cs = null;
    ResultSet rs = null;
    
    public String insertcandidate(CandidateModel cm) throws SQLException{
        Connection con = DataBase.connectDb();
        try{ // for inter 
            
            sql = "insert into candidate(name, phone, email, college, address, degree, semester, fees, city, state)"
                    +"values(?,?,?,?,?,?,?,?,?,?)";
            cs = con.prepareCall(sql);
            cs.setString(1, cm.getName());
            cs.setString(2,cm.getPhone());
            cs.setString(3,cm.getEmail());
            cs.setString(4,cm.getCollege());
            cs.setString(5,cm.getAddress());
            cs.setString(6,cm.getDegree());
            cs.setString(7,cm.getSemester());
            cs.setInt(8,cm.getFees());
            cs.setString(9,cm.getCity());
            cs.setString(10,cm.getState());
            
            int rows= cs.executeUpdate();
            if(rows>=1){
                message = "Record Insert Successfully";
            }
        } catch(Exception e ){
            message = "unable to insert "+ e.getMessage();
        }finally{
            if(con != null)
                try{
                    con.close();
                }catch(SQLException ex){
                    
                }
        }
        
        return message;
    }

  

    public ArrayList<CandidateModel> selectAll() throws SQLException {

        ArrayList<CandidateModel> candidates = new ArrayList();
        Connection con = DataBase.connectDb();
        try{
            sql ="select * from candidate";
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();
            
            while(rs .next()){
                candidates.add(
                        
                        new CandidateModel(
                        
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("phone"),
                                rs.getString("email"),
                                rs.getString("college"),
                                rs.getString("address"),
                                rs.getString("degree"),
                                rs.getString("semester"),
                                rs.getInt("fees"),
                                rs.getString("city"),
                                rs.getString("state"),
                                rs.getString("created_at"),
                                rs.getString("modified_at")
                                
                        )
                );
                
            
        } 
        
    }catch(SQLException e){
            System.out.println("com.qaswatech.testportal.CandidateDao.selectAll() :"+ e.getMessage());
        
    }finally{
            if(con !=null){
                try{
                    con.close();
                }
                catch(SQLException ex){
                    
                }
            }
            
        }
        return candidates;
    }
    public CandidateModel selectById(int id){
        Connection con = DataBase.connectDb();
        CandidateModel candidate = null;
        try {
            sql=" select * from candidate where id= " +id;
            cs= con.prepareCall(sql);
            rs= cs.executeQuery();
            while(rs.next()){
                candidate = new CandidateModel(
                
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("college"),
                        rs.getString("address"),
                        rs.getString("degree"),
                        rs.getString("semester"),
                        rs.getInt("fees"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("created_at"),
                        rs.getString("modified_at")
                );
            }
                  
        } catch (Exception e) {
            System.out.println("com.qaswatech.testportal.dao.CandidateDao.selectById()"+e.getMessage());
        }finally{
            if(con!= null){
                try {
                    con.close();
                } catch (Exception ex) {
                }
            }
        }
        return candidate;

}
    public String UpdateCandidate(CandidateModel cm){
        Connection con = DataBase.connectDb();
        
        try {
            sql="Update Candidate Set name=?, phone=?, email=?,college=?,address=?,degree=?,semester=?,fees=?,city=?,state=? where id =?";
            cs=con.prepareCall(sql);
            cs.setString(1, cm.getName());
            cs.setString(2, cm.getPhone());
            cs.setString(3, cm.getEmail());
            cs.setString(4, cm.getCollege());
            cs.setString(5, cm.getAddress());
            cs.setString(6, cm.getDegree());
            cs.setString(7, cm.getSemester());
            cs.setInt(8, cm.getFees());
            cs.setString(9, cm.getCity());
            cs.setString(10, cm.getState());
            cs.setInt(11, cm.getId());
            
            int rows= cs.executeUpdate();
            if(rows>=1){
                message="Record Update Successfully !";
            }
        
        } catch (Exception ex) {
            message="unable to update because : "+ ex.getMessage();   
        }finally{
            if(con!=null){
                try {
                    con.close();
                } catch (Exception ex) {
                }
            }
        }
    
    
    return message;
}
    
    public String DeleteCandidate(int id){
        Connection con = DataBase.connectDb();
        try {
            sql = "delete from candidate where id  = "+ id;
            cs=con.prepareCall(sql);
            int rows = cs.executeUpdate();
            if(rows>=1){
                message="Record delete successfully";
            
        }
        } catch (Exception e) {
            message = "unable to delete bcz :"+ e.getMessage();
        }finally{
            if(con != null){
                try {
                    con.close();
                } catch (Exception ex) {
                }
            }
    
        }
        return message;
    }
    public int login(String phone , String password){
        Connection con  = DataBase.connectDb();
        int status  = 0;
        try {
            sql = "select * from admin where phone=? AND password=?";
            cs = con.prepareCall(sql);
            cs.setString(1, phone);
            cs.setString(2, password);
            rs=cs.executeQuery();
            while(rs.next()){
                status = 1;
            }
        } catch (Exception e) {
            System.out.println("com.qaswatech.testportal.dao.CandidateDao.login()"+e.getMessage());
        }finally{
            if(con != null){
                try {
                    con.close();
                } catch (Exception ex) {
                }
            }
        }
        return status;
    }
    
}
