/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Bean;

import java.sql.Date;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Pagamento {
    private int id_pagamento;
    private int parcelas;
    private Date data_pagamento;
    private String forma_pagamento;
    private double valor_compra;
    private int id_compra;

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }
}
