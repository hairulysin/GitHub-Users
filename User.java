package com.example.github_users_f55121011;

public class User {
    private  String photo;
    private String name;
    private String type;

    public  String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String Photo){
        this.photo = photo;
    }
    public  void  setName (String name){
        this.name = name;
    }
    public void  setType (String type) {
        this.type = type;
    }
}
