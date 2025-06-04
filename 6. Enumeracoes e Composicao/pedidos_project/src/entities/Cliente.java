package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String email;
    private String dtNasc;

    public Cliente(String nome, String email, String dtNasc) {
        this.nome = nome;
        this.email = email;
        this.dtNasc = dtNasc;
    }

    @Override
    public String toString() {
        StringBuilder sd = new StringBuilder();
        sd.append(nome);
        sd.append(" (" + dtNasc + ")");
        sd.append(" - " + email + "\n");
        return sd.toString();
    }
}
