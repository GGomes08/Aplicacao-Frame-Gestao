/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Alex
 */
public class CaixaPDV {
    
    private String nomeproduto;
    private Double preco_uni;
    
    public CaixaPDV(String nomeproduto,Double preco_uni) {
        this.nomeproduto = nomeproduto;
        this.preco_uni = preco_uni;

    }

    /**
     * @return the nomeproduto
     */
    public String getNomeproduto() {
        return nomeproduto;
    }

    /**
     * @param nomeproduto the nomeproduto to set
     */
    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }
    /**
     * @return the preco_uni
     */
    public Double getPreco_uni() {
        return preco_uni;
    }

    /**
     * @param preco_uni the preco_uni to set
     */
    public void setPreco_uni(Double preco_uni) {
        this.preco_uni = preco_uni;
    }


    
    
}
