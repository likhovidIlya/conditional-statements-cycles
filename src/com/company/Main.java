package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Введите название задачи");
            String task = scanner.nextLine();
            //пишем код с пунктов 7, 9, 10, 11, 12, 13, 14 здесь внутри цикла
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = scanner.nextInt();
            System.out.println("Сколько часов потребуется на выполнение?");
            int hours = scanner.nextInt();
            System.out.println("Сколько минут потребуется на выполнение?");
            int minutes = scanner.nextInt();
            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime = totalTime + currentTimeTask;
            if (biggestTime < currentTimeTask) biggestTime = currentTimeTask;
            if (smallestTime > currentTimeTask) smallestTime = currentTimeTask;
            System.out.println("Для завершения работы программы введите `end` для продолжения нажмите enter");
            scanner.nextLine();
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
        }
        System.out.println("Всего потребуется:" + totalTime + " секунд");
        System.out.println("Самая короткая задача:" + smallestTime + " секунд");
        System.out.println("Самая продолжительная задача:" + biggestTime + " секунд");

    }


    public static int convertToSeconds(int days, int hours, int minutes) {
        int seconds = days * 24 * 3600 + hours * 3600 + minutes * 60;
        return seconds;
    }
}

    /*public static int convertToSeconds(int days, int hours, int minutes)
    {   int seconds;
        days *= 86400;
        hours *= 3600;
        minutes *= 60;
        seconds = days + hours + minutes;
        return seconds;
    }*/