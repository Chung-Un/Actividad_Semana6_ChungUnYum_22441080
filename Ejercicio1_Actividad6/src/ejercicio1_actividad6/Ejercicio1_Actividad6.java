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
    
    public static void salarioFinal(){
        double salarioFinal;
    
    if(Empleado[0].getSalario()>18900 && Empleado[0].getAnt()>5){
    salarioFinal = Empleado[0].getSalario() + (Empleado[0].getSalario()*0.10);
    System.out.println("Se le agrega un 10% a su salario inicial\nSalario Final: Lps." + salarioFinal);
    }  
    else if( 25000 > Empleado[0].getSalario() && Empleado[0].getSalario()<45000 && Empleado[0].getAnt()>7 ){
    salarioFinal = Empleado[0].getSalario() + (Empleado[0].getSalario()*0.15);
    System.out.println("Se le agrega un 15% a su salario inicial\nSalario Final: Lps." + salarioFinal);
    }
    else if(Empleado[0].getSalario()>4500){
    salarioFinal = Empleado[0].getSalario() + (Empleado[0].getSalario()*0.20);
    System.out.println("Se le agrega un 20% a su salario inicial\nSalario Final: Lps." + salarioFinal);
    }
    
    else{
    System.out.println("No recibira bonificacion, su salario se mantiene");
    }
    }
    
    public static empleado Empleado[] = new empleado[1];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        Empleado[0] = new empleado();
        Empleado[0].setNombre(entrada.nextLine());
        
        System.out.println("Ingrese su salario Lps.: ");
        Empleado[0].setSalario(entrada.nextDouble());
        
        System.out.println("Ingrese su edad: ");
        Empleado[0].setEdad(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Ingrese su genero:");
        Empleado[0].setGenero(entrada.nextLine());
        
        System.out.println("Ingrese cantidad de years en la empresa: ");
        Empleado[0].setAnt(entrada.nextInt());
        
        System.out.println("Perfil de empleado\nNombre: " + Empleado[0].getNombre() + "\nEdad: " + Empleado[0].getEdad() + "\nGenero: " + Empleado[0].getGenero()+ "\nSalario inicial: Lps." + Empleado[0].getSalario() + "\nAntiguedad en la empresa: "+Empleado[0].getAnt());
        salarioFinal();
    }
    
    
}
