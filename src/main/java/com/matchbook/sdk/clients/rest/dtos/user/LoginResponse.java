package com.matchbook.sdk.clients.rest.dtos.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.matchbook.sdk.clients.rest.dtos.MatchbookResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponse implements MatchbookResponse {

    @JsonProperty("session-token")
    private String sessionToken;
    @JsonProperty("user-id")
    private long userId;
    private Account account;

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "sessionToken='" + sessionToken + '\'' +
                ", userId=" + userId +
                ", account=" + account +
                '}';
    }
}