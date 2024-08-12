/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Igreis
 */
public class Fila {
    public No primeiro;
    public No ultimo;
    
    public Fila(){
        primeiro = null;
        ultimo = primeiro;
    }
    
    public void Enqueue(int valor) {
        No novo = new No(valor);
        if(primeiro == null){
            primeiro = novo;
            ultimo = primeiro;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
        System.out.println("Adicionado a fila");
    }
    
    public void Desenqueue(){
        if(primeiro == null){
            System.out.println("A fila esta vazia");
        } else {
            primeiro = primeiro.proximo;
            System.out.println("Removido da fila");
        }
    }
    
    public void Imprimir(){
        if (primeiro == null){
            System.out.println("A fila esta vazia!");
        }
        else{
            No navegador = primeiro;
            while (navegador != null){
                navegador.imprimir();
                navegador = navegador.proximo;
            }
        }
    }
}
