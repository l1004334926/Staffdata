package com.example.demo.entity;

public class Staff {
    private String usercode;
    private String username;
    private String department;

    public Staff() {
        super();

    }
    public Staff(String usercode, String username, String department) {
        this.usercode = usercode;
        this.username = username;
        this.department = department;
    }
    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "[{usercode:" + usercode + ", username:" + username + ", department:" + department + "}]";
    }
}
