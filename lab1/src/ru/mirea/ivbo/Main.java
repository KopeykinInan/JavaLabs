package ru.mirea.ivbo;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        for (var arg: args) {
            System.out.println(arg);
        }

        sum();
        maxAndMin();
        garmon();
        factorial();
    }

    private static void sum(){
        System.out.println("Поиск среднего арифметического и  расчет суммы всех элементов \n"
                          +"============================================================= \n"
                          +"Введите количество элементов массива");
        var arraySize = sc.nextInt();
        int[] mass = new int[arraySize];
        System.out.println("Введите элементы массива");
        for(int i = 0; i< mass.length; i++){
            System.out.printf("элемент %d = ",i+1);
            mass[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i: mass){
            sum+=i;
        }
        System.out.println("Сумма: "+sum+"\n"+"Среднее арифметическое = "+ (double) sum /mass.length + "\n");
    }

    private static void maxAndMin(){
        System.out.println("Поиск max и min элемента в массиве и расчет суммы всех элементов \n"
                          +"================================================================ \n"
                          +"Введите количество элементов массива");
        var arraySize = sc.nextInt();
        int[] mass = new int[arraySize];
        System.out.println("Введите элементы массива:");
        for(int i = 0; i< mass.length; i++){
            System.out.printf("элемент %d = ",i+1);
            mass[i] = sc.nextInt();
        }

        int sum = 0;
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        do{
            min = Math.min(mass[i], min);
            max = Math.max(mass[i], max);
            sum+=mass[i];
            i++;
        }while(i<mass.length);
        System.out.println("Сумма = "+sum+ "\n" +
                "Min = " + min+"\n"+
                "Max = " + max+"\n");
    }

    private static void garmon(){
        System.out.println("Вывод на экран первых 10 элементов горманического ряда\n"
                          +"====================================================== \n");
        for(int i = 1; i<=10; i++){
            System.out.printf("элемент "+i+" = %.2f", 1.0/i);
            System.out.println("");
        }
        System.out.println("\n");
    }

    private static void factorial(){
        System.out.println("Поиск факториала числа\n"
                          +"====================== \n"
                          +"Введите число:");
        int n = sc.nextInt();

        int f = 1;
        for(int i = 2; i<=n; i++){
            f*=i;
        }
        System.out.println("факториал = " + f+"\n");
    }
}