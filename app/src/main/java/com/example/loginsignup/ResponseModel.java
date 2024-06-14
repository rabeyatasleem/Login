package com.example.loginsignup;

public class ResponseModel {
    private String error;
    private String token;

    public ResponseModel(String error, String token) {
        this.error = error;
        this.token = token;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
