package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Usuario;
import entities.Video;
import entities.Visualizacao;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Usuario> users = new ArrayList<>();
		users.add(new Usuario("Lucas", 24, "Masculino", "Lucas24"));
		Usuario u = users.get(0);

		List<Video> videos = new ArrayList<>();
		videos.add(new Video("Video JAVA"));
		videos.add(new Video("VIDEO POO"));
		Video v = videos.get(0);
		Video v1 = videos.get(1);
		
		
		Visualizacao visu[] = new Visualizacao[5];
		visu[0] = new Visualizacao(v, u);
		visu[0].avaliar(8);
		
		visu[1] = new Visualizacao(v1, u);
		
		System.out.println(visu[0].toString());
		System.out.println(visu[1].toString());
		
		
		
	
	}
}
