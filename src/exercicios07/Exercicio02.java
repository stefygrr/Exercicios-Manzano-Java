package exercicios07;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaF = sc.nextDouble();
        
        double temperaturaC = (temperaturaF - 32) * 5 / 9;
        
        System.out.println("Temperatura em Fahrenheit: " + temperaturaF + "°F");
        System.out.println("Temperatura em Celsius: " + temperaturaC + "°C");

        sc.close();
    }
}
