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
public class DadosClienteContato {
     private int id_cliente;
    private String telefone;
    private String celular;
    private String conhecido;
    private String telefone2;

    
    
    public DadosClienteContato(int id_cliente, String telefone, String celular,String conhecido,String telefone2) {
        this.id_cliente = id_cliente;
        this.telefone = telefone;
        this.celular = celular;
        this.conhecido = conhecido;
        this.telefone2 = telefone2;
    }
    public int getid_cliente(){
        return id_cliente;
    }
    public String gettelefone(){
        return telefone;
    }
    public String getcelular(){
        return celular;
    }
    public String getconhecido(){
        return conhecido;
    }
    public String gettelefone2(){
        return telefone2;
    }

}
