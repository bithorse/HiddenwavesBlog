package com.hiddenwaves.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {

    private String token;
    public JwtToken(String jwt){
        this.token=jwt;
    }

    @Override      //首要的
    public Object getPrincipal() {
        return token;
    }

    @Override      //资格证明
    public Object getCredentials() {
        return token;
    }
}
