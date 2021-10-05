/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Bean;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Compra {
    private int id_compra;
    private int quantidade;
    private double valor_final;
    private int id_cliente;
    private int id_funcionario;
    private String cod_barras;

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_final() {
        return valor_final;
    }

    public void setValor_final(int valor_final) {
        this.valor_final = valor_final;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }
    
}
