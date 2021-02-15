package com.example.girish.exerzone;

import android.provider.ContactsContract;

public class saveData {
    String name , email ,feedback ;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String name){
        this.email=email;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String name){
        this.feedback=feedback;
    }
    public saveData(String name,String email,String feedback){

        this.name=name;
        this.feedback=feedback;
        this.email=email;
    }
}
