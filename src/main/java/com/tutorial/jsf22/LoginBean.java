package com.tutorial.jsf22;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="loginBean")
public class LoginBean
{
    private String name;
    private String password;


    public String getName ()
    {
        return name;
    }


    public void setName (final String name)
    {
        this.name = name;
    }


    public String getPassword ()
    {
        return password;
    }


    public void setPassword (final String password)
    {
        this.password = password;
    }
}