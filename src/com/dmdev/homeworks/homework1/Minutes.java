package com.dmdev.homeworks.homework1;

public class Minutes {

    public static void main(String[] args) {
        int minutes = 69;
        checkQuarter(minutes);
    }

    private static void checkQuarter(int minutes) {
        if (minutes >=0 && minutes <15)
            System.out.println("Первая четверть");
        else if (minutes >=15 && minutes <30)
            System.out.println("Вторая четверть");
        else if (minutes >=30 && minutes <45)
            System.out.println("Третья четверть");
        else if (minutes >=45 && minutes <=59)
            System.out.println("Четвертая четверть");
        else
            System.out.println("Неверное количество минут");
    }

}
