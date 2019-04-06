package com.Никита.lesson_8;

import java.io.IOException;

public class illlin {
    public static class MyLogger {
        public void methodThrowExceptions() throws NullPointerException, NoSuchFieldException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new NullPointerException();
            }
            if (i == 1) {
                throw new NoSuchFieldException();
            }
            if (i == 2) {
                throw new IOException();
            }
        }
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }
    }
}
