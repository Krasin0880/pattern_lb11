package com.company;

public class Main {

    public static void main(String[] args) {
    Page google = new ProxyPage("google.com");
    Page twitter = new ProxyPage("twitter.com");

    google.displayPage();
    twitter.displayPage();
    }
}
