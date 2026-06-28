/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Lenovo
 */
public class Profile {
    private String studentId;
    private String name;
    private String program;
    private String email;
    private String hobbies;
    private String intro;

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public String getEmail() {
        return email;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getIntro() {
        return intro;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Profile() {
    }
 
    
}
