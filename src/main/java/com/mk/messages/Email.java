package com.mk.messages;

public class Email {

    private String name;
    private String text;

    public Email() {
    }

    public Email(String to, String body) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Email{name=%s, text=%s}", getName(), getText());
    }

}

