package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comentario;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Gostei do post !");
		Comentario c2 = new Comentario("Nice, top demais !");
	
		Post p1 = new Post(sdf.parse("18/01/2023 10:04:18"), 
				"God of War", "Melhor jogo de todos os tempos !", 20);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		System.out.println(p1);
		
		
		sc.close();
	}

}
