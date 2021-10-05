package Model_Bean;


public class Ocorrencia {
private int protocolo;
private String data_ocorrencia;
private String assunto;
private String descricao;
private String resposta;
private int id_funcionario;

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    public String getData_ocorrencia() {
        return data_ocorrencia;
    }

    public void setData_ocorrencia(String data_ocorrencia) {
        this.data_ocorrencia = data_ocorrencia;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
}
