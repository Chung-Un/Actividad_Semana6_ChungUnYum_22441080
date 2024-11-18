/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_actividad6;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Ejercicio2_Actividad6 {

    public static double descuento(){
    double precioFinal=0;
    if(libro.getEdad() >=18){
    precioFinal = libro.getPrecio() - (libro.getPrecio()*0.25);
    }
    else{
    precioFinal = libro.getPrecio() - (libro.getPrecio()*0.10);
    }
    return precioFinal;
    }
            
    public static void mostrar(){
   
     System.out.println("=============Factura==============\nTitulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor() + "\nISBN:" + libro.getIsbn() + "\nPrecio: " + libro.getPrecio()+ "\nEdad cliente: " + libro.getEdad());  
     
     
    }
    
    public static Libros libro = new Libros();

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo del libro: ");
        libro.setTitulo(entrada.nextLine());
        
        System.out.println("Ingrese el autor del libro: ");
        libro.setAutor(entrada.nextLine());
        
        System.out.println("Ingrese el ISBN del libro: ");
        libro.setIsbn(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Ingrese el precio del libro: Lps.");
        libro.setPrecio(entrada.nextDouble());
        
        System.out.println("Ingrese su edad: ");
        libro.setEdad(entrada.nextInt());
       
        mostrar();
        System.out.println("Precio final (descuento aplicado): Lps." + descuento());
        
    }
    
}
