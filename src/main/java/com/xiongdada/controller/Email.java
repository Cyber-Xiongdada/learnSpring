package com.xiongdada.controller;

import javax.servlet.http.HttpServlet;

/**
 * auth : xiongdada
 * date : 2024/6/5
 **/
public class Email implements Message {
    @Override
    public void send() {
        System.out.println("Email send");
    }

    @Override
    public void send2() {
        System.out.println("Email send2");
    }
}
