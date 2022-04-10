/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_Consola;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Cuenta_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
//El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
//Crea sus métodos get, set y toString.
//Tendrá dos métodos especiales:
//ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
//retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual 
        
//Estos pilares son: abstracción, encapsulamiento, herencia y polimorfismo
        
        //Estructura para instanciar un objeto: 
        //nombre de la clase + nombre del objeto = new + nombre de la clase(parámetros de los constructores);
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular:");
        String titular = lector.next();
        System.out.println("Cuánto dinero desea ingresar?");
        double dinero = lector.nextInt();
        Cuenta oCuenta_1 = new Cuenta(titular, dinero); //Aquí se crea el objeto (oCuenta_1)
       
        
        //Ingresar dinero
        oCuenta_1.ingresar(2000.50); //Aquí se llama al método (ingresar)
        
        
        //Retirar dinero
        oCuenta_1.retirar(1000); //Aquí se llama al método (retirar)
        
        
        //Imprimir valores de las cuentas
        System.out.println(oCuenta_1.toString()); //Aquí se llama al método (toString)
       
    }
    
}
