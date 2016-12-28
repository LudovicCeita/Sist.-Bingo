/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobingo;

import java.util.Scanner;

/**
 *
 * @author Notorius B.I.G
 */
public class JogoDoBingo {

    public static void main(String[] a) {
        Jogador jogador;
        Scanner input = new Scanner(System.in);
        int numero, op, tamanho;
        Ranking rankingJogadores = new Ranking();
        boolean sair = true;
        String nome;

        while (sair) {

            System.out.println("1 - Inicia");
            System.out.println("2 - Lista de Clientes");
            System.out.println("3 - Sair");

            op = input.nextInt();

            switch (op) {
                case 1: {
                    System.out.println("Dificudade ");
                    System.out.println("1 - facil ");
                    System.out.println("2 - medio ");
                    tamanho = input.nextInt();

                    Controle tabu = new Controle(tamanho);
                    tabu.gerarLista();
                    tabu.gerarPeca();

                    //Cria um novo Jogador
                    jogador = new Jogador();

                    System.out.println("Qual o nome do Jogador");
                    nome = input.next();
                    jogador.setNome(nome);
                    System.out.println("\n");

                    tabu.setJogadorAtual(jogador);
                    tabu.mostrarTabuleiro();

                    while (!tabu.jogoAcabou()) {

                        System.out.println("Digite um numero Sorteado");
                        numero = input.nextInt();

                        System.out.println("\n");

                        tabu.viraPeca(numero);
                        tabu.mostrarTabuleiro();

                    }
                    //cartela todas marcadas salva cartela 
                    tabu.salvarCartelaJogador();
                    //Se Jogo terminou retorna true
                    //todas as pecas foram acertadas
                    if (tabu.jogoAcabou()) {
                        rankingJogadores.addJogador(jogador);
                        rankingJogadores.ordenarListaRanking();
                        rankingJogadores.mostrarJogadores();
                    }
                    break;
                }

                case 2: {
                    rankingJogadores.mostrarJogadores();
                    break;
                }

                case 3: {
                    sair = false;
                    break;
                }

            }

        }

    }

}
