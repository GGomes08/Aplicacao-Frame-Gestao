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
public class Pagamento {
    private int id_pagamento;
    private int parcelas;
    private Date data_pagamento;
    private int formaPag;
    private double valorCompra;
    private int id_compra;
    
    public Pagamento(int id_pagamento, int parcelas, Date data_pagamento, int formaPag, double valorCompra, int id_compra){
        this.id_pagamento = id_pagamento;
        this.parcelas = parcelas;
        this.data_pagamento = data_pagamento;
        this.formaPag = formaPag;
        this.valorCompra = valorCompra;
        this.id_compra = id_compra;
    }
    public int getid_pagamento(){
        return id_pagamento;
    }
    public int getparcelas(){
        return parcelas;
    }
    public Date getdata_pagamento(){
        return data_pagamento;
    }
    public int getformaPag(){
        return formaPag;
    }
    public double getvalorCompra(){
        return valorCompra;
    }
    public int getid_compra(){
        return id_compra;
    }
}
