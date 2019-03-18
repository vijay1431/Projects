package com.com3g.myPm.service.utils;

import org.springframework.security.core.AuthenticationException;

public interface AuthenticationService {

    public void login(String login, String password) throws AuthenticationException;

    public void logout();
    
}
