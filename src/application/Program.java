package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> lista = new ArrayList<>();
		
		System.out.print("Digite o número de formas: ");
		int numeroFormas = sc.nextInt();
		
		for (int i=1; i<=numeroFormas; i++) {
			System.out.println("---------------------------------");
			System.out.println("Informação da forma #" + i);
			
			System.out.print("Retangulo ou circulo (R/C)? ");
			char forma = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Color cor = Color.valueOf(sc.next());
			
			if (forma == 'R') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				lista.add(new Rectangle(cor, largura, altura));
			} else if (forma == 'C') {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circle(cor, raio));
			} else {
				System.out.println("Forma incorreta, Digite novamente!");
				i = i-1;
			}
		}
		System.out.println();
		
		System.out.println("Formato das areas:");
		for (Shape forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		sc.close();
	}

}
