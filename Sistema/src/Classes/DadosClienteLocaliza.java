/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


/**
 *
 * @author gusta
 */
public class DadosClienteLocaliza {
     private String logradouro;
    private String cep;
    private int numeracao;
    private String complemento;
    private String cidade;
    private String estado;
    private String referencia;
    
    
    public DadosClienteLocaliza(String logradouro, String cep,int numeracao,String complemento,String cidade, String estado,String referencia) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.numeracao = numeracao;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.referencia = referencia;
    }
    public String getlogradouro(){
        return logradouro;
    }
    public String getcep(){
        return cep;
    }
    public int getnumeracao(){
        return numeracao;
    }
    public String getcomplemento(){
        return complemento;
    }
    public String getcidade(){
        return cidade;
    }
    public String getestado(){
        return estado;
    }
    public String getreferencia(){
        return referencia;
    }
}