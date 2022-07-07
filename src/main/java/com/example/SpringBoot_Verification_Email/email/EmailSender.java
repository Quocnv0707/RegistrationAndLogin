package com.example.SpringBoot_Verification_Email.email;

public interface EmailSender {
    void send(String to, String email);
}
