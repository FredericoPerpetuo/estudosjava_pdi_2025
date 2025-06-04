package entities;

public class Endereco {
    private String email;
    private String telefone;


    public Endereco(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
