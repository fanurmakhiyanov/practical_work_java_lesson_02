// Задание 4 - К калькулятору из предыдущего дз добавить логирование

import java.io.*;
import java.util.Scanner;
import java.util.logging.*;

public class Task04 {
        public static void main(String[] args) throws IOException {
       
           double number1;
           double number2;
           double answer;
           char operation;

        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите первое число: ");
        number1 = iScanner.nextDouble();
        System.out.printf("Введите второе число: ");
        number2 = iScanner.nextDouble();
        
        System.out.print("\nВозможные операции над числами:\n'+' - сложение\n'-' - вычитание\n'*' - умножение\n'/' - деление: \nВведите символ операции: ");
        operation = iScanner.next().charAt(0);
        iScanner.close();

        switch(operation) {
            case '+': answer = number1 + number2;
                break;
            case '-': answer = number1 - number2;
                break;
            case '*': answer = number1 * number2;
                break;
            case '/': answer = number1 / number2;
                break;
            default:  System.out.printf("\nОшибка! Введите корректный символ операции над числами");
                return;
        }

        System.out.print("\nРезультат операции:\n");
        System.out.printf(number1 + " " + operation + " " + number2 + " = " + answer + "\n");

        Logger logger = Logger.getLogger(Task04.class.getName());
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);

            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);

            logger.log(Level.WARNING, "Какое-то сообщение");
            logger.info("Что-то произошло");

    }
}