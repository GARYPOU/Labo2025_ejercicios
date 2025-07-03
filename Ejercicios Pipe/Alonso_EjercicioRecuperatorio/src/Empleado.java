import java.time.LocalDate;
import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private LocalDate fecha_ingreso;
    private double salario;
    private ArrayList<Producto>regalos;

    public Empleado(String nombre, String apellido, LocalDate fecha_nacimiento, LocalDate fecha_ingreso, double salario, ArrayList<Producto> regalos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = fecha_ingreso;
        this.salario = salario;
        this.regalos = regalos;
    }

    public Empleado() {
        this.nombre = "Juan";
        this.apellido = "Pedro";
        this.fecha_nacimiento = LocalDate.of(1999,1,22);
        this.fecha_ingreso = LocalDate.of(2023,2,8);
        this.salario = 100000;
        this.regalos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Producto> getRegalos() {
        return regalos;
    }

    public void setRegalos(ArrayList<Producto> regalos) {
        this.regalos = regalos;
    }
}
