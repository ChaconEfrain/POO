/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_Consola;

/**
 *
 * @author Dell
 */
public class Cuenta { 

    //Atributos del objeto
    private String titular;
    private double dinero;                                                                                                                                                                                                                                                                                                                                                                      
    
    //Constructores del objeto (Siempre se llaman igual que la clase)
    public Cuenta(String titular){
        //this(titular, 0);
        this.titular = titular;
        this.dinero = 0;
    }
    public Cuenta(String titular, double dinero){
        this.titular = titular;
        if(dinero < 0){
            this.dinero = 0;
        }else{
            this.dinero = dinero;
        }
    }
    //Getter y Setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDinero() {
        return dinero;
    }
    
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    //Métodos para reutilizar en la main class para varios objetos
    public void ingresar(double dinero){
        if(dinero > 0){
            this.dinero += dinero;
        }
    }
    public void retirar(double dinero){
        double dineroTotal = this.dinero - dinero;
        if(dineroTotal < 0){
            this.dinero = 0;
        }else{
           this.dinero -= dinero;
        }
    }
    public String toString(){
        return "El titular de la cuenta " + this.titular + " tiene " + this.dinero + " dólares en su cuenta.";
    }
}

