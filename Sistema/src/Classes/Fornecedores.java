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
 public class Fornecedores {
    private String razaosocial;
    private String cnpj;
    private String cidade;
    private String telefone;
    

    public Fornecedores(String razaosocial,String cnpj,String cidade,String telefone) {
        this.razaosocial = razaosocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    public Fornecedores(String string, String string0,String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getrazaosocial(){
        return razaosocial;
    }
    public String getcnpj(){
        return cnpj;
    }
    public String getcidade(){
        return cidade;
    }
    public String gettelefone(){
        return telefone;
    }
}
