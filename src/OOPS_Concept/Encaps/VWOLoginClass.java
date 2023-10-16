package OOPS_Concept.Encaps;

import java.sql.SQLOutput;

public class VWOLoginClass {

    private String username;
    private String password;

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    VWOLoginClass(String u, String p) {
        this.username = u;
        this.password = p;
    }
    boolean isLoggedIn(String username, String password)
    {
        if (this.username.toLowerCase().equals(username)&& this.password.equals(password))
        {
            System.out.println("Yes you are valid user...");
            return true;
        }
        else {
            System.out.println("Wrong User....");
            return false;
        }
    }
}
