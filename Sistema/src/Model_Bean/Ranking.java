package Model_Bean;


public class Ranking {
    
    private int id_ranking;
    private int qtd_vendas;
    private String cod_barras;

    public int getId_ranking() {
        return id_ranking;
    }

    public void setId_ranking(int id_ranking) {
        this.id_ranking = id_ranking;
    }

    public int getQtd_vendas() {
        return qtd_vendas;
    }

    public void setQtd_vendas(int qtd_vendas) {
        this.qtd_vendas = qtd_vendas;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }
    
}
