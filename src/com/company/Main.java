package com.company;

public class Main {

    public static void main(String[] args) {
        ///Задание 1:
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        ///Задание 2:
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        ///Задание 3:
        int year = 2021;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " - высокосный год!");
        } else {
            System.out.println(year + " - не высокосный год!");
        }
        ///Задание 4:
        int deliveryDistance = 61;
        int baseDistance = 20;
        int interval = 40;
        boolean plusCondition = (deliveryDistance > baseDistance);
        if ((deliveryDistance - baseDistance) % 40 == 0 && plusCondition) {
            System.out.println("Дней до доставки -  " + ((((deliveryDistance - baseDistance)) / interval) + 1));
        } else if ((deliveryDistance - baseDistance) % 40 != 0 && plusCondition) {
            System.out.println("Дней до доставки -  " + ((((deliveryDistance - baseDistance)) / interval) + 2));
        } else {
            System.out.println("Дней до доставки - 1");
        }
        ///Задание 5:
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Указанный тобой месяц принадлежит зимнему периоду!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Указанный тобой месяц принадлежит весеннему периоду!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Указанный тобой месяц принадлежит летнему периоду!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Указанный тобой месяц принадлежит осеннему периоду!");
                break;
            case 12:
                System.out.println("Указанный тобой месяц принадлежит зимнему периоду!");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}