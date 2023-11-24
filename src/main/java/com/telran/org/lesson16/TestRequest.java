package com.telran.org.lesson16;

import java.util.function.Function;

public class TestRequest {
    public static void main(String[] args) {
        Request request = new Request("hello", 545);

        // Message is : 'message', number is : 'number'

        Function<Request, String> function = (request1) -> "Message is :" + request1.getMessage() +", number is : "+ request1.getNumber();

        String result = function.apply(request);
        System.out.println(result);

        MessageRequest messageRequest = new MessageRequest();
        String resultRequest = messageRequest.apply(request);
        System.out.println(resultRequest);
    }
}
