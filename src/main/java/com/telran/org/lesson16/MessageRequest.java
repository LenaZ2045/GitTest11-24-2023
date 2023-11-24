package com.telran.org.lesson16;

import java.util.function.Function;

public class MessageRequest implements Function<Request, String> {

    @Override
    public String apply(Request request){
        return String.format("Message is : %s, number is : %d", request.getMessage(), request.getNumber());
    };
}
