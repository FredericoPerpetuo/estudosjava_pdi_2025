package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date data;
    private String titulo;
    private String conteudo;
    private Integer likes;
    private List<Comentario> comentarios = new ArrayList<>();

    public Post(Date data, String titulo, String conteudo, Integer likes) {
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
        this.comentarios = comentarios;
    }

    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    private static void printComentarios(List<Comentario> comentarios, StringBuilder sb){
        comentarios.forEach(comentario -> sb.append("* " + comentario.getTexto() + "\n"));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes + " Likes - " + sdf.format(data) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentarios: \n");
        printComentarios(comentarios, sb);
        return sb.toString();
    }
}
