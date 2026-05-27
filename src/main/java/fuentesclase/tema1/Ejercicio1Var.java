package fuentesclase.tema1;
public class Ejercicio1Var {
	/*Esto es un comentario
	 * de varías líneas*/

	public static void main(String[] args) {
		// Esto es un comentario de una línea
		//Vamos a escribir varios números:
		System.out.println(30);
		System.out.println(358);
		System.out.println(50000);
		/*********************************************/
		/*
		 * 
		 * Las variables permiten almacenar información.
		 * a = 3; 
		 * Pero además hay que indicar el "tipo", es decir cómo van a ser los datos que va a guardar, fechas, números, textos, etc.

			En Java, hay diferentes tipos, por ejemplo:
				
				String - Almacena texto, como "Hola". Los valores de cadena son Rodeado de comillas dobles
				int - Almacena números enteros (números enteros), sin decimales, como 123 o -123
				float - Almacena números de coma flotante, con decimales, como 19,99 o -19,99
				char - Almacena caracteres individuales, como 'A' o 'B'. Los valores Char están entre comillas simples
				boolean - Almacena valores con dos estados: Verdadero o falso*/
		//Ejemplo de variable para guardar texto
		String nombre = "Ada";
		System.out.println(nombre);
		//Variable para guardar un número
		int myNum = 15;
		System.out.println(myNum);
		//	También puede declarar una variable sin asignar el valor y asignar el valor más adelante:
		int otroNum;
		otroNum = 15;
		System.out.println(otroNum);
		/*jugar aquí con pintar myNum en vez de otroNum y ver q pasa o llamar a la segunda var myNum también*/
		//Comentar que existe la convención de si hay varias palabras cada una de ellas empieza en May, varQueGuardaInfoImportante
		// Más ejemplos: declarar varias variables
		int x = 5;
		int y = 6;
		int z = 50;
		System.out.println(x + y + z);
				
		//int x = 5, y = 6, z = 50;
		//System.out.println(x + y + z);
		//Un valor para varias variables
		x = y = z = 50;
		System.out.println(x + y + z);
		/*Identificadores
		Todas las variables Java deben identificarse con nombres únicos.
		Estos nombres únicos se denominan identificadores.
		Los identificadores pueden ser nombres cortos (como x e y) o nombres más descriptivos (edad, suma, volumen total).*/
		//Constantes, variables que son inalterables y de solo lectura,no se puede modificar, se utiliza final y van en MAY
		final byte MAYORIA_EDAD = 18;
		final double PI=3.141592;
	}

}
