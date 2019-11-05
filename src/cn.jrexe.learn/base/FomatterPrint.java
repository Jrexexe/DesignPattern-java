package cn.jrexe.learn.base;

import java.time.LocalDateTime;

public class FomatterPrint {
    public static void main(String[] args) {

        System.out.printf("%s \n", LocalDateTime.now().getYear());
        System.out.printf("%s \n", LocalDateTime.now().getDayOfMonth());
        System.out.printf("%s \n", LocalDateTime.now().getDayOfWeek());
        System.out.printf("%s \n", LocalDateTime.now().getDayOfYear());
    }
}
