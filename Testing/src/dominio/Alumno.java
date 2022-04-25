package dominio;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Alumno extends Persona{
    
    private String curso;

    public Alumno() {
        super();
        this.curso = "";
    }

    public Alumno(String DNI, String nombre, String curso) {
        super(DNI, nombre);
        this.curso = curso;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void leer(){
        super.leer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Curso:");
        this.curso = sc.nextLine();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Curso:").append(curso).append("\n");
        return sb.toString();
    }
    
}
