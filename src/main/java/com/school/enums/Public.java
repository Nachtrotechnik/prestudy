package com.school.enums;

public enum Public {
    GOVERNMENT("Government Entity"),
    MEDIA("Media Entity"),
    PARENTS("Parents Entity"),
    COMMUNITY("Community Entity");

    private String contact;

    Public(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return contact;
    }
}