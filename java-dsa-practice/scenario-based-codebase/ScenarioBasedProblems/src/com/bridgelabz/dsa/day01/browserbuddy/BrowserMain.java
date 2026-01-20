package com.bridgelabz.dsa.day01.browserbuddy;

public class BrowserMain {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");
        browser.back();
        browser.forward();
        browser.closeTab();
        browser.restoreTab();
    }
}
