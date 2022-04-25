/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Persona {
    
    private String DNI;
    private String nombre;

    public Persona() {
        this.DNI = "";
        this.nombre = "";
    }

    public Persona(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }
    
    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI:");
        this.DNI = sc.nextLine();
        System.out.print("Nombre:");
        this.nombre = sc.nextLine();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("DNI:").append(DNI).append("\n");
        sb.append("Nombre:").append(nombre).append("\n");
        return sb.toString();
    }
    
}
