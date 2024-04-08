package ar.edu.unju.fi.model;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
	}

}