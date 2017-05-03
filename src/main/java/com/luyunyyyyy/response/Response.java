package com.luyunyyyyy.response;

/**
 * Created by LYY on 2017/5/2.
 */
public class Response {
    private int responseCode;
    private String responseString;

    public int getResponseCode() {
        return responseCode;
    }

    public Response(int responseCode, String responseString) {
        this.responseCode = responseCode;
        this.responseString = responseString;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseString() {
        return responseString;
    }

    public void setResponseString(String responseString) {
        this.responseString = responseString;
    }
}
