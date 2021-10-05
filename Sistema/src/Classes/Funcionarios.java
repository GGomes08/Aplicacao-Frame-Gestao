/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;

/**
 *
 * @author gusta
 */
public class Funcionarios {
    private String nome;
    private Date data_admissao;
    private String cpf;
    private String login;
    private String senha;
    

    public Funcionarios(String nome,Date data_admissao,String cpf,String login, String senha ) {
        this.nome = nome;
        this.data_admissao = data_admissao;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
    }
    public String getnome(){
        return nome;
    }
    public Date getdata_admissao(){
        return data_admissao;
    }
    public String getcpf(){
        return cpf;
    }
    public String getlogin(){
        return login;
    }
    public String getsenha(){
        return senha;
    }
}
