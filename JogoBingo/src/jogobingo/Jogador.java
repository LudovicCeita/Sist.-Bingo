/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobingo;

/**
 *
 * @author Notorius B.I.G
 */
public class Jogador implements Comparable<Jogador> {

    private String nome;
    private int pontuacao = 0;
    private String[][] cartela = new String[2][2];
    int tamanho;

    public Jogador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    @Override
    public int compareTo(Jogador o) {
        return getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {

        return "\t " + getNome() + "\t\t" + getPontuacao() + "\n";

    }

    
    public void salvarCartela(int numero, boolean marcado, int tamanhoTabuleiro, int lin, int col) {
        
        String numeroString = Integer.toString(numero);
        cartela[lin][col] = numeroString + marcado;
        tamanho = tamanhoTabuleiro;

    }

    public void MostarCartelaDoJogador() {

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(" " + cartela[i][j]);

            }
            System.out.println("");
        }

    }
}
