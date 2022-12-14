package com.knoldus.java8.function;

import java.io.IOException;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.callFunctionWithException();
    }

    private void callFunctionWithException() throws IOException {
        System.out.println(add.apply(1));
        System.out.println(addWithException.apply(1));
    }

    private final Function<Integer, Integer> add = x -> x + 1;

    private final FunctionWithException<Integer, Integer, IOException> addWithException = (
            x) -> {
        if(x == 1){
            throw new IOException();
        }
        return x + 1;
    };
}