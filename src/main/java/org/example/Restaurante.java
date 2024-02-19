package org.example;

import java.util.ArrayList;

public class Restaurante {
    String nome;
    String avaliacao;
    ArrayList<Item> cardapio = new ArrayList<>();

    void mostraNome(String nome) {
        System.out.println("nome " + nome);
    };
    Boolean adicionarItens(Item item) {
        if (item != null) {
            cardapio.add(item);
            return true;
        }
        return false;
    }

    void imprimeMenu() {
        for (int i = 0; i < cardapio.size(); i++) {
            Item item = cardapio.get(i);
            System.out.println(item.nome + ": " + item.preco);
        }
    }

//    public String toString() {
//        return "Restaurante: " + nome + ", Endereço: " + endereco;
//    }
}
