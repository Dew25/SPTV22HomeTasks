/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NumberParser {

    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParse() {
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt(); scanner.nextLine();
        int ones = 0;
        int tens = 0;
        int sum = 0;
        //this code
        System.out.println("В этом числе:");
        System.out.printf("  - единиц: %d%n",ones);
        System.out.printf("  - десятков: %d%n",tens);
        System.out.printf("  - сумма цифр: %d%n",sum);
    }
    
}
