package com.xyz;

public class Ceo implements Role{
    String role = "Chief executive officer";
    String responsiblity = "1. Communicating, on behalf of the company, with shareholders, government entities, and the public.\n" +
            "2. Leading the development of the company's short- and long-term strategy.\n" +
            "3. Creating and implementing the company or organization's vision and mission.";
    public String getRoleName(){
        return role;
    }

    public String getResponsibility(){
        return responsiblity;
    }
}
