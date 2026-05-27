package fuentesclase.tema2;

import java.util.Scanner;

public class Ejercicio01Par {

	public static void main(String[] args) {
		//Programa que pida un número al usuario y muestre por pantalla si es par o impar
		Scanner sc = new Scanner(System.in);
		int num; // número introducido por el usuario
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		if (num % 2 == 0) { // si num es par
			System.out.println("Es par");
		} else { // es impar
			System.out.println("Es impar");
		}
	}
}
