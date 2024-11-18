/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_actividad6;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Ejercicio1_Actividad6 {
    
    public static empleado empleado = new empleado();
    
    public static void salarioFinal(){
        double salarioFinal;
    
    if(empleado.getSalario()>18900 && empleado.getAnt()>5){
    salarioFinal = empleado.getSalario() + (empleado.getSalario()*0.10);
    System.out.println("Se le agrega un 10% a su salario inicial\nSalario Final: Lps." + salarioFinal);
    }  
    else if( 25000 > empleado.getSalario() && empleado.getSalario()<45000 && empleado.getAnt()>7 ){
    salarioFinal = empleado.getSalario() + (empleado.getSalario()*0.15);
    System.out.println("Se le agrega un 15% a su salario inicial\nSalario Final: Lps." + salarioFinal);
    }
    else if(empleado.getSalario()>45000){
    salarioFinal = empleado.getSalario() + (empleado.getSalario()*0.20);
    System.out.println("Se le agrega un 20% a su salario inicial\nSalario Final: Lps." + salarioFinal);
    }
    
    else{
    System.out.println("No recibira bonificacion, su salario se mantiene");
    }
    }
   

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        empleado.setNombre(entrada.nextLine());
        
        System.out.println("Ingrese su salario Lps.: ");
        empleado.setSalario(entrada.nextDouble());
        
        System.out.println("Ingrese su edad: ");
        empleado.setEdad(entrada.nextInt());
        entrada.nextLine(); //es para consumir la linea, si no no dejaba ingresar el genero
        
        System.out.println("Ingrese su genero:");
        empleado.setGenero(entrada.nextLine());
        
        System.out.println("Ingrese cantidad de years en la empresa: ");
        empleado.setAnt(entrada.nextInt());
        
        System.out.println("Perfil de empleado\nNombre: " + empleado.getNombre() + "\nEdad: " + empleado.getEdad() + "\nGenero: " + empleado.getGenero()+ "\nSalario inicial: Lps." + empleado.getSalario() + "\nAntiguedad en la empresa: "+ empleado.getAnt());
        salarioFinal();
    }
    
    
}
