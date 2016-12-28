/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoSimplesStatico;

/**
 *
 * @author Notorius B.I.G
 */
public class Conta {

    private String nome;
    private int numeroDaConta;
    private double saldo;
    private static int totalDeContas;
    
    public Conta(String nome, int numero) {
        this.numeroDaConta = numero;
        this.nome = nome;
        this.saldo = 0;
        Conta.totalDeContas = Conta.totalDeContas + 1;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if ((this.saldo - valor) >= 0) {
            this.saldo -= valor;
        }

    }

    public void deposito(double valor) {
        if ((this.saldo + valor) >= 0) {
            this.saldo += valor;
        }

    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    
    public boolean verificaNumero(int numero) {
        return this.numeroDaConta == numero;
    }

    @Override
    public String toString() {
        return String.format("Nome : " + nome
                + "\nnumero : " + numeroDaConta
                + "\nSaldo : " + saldo);
    }
}
