package Oracle;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private String cumple;
    private ArrayList<Integer>notas;

    public Alumno(){
        String nombre = "feli";
        String apellido = "nashe";
        String cumple = "2008/05/01";
        ArrayList<Integer>notas = new ArrayList<>();
    }

    public Alumno(String nombre, String apellido, String cumple, ArrayList<Integer>notas){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cumple=cumple;
        this.notas=notas;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getCumple(){
        return cumple;
    }
    public void setCumple(String cumple){
        this.cumple=cumple;
    }
    public ArrayList<Integer> getNotas(){
        return notas;
    }
    public void setNotas(ArrayList<Integer>notas){
        this.notas=notas;
    }

    public void agregarnotas(int n){
        notas.add(n);
    }

    public void menornota(){
        int notamenor=11;
        for(int n: notas){
            if(1<2){
                notamenor=n;
                System.out.println(notamenor);
                System.out.println(notamenor);
                System.out.println(notamenor);
                System.out.println(notamenor);
                System.out.println(notamenor);
            }
        }
    }















    public static void main(String[] args) {
        Alumno A1 = new Alumno("marcelo", "caca", "3948/84/39", new ArrayList<Integer>(1));
        A1.menornota();
    }



}