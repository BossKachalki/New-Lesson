package com.Никита.lesson_8;
import java.lang.NullPointerException;
import java.io.IOException;
import java.lang.NoSuchFieldException;

public class lilin {
    public static illlin.MyLogger logger = new illlin.MyLogger();
    public static void main(String[] args) {
        try {
            processExceptions();
        } catch (NullPointerException e) {
            logger.log(e); }
    }
    public static void processExceptions() {
        try {
            logger.methodThrowExceptions();
        } catch (NullPointerException e) {
            throw e;
        }  catch (NoSuchFieldException m) {
            logger.log(m);
        } catch (IOException j) {
            logger.log(j);
        }
    }
}
