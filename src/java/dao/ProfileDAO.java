/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Profile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Lenovo
 */


public class ProfileDAO {
    private String url = "jdbc:derby://localhost:1527/student_db";
    private String username = "app";
    private String password = "app";
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    
    
}
    public boolean insertProfile(Profile profile) {
        
        try {
            Connection conn = getConnection();
            String sql = "INSERT INTO profiles "
                + "(student_id, name, program, email, hobbies, intro) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, profile.getStudentId());
            ps.setString(2, profile.getName());
            ps.setString(3, profile.getProgram());
            ps.setString(4, profile.getEmail());
            ps.setString(5, profile.getHobbies());
            ps.setString(6, profile.getIntro());
            
            int rows = ps.executeUpdate();
            ps.close();
            conn.close();

            if (rows > 0) {
                return true;
            }
           

        } catch (SQLException e){
            e.printStackTrace();
        }

        return false;

    }

    public List<Profile> getAllProfiles() {
        
        List<Profile> profileList = new ArrayList<>();

        try {
        
        Connection conn = getConnection();
        String sql = "SELECT * FROM profiles";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            
            Profile profile = new Profile();
            profile.setStudentId(rs.getString("student_id"));
            profile.setName(rs.getString("name"));
            profile.setProgram(rs.getString("program"));
            profile.setEmail(rs.getString("email"));
            profile.setHobbies(rs.getString("hobbies"));
            profile.setIntro(rs.getString("intro"));

        profileList.add(profile);
        }
        
        rs.close();
        ps.close();
        conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

return profileList;

    }


}
