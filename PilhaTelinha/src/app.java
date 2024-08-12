
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Igreis
 */
public class app {

    static Pilha Pilha = new Pilha();
    static int input = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (input != 4) {
            System.out.println("--------------------------------");
            System.out.println("1. adicionar um numero a pilha");
            System.out.println("2. remover um numero a pilha");
            System.out.println("3. imprimir pilha");
            System.out.println("4. sair");
            System.out.println("--------------------------------");

            System.out.print("Escolha uma opçao: ");
            input = scanner.nextInt();

            if (input == 1) {
                Enqueue();
            }
            if (input == 2) {
                Pilha.Pop();
            }
            if (input == 3) {
                Pilha.imprimir();
            }
            if (input == 4) {
                break;
            }
        }
        scanner.close();
    }

    static public void Enqueue() {
        System.out.println("Escolha um numero para adicionar na pilha");
        int valor = scanner.nextInt();
        Pilha.Push(valor);
    }

}
