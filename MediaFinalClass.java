package EstruDeciPackage;

import java.util.Scanner;

public class MediaFinalClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota:");
		float nota1 = scn.nextFloat();
		System.out.println("Digite a sua segunda nota:");
		float nota2 = scn.nextFloat();
		
		float mf = (nota1 + nota2) / 2;

		if(mf >= 6) {

			System.out.print("Aluno aprovado");
		}
		
		else if (mf <= 3) {
			System.out.print("Aluno reprovado");
		}
		
		else {
			System.out.print("Aluno em recuperação");
		}
		
		System.out.printf("\nSua média final é de %.2f", (mf));
	}

}
