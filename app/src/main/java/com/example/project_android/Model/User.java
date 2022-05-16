package com.example.project_android.Model;

public class User {
    private String Name;
    private String Password;
    private String Phone;
    private Boolean IsStaff;

    public Boolean getIsStaff() {
        return IsStaff;
    }

    public void setIsStaff(Boolean isStaff) {
        IsStaff = isStaff;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public User(String name, String password, String phone) {
        Name = name;
        Password = password;
        Phone = phone;
    }
    public User(String name, String password)
    {
        Name=name;
        Password=password;
        IsStaff = false;
    }

    public User(){}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
