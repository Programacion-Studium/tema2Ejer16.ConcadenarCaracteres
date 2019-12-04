package es.Studium.ConcadenarCaracteres;

import java.util.Scanner;

public class Concadenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a, b; //Caracteres
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca la primera letra");
		a = teclado.next().charAt(0);
		System.out.println("Introduzca la segunda letra");
		b = teclado.next().charAt(0);
		teclado.close();
		System.out.println(a+""+b);//ponemos un caracter vacio para que haga la concadenacion.
	}
}