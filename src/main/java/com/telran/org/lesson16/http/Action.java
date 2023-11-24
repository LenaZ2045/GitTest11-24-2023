package com.telran.org.lesson16.http;
@FunctionalInterface // only one method which may be overwritten
public interface Action {

    void action(int code, HttpCodes httpCodes);


}
