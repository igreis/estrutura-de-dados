/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Igreis
 */

import java.util.Scanner;

public class project {
    
    static Fila fila = new Fila();
    static int input = 0;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        while(input != 4) {
            System.out.println("--------------------------------");
            System.out.println("1. adicionar um numero a fila");
            System.out.println("2. remover um numero a fila");
            System.out.println("3. imprimir fila");
            System.out.println("4. sair");
            System.out.println("--------------------------------");
        
            System.out.print("Escolha uma opçao: ");
            input = scanner.nextInt();

            if(input == 1) Enqueue();
            if(input == 2) fila.Desenqueue();
            if(input == 3) fila.Imprimir();
            if(input == 4) break;
        }
        scanner.close();
    }
    
    static public void Enqueue() {
        System.out.println("Escolha um numero para adicionar na fila");
        int valor = scanner.nextInt();
        fila.Enqueue(valor);
    }
}
