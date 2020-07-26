package com.circl.civic;

public class UserInformation {

    public String name;
    public String lastname;
    public String phoneno;

    public UserInformation(){
    }

    public UserInformation(String name, String lastname, String phoneno){
        this.name = name;
        this.lastname = lastname;
        this.phoneno = phoneno;
    }
    public String getUserName() {
        return name;
    }
    public String getUserLastname() {
        return lastname;
    }
    public String getUserPhoneno() {
        return phoneno;
    }
}
