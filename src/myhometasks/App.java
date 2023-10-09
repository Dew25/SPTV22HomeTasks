/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhometasks;

import tasks.WeatherInYear;
import tasks.ArrayDemo;
import tasks.CreateBooksArray;
import tasks.NumberParser;
import java.util.Scanner;
import tasks.TemperatureConverter;

/**
 *
 * @author admin
 */
public class App {
    private Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу:");
            System.out.println("0. Закончить программу");
            System.out.println("1. Конверетер температуры");
            System.out.println("2. Парсер числа");
            System.out.println("3. Создание массива книг");
            System.out.println("4. Задача с массивом целых чисел");
            System.out.println("5. Температура в году");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("--- Выбрана задача 1 ---");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;
                case 2:
                    System.out.println("--- Выбрана задача 2 ---");
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                case 3:
                    System.out.println("--- Выбрана задача 3 ---");
                    CreateBooksArray createBooksArray;
                    createBooksArray = new CreateBooksArray();
                    createBooksArray.doCreateArray();
                    
                    break;
                case 4:
                    System.out.println("--- Выбрана задача 4 ---");
                    ArrayDemo arrayDemo;
                    arrayDemo = new ArrayDemo(scanner);
                    arrayDemo.runDemo();
                    System.out.println("--- конец задачи 4 ---");
                    break;
                case 5:
                    System.out.println("--- Выбрана задача 5 ---");
                    WeatherInYear weatherInYear;
                    weatherInYear = new WeatherInYear(scanner);
                    weatherInYear.runTask();
                    System.out.println("--- конец задачи 5 ---");
                    break;
                default:
                    System.out.println("Выберите номер из списка!");
            }
        }while(repeat);
        System.out.println("До свидания!");
    }

    
}
