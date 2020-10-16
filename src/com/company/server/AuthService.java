package com.company.server;

public interface AuthService {
    String getNicknameByLoginAndPassword(String login, String password);
}
