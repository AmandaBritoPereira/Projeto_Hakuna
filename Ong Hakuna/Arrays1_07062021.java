
/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

package Generation;

import java.util.Scanner;

public class Arrays1_07062021 {

	public static void main(String args[]) {
		
			final int y=4;
			float [] notas = new float[y];
			float somanotas=0,media;
			
			Scanner leia = new Scanner(System.in);
			
			for(int x=0;x<notas.length;x++)
			{
				System.out.println("\nEntre com a sua nota: ");
				notas[x] = leia.nextFloat();
				
				somanotas += notas[x]; // somanotas = somanota + notas[x]
			}
			media = somanotas / notas.length;
			
			System.out.printf("\nM�dia das notas: %2.2f",media);
	}
}
