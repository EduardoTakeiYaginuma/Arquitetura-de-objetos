package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        boolean loop = true;

        while (loop) {

            System.out.println("\nMenu Principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {

                System.out.println("Digite o nome do restaurante: ");
                String nomeRestaurante = scanner.nextLine();
                System.out.println("Digite a avaliacao do restaurante: ");
                String avaliacaoRestaurante = scanner.nextLine();

                Restaurante restaurante = new Restaurante();
                restaurante.nome = nomeRestaurante;
                restaurante.avaliacao = avaliacaoRestaurante;
                restaurantes.add(restaurante);
                System.out.println(restaurantes);
                System.out.println("Restaurante " + nomeRestaurante + " cadastrado com sucesso!");
            }
            else if (opcao.equals("2")) {
                System.out.println("Restaurantes cadastrados:");
                for (int i = 0; i<restaurantes.size(); i++) {
//                   System.out.println( + ":" + restaurantes.get(i).nome);
                    int numero = i;
                    String mensagem = String.format("%d: %s",numero, restaurantes.get(i).nome);
                    System.out.println(mensagem);
                    restaurantes.get(i).imprimeMenu();
                }
            }

            else if (opcao.equals("3")) {

                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                String escolha = scanner.nextLine();
                int indice_restaurante = Integer.parseInt(escolha);

                Restaurante restauranteEscolhido = restaurantes.get(indice_restaurante);

                System.out.println("Digite o nome do item: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o preco do item: ");
                String preco = scanner.nextLine();

                Item itemNovo = new Item();
                itemNovo.nome = nome;
                itemNovo.preco = preco;

                restauranteEscolhido.adicionarItens(itemNovo);
                System.out.println("Item " + nome + " adicionado ao menu do restaurante " + restauranteEscolhido.nome + "!");
            }
            else if (opcao.equals("4")) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                loop = false;
            }
            else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}