package com.java.spring;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "good fortune";
    }
}
