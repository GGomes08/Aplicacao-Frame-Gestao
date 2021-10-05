package Model_Bean;


public class LoginUsers {
    public class Usuario {
    
    private String login;
    private String senha;

        public String getId() {
            return login;
        }

        public void setId(String id) {
            this.login = id;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
    
    }
}
