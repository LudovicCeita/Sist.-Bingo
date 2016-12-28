/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobingo;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Notorius B.I.G
 */
public class Controle {

    private int tamanhoTabuleiro;

    private Cartela[][] cartelas;
    private Jogador jogadorAtual;
    private LinkedList<Cartela> listaCartelas = new LinkedList<>();

    public void gerarLista() {
//insere 2 peca ao mesmo tempo 
        for (int i = 0; i < (tamanhoTabuleiro * tamanhoTabuleiro); i++) {
            Cartela cartela = new Cartela();
            cartela.setValor(i + 1);
            listaCartelas.add(cartela);
        }

    }

    public Controle(int op2) {

        if (op2 == 1) {
            tamanhoTabuleiro = 2;
        }

        if (op2 == 2) {
            tamanhoTabuleiro = 6;
        }
        if (op2 == 3) {
            tamanhoTabuleiro = 8;
        }

        cartelas = new Cartela[tamanhoTabuleiro][tamanhoTabuleiro];
    }

    public Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public void setJogadorAtual(Jogador jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }

    //pegar os elementos da minha lista e adiciono na minha matriz peca
    public void gerarPeca() {

        int posArmazenada, tamanho;
        for (int lin = 0; lin < tamanhoTabuleiro; lin++) {
            for (int col = 0; col < tamanhoTabuleiro; col++) {
                Cartela cartela;
                Random numAleatorio = new Random();

                //pego o tamanho da minha listaPeca
                tamanho = listaCartelas.size();
                //gerar um numeroAleatorio 0 ate o tamanho da lista
                posArmazenada = numAleatorio.nextInt(tamanho);
                //Agora q eu tenho a posicao 
                //salvo o elemento e remover
                cartela = listaCartelas.remove(posArmazenada);
                cartelas[lin][col] = new Cartela(cartela.getValor());

            }
        }

    }

    public void mostrarTabuleiro() {

        System.out.println("nome: " + jogadorAtual.getNome());
        jogadorAtual.setPontuacao(1);
        System.out.println("tentativas: " + jogadorAtual.getPontuacao());
        for (int lin = 0; lin < tamanhoTabuleiro; lin++) {
            for (int col = 0; col < tamanhoTabuleiro; col++) {
                //se a peca esta virada mosta o elemento
                if (cartelas[lin][col].isVirado()) {
                    System.out.print(cartelas[lin][col].getValor() + "true  ");
                } else {
                    System.out.print(cartelas[lin][col].getValor() + "fals  ");
                }
            }
            System.out.println("");
        }
    }

    //Verifica se todas as pecas foram acertadas
    public boolean jogoAcabou() {

        for (int lin = 0; lin < tamanhoTabuleiro; lin++) {
            for (int col = 0; col < tamanhoTabuleiro; col++) {
                //verifica as pecas esta de cabeca pra baixo 
                if (!cartelas[lin][col].isVirado()) {
                    return false;
                }

            }

        }
        return true;
    }

    public void viraPeca(int lin1) {

        for (int lin = 0; lin < tamanhoTabuleiro; lin++) {
            for (int col = 0; col < tamanhoTabuleiro; col++) {
                if (cartelas[lin][col].getValor() == lin1) {
                    cartelas[lin][col].setVirado(true);
                }
            }
        }

    }

    public void salvarCartelaJogador() {

        for (int lin = 0; lin < tamanhoTabuleiro; lin++) {
            for (int col = 0; col < tamanhoTabuleiro; col++) {

                int numero = cartelas[lin][col].getValor();
                boolean marcado = cartelas[lin][col].isVirado();
                getJogadorAtual().salvarCartela(numero, marcado, tamanhoTabuleiro, lin, col);
            }
        }
    }

    public void desviraPeca(int lin, int col) {

        cartelas[lin][col].setVirado(false);

    }

}
