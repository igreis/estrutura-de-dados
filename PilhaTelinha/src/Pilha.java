/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Igreis
 */
public class Pilha {

    public No topo;
    public No primeiro;
    public No atual;

    public Pilha() {
        primeiro = null;
        topo = primeiro;
    }

    public void Push(int valor) {
        No novoNo = new No(valor);
        if (primeiro == null) {
            primeiro = novoNo;   
        }
        novoNo.proximo = topo;
        topo = novoNo;
    }
    
    public void Pop() {
        if(topo == null){
            System.out.println("A pilha esta vazia");
        } else {
            topo = topo.proximo;
        }
    }

    public void imprimir() {
        atual = topo;
        while (atual != null) {
            System.out.println(atual.info);
            atual = atual.proximo;
        }  
    }
}
