package QuintaListaExercicios;

import java.util.Random;

public class ExercicioXP {

	public static void main(String[] args) {

//		Criar um programa que irá:
//			● Criar um array com 10 posições;
//			● Popular com números aleatórios (int).
//			● Imprimir o array (os números devem estar em uma única linha)
//			● Para cada número ímpar, substituir com o próximo número par.
//			● Imprimir o array (os números devem estar em uma única linha)
		
		 // Criando um array com 10 posições
        int[] array = new int[10];
        Random random = new Random();


        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(" "+array[i]);

        }

        System.out.println();

        System.out.print("Array de impares que viraram par: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 ) {
               array[i] = array[i] + 1;
               System.out.print(" "+array[i]);

                }
                
        }
		
	}
	
	}


