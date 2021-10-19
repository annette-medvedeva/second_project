package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Sqrt();
//        Rectangle();
  //      Ex_4();
//        Ex_1();
        //Ex_2();
       // Ex_3();
        //Ex_4_1();
     //   Ex_5();
   //    Ex_6();
       //Ex_7();
       Ex_8();
//        Ex_9();
        //Ex_10();
    }

    public static void Sqrt() {
        int x1 = 0;
        int x2 = 0;
        System.out.print("Enter value a: ");
        int a = (int) scanner.nextDouble();
        System.out.print("Enter value b: ");
        int b = (int) scanner.nextDouble();
        System.out.print("Enter value c: ");
        int c = (int) scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = ((-1 * b) + (int) Math.sqrt(d) / 2 * a);
            x2 = ((-1 * b) - (int) Math.sqrt(d) / 2 * a);
            System.out.println("Уравнение имеет 2 квадратныx корня, который равен :" + x1 + " and " + x2);
        } else if (d < 0) {
            System.out.println("Уравнение не имеет квадратных корней");
        } else {
            x1 = -1 * (b / 2 * a);
            System.out.println("Уравнение имеет 1 квадратный корень, который равен: " + x1);
        }
    }

    public static void Rectangle() {
        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(20);
        System.out.println("\n a:" + a);
        System.out.println("\n b:" + b);
        if (a != b) {
            int p = a * 2 + b * 2;
            int s = a * b;
            System.out.println("P = " + p + " cm");
            System.out.println("S= " + s + " cm^2");
        } else System.out.println("стороны равны " + a + " = " + b);
    }

    public static void Ex_4() {
        double a, b, c, x, y;
        a = Math.round(Math.random() * 10);
        b = Math.round(Math.random() * 10);
        c = Math.round(Math.random() * 10);
        x = Math.round(Math.random() * 10);
        y = Math.round(Math.random() * 10);
        System.out.println("\n a " + a);
        System.out.println("\n b " + b);
        System.out.println("\n c " + c);
        System.out.println("\n x " + x);
        System.out.println("\n y " + y);

        System.out.println(b + (Math.sqrt((b * b + 4 * a * c) / 2 * a) - (Math.pow(a, 3) * c) - Math.pow(b, -2)));
        System.out.println(Math.sin(Math.sqrt(x + 1)) + Math.sin(Math.sqrt(x - 1)));
        System.out.println(x - (Math.pow(x, 3) / 3) + (Math.pow(x, 5) / 5));
        if (Math.cos(x) != 0 && Math.sin(x) != 0) {
            double p1 = Math.tan(x);
            double p2 = 1 / Math.tan(x);
            double p3 = Math.pow(1 - p1, p2) + Math.cos(x - y);
            System.out.println(p3);
        } else
            System.out.println("No solutions");
    }
    //Написать программу, которая проверяет, является ли введённое пользователем целое число четным.
    public static void Ex_1(){
        System.out.println("Enter number: ");
        int a = (int) scanner.nextInt();
        if (a%2==0)
        {
            System.out.println("Вы ввели четное число");
        }
        else {
            System.out.println("Вы ввели нечетное число");
        }
    }
    //Написать программу, которая проверяет, делится ли введённое с клавиатуры целое число на 3, на 5, на 7.
    public static void Ex_2() {
        System.out.println("Enter number: ");
        int a= (int)scanner.nextInt();
        if (a%3==0){
            System.out.println("введённое целое число делится на 3");
        }
        else if (a%5==0)
        {
            System.out.println("введённое целое число делится на 5");
        }
        else if (a%7==0){
            System.out.println("введённое целое число делится на 7");
        }
        else if (a%2==0)
        {
            System.out.println("Вы ввели четное число");
        }
        else {
            System.out.println("Вы ввели нечетное число, которое не делиться на 3, 5, 7");
        }

    }
    //Написать программу которая вычисляет частное двух чисел.
    // Программа должна проверять правильность введенных пользователем данных и, если они неверные (делитель равен нулю),
    // выдавать сообщение об ошибке.
    public static void Ex_3() {
        System.out.println("Введите делимое: ");
        int first_number= (int)scanner.nextInt();
        System.out.println("Введите делитель: ");
        int second_number =(int)scanner.nextInt();
        while (second_number==0)
        {
            System.out.println(" Делитель не должен быть равен нулю!");
            System.out.println("Введите делитель: ");
            second_number =(int)scanner.nextInt();
            if(second_number > 0) break;
        }
       double quotient_of_two_numbers=(double)first_number/second_number;
        System.out.println(first_number + " : " + second_number + " = " + quotient_of_two_numbers);

    }
    //Написать программу для проверки знания даты основания Одессы. В случае неправильного ответа пользователя,
    // программа должна выводить правильный ответ. Ниже приведён возможный вид экрана во
    // время выполнения такой программы (данные, введенные пользователем, выделены полужирным шрифтом).
    //В каком году была основана Одесса?
    //-> 1795
    //Вы ошиблись, Одесса была основана в 1794 году.
    public static void Ex_4_1() {
        System.out.println("В каком году была основана Одесса?  ");
        int data_Odessa = (int) scanner.nextInt();
        System.out.println(System.lineSeparator()+ ConsoleColors.RED_BOLT+ConsoleColors.RESET);
        if (data_Odessa != 1794) {
            System.out.println("Вы ошиблись, Одесса была основана в 1794 году");
        }
        else
            System.out.println("Вы ответили верно, Одесса была основана в 1794 году");
    }
    //Определить, является ли год, который ввел пользователем, високосным или нет. (Високосные года делятся нацело на 4.
    // Однако из этого правила есть исключение: столетия, которые не делятся нацело на 400,
    // високосными не являются. Например, 2000 - високосный, а 2100 — нет).
    public static void Ex_5() {
        System.out.println("Введите год: ");
        int year=(int)scanner.nextInt();
        if (year%4!=0){
            System.out.println("Вы ввели НЕВисокосный год" );
        }
        else if (year%100==0 && year%400!=0) {
            System.out.println("Вы ввели НЕВисокосный год" );
        }
        else
            System.out.println("Вы ввели Високосный год" );

    }
    //Написать программу для вычисления стоимости покупки с учетом скидки. Скидка в 3% предоставляется,
    // если сумма покупки больше 500 грн., в 5% — если сумма больше 1000 грн. Ниже приведён возможный
    // вид экрана во время выполнения такой программы (данные, введенные пользователем, выделены полужирным шрифтом).
    //Введите стоимость покупки:
    //-> 640
    //Вам предоставляется скидка 3%
    //Сумма с учетом скидки: 620.80 грн.
    public static void Ex_6() {
        System.out.println("Введите сумму: ");
         //ConsoleColors.RED_BOLT;
        int summa=(int)scanner.nextInt();

        if (summa>=500&& summa<=999) {
           float discount=summa-(summa / 100 * 3);
            System.out.println("Вам предоставляется скидка 3% - "+(summa / 100 * 3+"Uah"));
            System.out.println("Сумма с учетом скидки: " + discount);
        }
       else if (summa>=1000){
            float discount_2=summa-(summa / 100 * 5);
            System.out.println("Вам предоставляется скидка 5% -  " + summa / 100 * 5+"Uah");
            System.out.println("Сумма с учетом скидки: "+ discount_2);
        }
       else if(summa<=499){
            System.out.println("У Вас нет скидки. Купите товары на сумму 500 или более");
        }
    }
    //Написать программу для вычисления стоимости разговора по телефону с учетом 20% скидки,
    // предоставляемой по субботам и воскресеньям. Ниже приведён возможный вид экрана программы во время её работы
    // (данные, вводимые пользователем, выделены полужирным шрифтом).
    //Вычисление стоимости разговора по телефону.
    //Введите исходные данные:
    //Длительность разговора (целое количество минут)
    //-> 3
    //День недели (1 — понедельник, ... 7 — воскресенье)
    //-> 6
    //Вам предоставляется скидка 20%.
    //Общая стоимость разговора: 5.52 грн.
    public static void Ex_7() {
        float coast;
        int min=2;
        System.out.println("Вычисление стоимости разговора по телефону ");
        System.out.println("Введите исходные данные. ");
        System.out.println("Длительность разговора:  ");
        int min_=(int)scanner.nextInt();
        coast=min_*min;
        System.out.println("Общая стоимость:  "+coast);
        System.out.println("Введите День недели (1 — понедельник,2-вторник, 3-среда, 4-четверг, 5-пятница, 6-суббота, 7 — воскресенье)  ");
        int day_=(int)scanner.nextInt();

            switch (day_){
                case 1: case 2: case 3: case 4: case 5:
                    System.out.println("у Вас стоимость минуты телефонного звонка составляет 2 грн "+ coast);
                    break;
                case 6: case 7:
                    float discount_=coast-(coast*20/100);
                    System.out.println("Вам предоставляется скидка 20%.");
                    System.out.println("Общая стоимость разговора: "+ discount_);
                    break;

            }
    }
    //Дано трехзначное число. Определить, какая из его цифр больше:
    //а) первая или последняя;
    //б) первая или вторая;
    //в) вторая или последняя
    public static void Ex_8() {
        System.out.println("Введите трехзначное  число:  ");
        int num=(int)scanner.nextInt();
            int c1, c2;
        c1= num/100;
        c2= num%10;
        if  (c1>c2){
            System.out.println("Первая больше");
        }
        else if (c2>c1){
            System.out.println("Последняя больше");
        }
            else
            System.out.println("Первая и последняя равны");
        {

        }
    }
    //Сумма прописью: пользователь вводит число от 1 до 9999.
    // Необходимо вывести на экран словами введенную сумму и в конце написать название валюты с правильным окончанием.
    // Например: 7431 – семь тысяч четыреста тридцать один доллар,
    // 2149 – две тысячи сто сорок девять долларов, 15 – пятнадцать долларов, 3 – три доллара.
    // Для решения этой задачи вам необходимо будет применять оператор % (остаток от деления).
    public static void Ex_9() {

    }
    //Даны вещественные числа х и у, не равные друг другу. Используя тернарный оператор,
    // заменить меньшее из этих двух чисел половиной их суммы, а большее — их удвоенным произведением.
    public static void Ex_10() {

    }
}

