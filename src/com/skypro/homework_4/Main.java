package com.skypro.homework_4;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }


    public static void task1() {
        System.out.println("Задача 1");

        int age = 20;
        System.out.println("Если возраст человека равен " + age + " то:");
        if (age >= 18) {
            System.out.println("он совершеннолетний.");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }

    }
    public static void task2() {
        System.out.println("Задача 2");

        int temp = -8;
        System.out.println("На улице " + temp + " градусов,");
        if (temp > 5) {
            System.out.println("сегодня тепло, можно ходить без шапки.");
        } else {
            System.out.println("на улице холодно, нужно надеть шапку.");
        }

    }
    public static void task3() {
        System.out.println("Задача 3");

        int speed = 50;
        System.out.println("Если скорость " + speed + " км/ч, то");
        if (speed > 60) {
            System.out.println("прдется заплатить штраф.");
        } else {
            System.out.println("можно ездить спокойно");
        }

    }
    public static void task4() {
        System.out.println("Задача 4");

        int age = 24;
        boolean kindergarten = age > 1 && age <7;
        boolean schoolboy = age >= 7 && age < 19;
        boolean student = age > 18 && age < 24;
        boolean worker = age >= 24;
        System.out.println("Если возраст человека равен " + age + " то");
        if (kindergarten) {
            System.out.println("ему нужно ходить в детский сад.");
        } else if (schoolboy){
            System.out.println("ему нужно ходить в школу.");
        } else if (student) {
            System.out.println("ему нужно уиться в университете.");
        } else if (worker) {
            System.out.println("ему нужно идти на работу.");
        } else {
            System.out.println("он еще слишком мал.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");

        int age = 13;
        boolean canNotRide = age < 5;
        boolean rideWithAdults = age >= 5 && age < 14;

        System.out.println("Если возраст ребенка равен " + age + " то");
        if (canNotRide) {
            System.out.println("то он не может кататься на аттракционе.");
        } else if (rideWithAdults) {
            System.out.println("он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("он может кататься без сопровождения взрослого.");
        }

    }
    public static void task6() {
        System.out.println("Задача 6");

        int railwayCarriagePlace = 102;
        int sitPlace = 60;
        int people = 56;
        if (people < railwayCarriagePlace && people < sitPlace) {
            System.out.println("В вагоне еще есть сидячие места.");
        } else if (people < railwayCarriagePlace && people > sitPlace) {
            System.out.println("В вагоне остались только стоячие места.");
        } else {
            System.out.println("Вагон переполнен, мест больше нет.");
        }

    }
    public static void task7() {
        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + three);
        }


    }
}
