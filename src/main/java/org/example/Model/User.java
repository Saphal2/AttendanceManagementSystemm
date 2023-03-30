package org.example.Model;

public class Attendance {
    Integer ID;
    String Username;
    String Password;

    public Attendance(Integer ID, String username, String password) {
        this.ID = ID;
        Username = username;
        Password = password;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
