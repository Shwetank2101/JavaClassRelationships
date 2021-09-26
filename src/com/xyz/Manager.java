package com.xyz;

public class Manager implements Role{
    String role = "Business administrator";
    String responsiblity = "1. Managers are responsible for the processes of\n" + "" +
            "2. Getting activities completed efficiently with and through other\n" +
            "3. People and setting and achieving the firm's goals through the execution of four basic management functions: planning, organizing, leading, and controlling.";

    public String getRoleName(){
        return role;
    }

    public String getResponsibility(){
        return responsiblity;
    }
}
