package com.firstday.firstday;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstdayApplication {


//******************************Ejercicio 1*******************************/
//Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, 
//producto y división.


public static void calcule(int num1, int num2){
int suma=num1+num2;
int resta=num1-num2;
int producto=num1*num2;
int division=num1/num2;

System.out.println("La suma de los números entregados es: " + suma);
System.out.println("La resta de los números entregados es:  " + resta);
System.out.println("El producto de los números entregados es:  " + producto);
System.out.println("La división de los números entregados es:  " + division);
}


//******************************Ejercicio 2*******************************/
/*Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su 
programa para que ahora calcule el área de un cuadrado de igual medida al ancho del 
rectángulo anterior*/

public static void superficie(int ancho, int largo){
	
	
	int rect = ancho*largo;
	int cuad = ancho*ancho;

	int respuesta = 0;

	if(respuesta==1){
	System.out.println("El área del rectángulo es: " + rect);
	}else{
	System.out.println("El área del cuadrado es: " + cuad );	
	}

}

//******************************Ejercicio 3*******************************/
//Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las 
//horas que trabaja y el valor por hora ($H/H) que recibe.

public static void sueldo (int horasTrabajadas, int valorHora){

	int sueldo = horasTrabajadas*valorHora;

	System.out.println("Su sueldo semanal es: "+ sueldo);

}

//******************************Ejercicio 4*******************************/
//Escriba un algoritmo que permita para determinar cuánto pagará finalmente una persona por 
//un artículo, considerando que tiene un descuento de 20%, y debe pagar 15% de IVA

public static void precio (double bruto, double  dcto, double iva){
	double precioFinal= (bruto* dcto) * iva;
	System.out.println("El monto total a pagar es $" +precioFinal);
}

//******************************Ejercicio 5*******************************/
//Escriba un programa que lea un número del teclado e imprima en pantalla si es par o impar

public static void numero (int num1){
	if(num1%2==0){
		System.out.println("El número ingresado es par. ");
	}else{
		System.out.println("El número ingresado es impar.");
	}
}

//******************************Ejercicio 6*******************************/
//Escriba un programa que imprima los números del 100 al 1 de dos en dos

public static void listado (){
	for(int i=100; i>=1; i-=2){
		System.out.print(i+", ");
	}
}

//******************************Ejercicio 7*******************************/
//Escriba un programa que imprima todos los números pares entre 0 y 100.

public static void pares (){
	for(int i=0; i<=100; i++){
		if(i%2==0){
			System.out.print(i+", ");
		}
	}
	System.out.print(".");
	}

//******************************Ejercicio 8*******************************/
//Escriba un programa que imprima la suma de los 100 primeros números naturales.

 
public static void suma (){
	int sumador=0;
	for(int i=1; i<=100;i++){
		sumador = sumador+i; 
	}
	System.out.println("La suma de los 100 primeros números naturales es: "+sumador);
}

//******************************Ejercicio 9*******************************/
//Escriba un programa que imprima los números impares entre dos extremos dados por el usuario 
//y que además indique cuántos son.

public static void impares (int num1, int num2){

	int contador= 0; 

	for(int i=num1; i<=num2; i++){
		if(i%2 !=0){
			System.out.print(i+", ");
		}
	  	contador++;
    }
	System.out.println("El total de números del listado es: "+contador);
}

//******************************Ejercicio 10*******************************/
//Escriba un programa que imprima los números del 1 al 100, que calcule la suma de todos los 
//números pares y la suma de todos los impares.

public static void sumas (){
int sumador1=0; 
int sumador2=0; 

	for(int i=1; i<=100; i++){
		if (i%2==0) {
			sumador1 = sumador1+i;
		}else{
			sumador2= sumador2+i;
		}
	}
	
System.out.println("La suma de los números pares entre el 1 y el 100 es: "+sumador1);
System.out.println("La suma de los números impares entre el 1 y el 100 es: "+sumador2);
}


	public static void main(String[] args) {

//******************************Ejercicio 1*******************************/

Scanner teclado = new Scanner(System.in);

System.out.println("Ejercicio 1"); 
System.out.print("Ingrese número 1:");
int in1 = teclado.nextInt();

System.out.print("Ingrese número 2:");
int in2 = teclado.nextInt();

calcule(in1,in2);

System.out.println("******************************************************************************");


//******************************Ejercicio 2*******************************/
System.out.println("Ejercicio 2");
System.out.print("Inserte ancho:");
int ancho = teclado.nextInt();

System.out.print("Inserte largo: ");
int largo= teclado.nextInt();

System.out.print("Si quiere conocer el área del rectángulo ingrese 1, si quiere conocer el área de un cuadradado ingrese 2: ");
int respuesta= teclado.nextInt();
superficie(ancho, largo);

System.out.println("******************************************************************************");
//******************************Ejercicio 3*******************************/
System.out.println("Ejercicio 3");
System.out.println("Ingrese las horas trabajadas a la semana: ");
int inputHoras= teclado.nextInt();
System.out.println("Ingrese el valor Hora de su trabajo: ");
int inputValor= teclado.nextInt(); 

sueldo(inputHoras, inputValor);
System.out.println("******************************************************************************");

//******************************Ejercicio 4*******************************/
System.out.println("Ejercicio 4");
double dcto= 0.8;
double iva=1.11;

System.out.println("Ingrese monto bruto a pagar: ");
double bruto= teclado.nextInt();

precio(bruto,dcto, iva);
System.out.println("******************************************************************************");

//******************************Ejercicio 5*******************************/
System.out.println("Ejercicio 5"); 
System.out.print("Ingrese un número: ");
int innum = teclado.nextInt(); 

numero(innum);
System.out.println("******************************************************************************");

//******************************Ejercicio 6*******************************/
System.out.println("Ejercicio 6");
listado(); 
System.out.println("******************************************************************************");

//******************************Ejercicio 7*******************************/
System.out.println("Ejercicio 7");
pares(); 
System.out.println("******************************************************************************");

//******************************Ejercicio 8*******************************/
System.out.println("Ejercicio 8");
suma(); 
System.out.println("******************************************************************************");

//******************************Ejercicio 9*******************************/
System.out.println("Ejercicio 9"); 
System.out.print("Ingrese el extremo inferior de un listado de números ");
int num1 =teclado.nextInt(); 

System.out.print("Ingrese el extremo superior de un listado de números ");
int num2 = teclado.nextInt(); 

impares(num1, num2); 
System.out.println("******************************************************************************");

//******************************Ejercicio 10*******************************/
System.out.println("Ejercicio 10");
sumas();
System.out.println("******************************************************************************");


teclado.close();
 }
}



