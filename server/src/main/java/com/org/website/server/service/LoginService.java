package com.org.website.server.service;


public interface LoginService {
    public boolean isAuthorized(String username, String password);
}
