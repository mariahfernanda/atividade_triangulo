package triangulo;

import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		
		int lado1, lado2, lado3;
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.println("Digite o primeiro tamanho: ");
		lado1 = leitor.nextInt();
		
		System.out.println("Digite o segundo tamanho: ");
		lado2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro tamanho: ");
		lado3 = leitor.nextInt();
		
		leitor.close();
		
		if ((lado1< lado2 + lado3) && (lado2<lado1 + lado3) && (lado3<lado1 + lado2)) {
			if (lado1 == lado2 && lado3 == lado1){
				System.out.println("SEU TRIANGULO É EQUILATERO");
			}
			else if ((lado1 == lado2) || (lado2 == lado3)) {
				System.out.println("SEU TRIANGULO É ISOSCELES");
			 }
		 else  {
				System.out.println("SEU TRIANGULO É ESCALENO");
		 }
		} else {
			
				System.out.println("NÃO É UM TRIANGULO");			
		}
		
		
		}
		
		
				
		
}


