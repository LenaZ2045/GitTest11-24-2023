package com.telran.org.lesson16.http;

public enum HttpCodes {

    INFORMATIONAL (100, 199, (code, v) -> System.out.println("http code : " + code + " : " + v)), // 100 - 199 (objects of this class we create in the body of enum
    SUCCESS (200, 299,(code, v) -> System.out.println("http code : " + code + " : " + v)), // 200 - 299
    REDIRECTION (300, 399, (code, v) -> System.out.println("http code : " + code + " : " + v)), // 300 - 399
    CLIENT_ERROR (400, 499, (code, v) -> System.out.println("http code : " + code + " : " + v)), // 400 - 499
    SERVER_ERROR (500, 599, (code, v) -> System.out.println("http code : " + code + " : " + v)); // 500 - 599

    private final int minCode; // create variables of enums
    private final int maxCode; // final variable can not be changed no one can change its meaning
    final Action action;
    public static void printValueByCode(int code) {
        for (HttpCodes value : HttpCodes.values()) {
            //if (ValueRange.of(valueOf().minCode)
            if (code >= value.minCode && code <= value.maxCode) {
                value.doIt(code, value);
            }
        }
    }

        private void doIt(int code, HttpCodes v) {
            action.action(code, v);
        }
    public int getMinCode() {
        return minCode;
    }

    public int getMaxCode() {
        return maxCode;
    }

    HttpCodes(int minCode, int maxCode, Action action) { // we may create also constructor
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.action = action;
    }
}
