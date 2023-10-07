/* A classe agora tem como única responsabilidade o gerenciamento de dados do cliente*/ 

public class Cliente {
    private String nome;
    private String email;
    private String endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}