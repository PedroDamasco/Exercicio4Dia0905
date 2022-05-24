package Exercicios;
import java.util.Scanner;
public class MediaDoFundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in); // criando Scanner basico
		
		int n1,n2,n3,med; // numeros a serem inseridos
		
		for (int ra=1;ra!=0;) { // criacao de condicao do loop, ra=1 para ja ser diferente de 0
			
		System.out.print("\nInforme o RA do Aluno:");
		ra=sc.nextInt(); // informacao do aluno ra que ira determinar rodar ou nao o restante.
		if (ra!=0) { // condicao de finalizacao do sistema ra for igual a 0  encerra o sistema.
		System.out.printf("\nInforme a primeira nota:");
		n1=sc.nextInt(); //insercao da primeira nota.
		System.out.printf("\nInforme a segunda nota:");
		n2=sc.nextInt(); // insercao da segunda nota.
		System.out.printf("\nInforme a terceira nota:");
		n3=sc.nextInt(); // insercao da terceira nota.
		
		med=(n1+n2+n3)/3; // linha de corte ( media ).
		
		if (med>=8) 	// condicao do RA - maior ou igua a 8 aprovado.
		System.out.printf("O aluno com RA "+ra+" foi aprovado.\nParabens");
		
		if (med<8 && med>=6 ) // menor que 8 ou igual maior que 6 recuperacao; 
		System.out.printf("Infelizmente o aluno com RA:"+ra+" esta de recuperacao");
		
		if (med<6) // menor que 6 reprovado;
		System.out.printf("Sintimos em informar que o aluno com RA:"+ra+",foi reprovado");
			
		}}
		
		
		
	}}
