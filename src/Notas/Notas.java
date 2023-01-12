package Notas;

public class Notas {

	public static void main(String[] args) {
		
		
			int nota1 = 7;
			int nota2 = 10;
			
			int nota3 = nota1 + nota2;
			
			int nota4 = nota3 + nota3;
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
					
			System.out.println(nota1);	
			System.out.println(nota2);	
			System.out.println(nota3);	
			System.out.println(nota4);	
			
			System.out.printf("%.2f%n", media);
			
	}
}
