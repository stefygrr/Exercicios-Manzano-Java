package exercicios07;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        double temperaturaC = sc.nextDouble(); 
        
        double temperaturaF = (9 * temperaturaC + 160) / 5;
        
        System.out.println("Temperatura em Celsius: " + temperaturaC + "°C");
        System.out.println("Temperatura em Fahrenheit: " + temperaturaF + "°F");
        
        sc.close();
    }
}