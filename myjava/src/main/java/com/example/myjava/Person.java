package com.example.myjava;

public class Person {
    private int id;
    private String fName;
    private String lName;
    private String citi;
    private String user;
    private String mail;
    private int age;
    private String pass;
    Person (){

    }

    public Person( String fName, String lName, String citi, String user, String mail, int age, String pass) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.citi = citi;
        this.user = user;
        this.mail = mail;
        this.age = age;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCiti() {
        return citi;
    }

    public void setCiti(String citi) {
        this.citi = citi;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
