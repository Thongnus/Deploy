package com.example.api;

import com.example.api.Config.TwilioConfig;
import com.example.api.Service.NewService;
import com.example.api.Service.Serviceimpl.NewService_Impl;
import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// test pullsásff
@SpringBootApplication
public class ApiApplication {
    @Autowired
    TwilioConfig twilioConfig;
    @Autowired
    NewService service;

    @PostConstruct
    public void TwilioInit() {

        Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
    }

    public static void main(

            String[] args) {

        SpringApplication.run(ApiApplication.class, args);
    }

}
