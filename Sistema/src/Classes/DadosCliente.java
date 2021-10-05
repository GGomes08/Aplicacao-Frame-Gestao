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
public class DadosCliente {
    private int id_cliente;
    private String nome;
    private String cpf;
    private String rg;
    private String orgao;
    private String sexo;
    private Date data_nascimento;
    private String estadoCivil;
    private Double salario;
    
    
    public DadosCliente(int id_cliente, String nome, String cpf, String rg,String orgao,String sexo,Date data_nascimento,String estadoCivil,Double salario) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.orgao = orgao;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.estadoCivil = estadoCivil;
        this.salario = salario;
    }
    public int getid_cliente(){
        return id_cliente;
    }
    public String getnome(){
        return nome;
    }
    public String getcpf(){
        return cpf;
    }
    public String getrg(){
        return rg;
    }
    public String getorgao(){
        return orgao;
    }
    public String getsexo(){
        return sexo;
    }
    public Date getdata_nascimento(){
        return data_nascimento;
    }
    public String getestadoCivil(){
        return estadoCivil;
    }
    public Double getsalario(){
        return salario;
    }
}
