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
public class Vendas {
    private int id_pagamento;
    private int quantidade;
    private double preco_final;
    private int id_funcionario;
    private int id_cliente;
    private String codBarras;
    private Date data_pagamento;
    public Vendas(int id_pagamento,int quantidade,double preco_final, int id_funcionario,int id_cliente, String codBarras,Date data_pagamento ) {
        this.id_pagamento = id_pagamento;
        this.quantidade = quantidade;
        this.preco_final = preco_final;
        this.id_funcionario = id_funcionario;
        this.id_cliente = id_cliente;
        this.codBarras = codBarras;
        this.data_pagamento = data_pagamento;
        
    }
    public int getid_pagamento(){
        return id_pagamento;
    }
    public int getquantidade(){
        return quantidade;
    }
    public double getpreco_final(){
        return preco_final;
    }
    
    public int getid_funcionario(){
        return id_funcionario;
    }
    public int getid_cliente(){
        return id_cliente;
    }
    public String getcodBarras(){
        return codBarras;
    }
    public Date getdata_pagamento(){
        return data_pagamento;
    }
}
