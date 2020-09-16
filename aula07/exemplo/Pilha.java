package exemplo;

import java.util.Stack;

/**
 * Pilha
 */
public class Pilha {

    public static void main(String[] args) {
        Stack <Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println("numero: " + pilha.pop());
        System.out.println("numero: " + pilha.pop());
        System.out.println("numero: " + pilha.pop());
        System.out.println("numero: " + pilha.pop());

    }

    
}