package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Zakaz[] zakazik = new Zakaz[10];
        for (int i = 0; i < zakazik.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Введите название заказа \n");
            String name = scanner.next();
            System.out.printf("Введите количество порций \n");
            int kolvo = scanner.nextInt();
            System.out.printf("Введите цену за порцию \n");
            int cena = scanner.nextInt();
            zakazik[i] = new Zakaz(kolvo, cena, name);
            zakazik[i].Zakazinformation();
            zakazik[i].Cenazakaza();
            zakazik[i].Razmerzakaza();
        }




    }
}
