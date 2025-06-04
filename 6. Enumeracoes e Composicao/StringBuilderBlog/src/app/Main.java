package app;

import entities.Comentario;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma ótima viagem");
        Comentario c2 = new Comentario("Muito bacana!");
        Post post1 = new Post(sdf.parse("21/06/2018 12:05:44"), "Viagem para a Nova Zelândia",
                "Vou visitar esse país maravilhoso", 12);
        post1.addComentario(c1);
        post1.addComentario(c2);
        System.out.println(post1);

        Comentario c3 = new Comentario("Boa noite pessoal");
        Comentario c4 = new Comentario("Que a força esteja com vocês");
        Post post2 = new Post(sdf.parse("28/06/2018 23:14:19"), "Excelente festa",
                "Vlw demais pessoal", 5);
        post2.addComentario(c3);
        post2.addComentario(c4);
        System.out.println(post2);



    }
}