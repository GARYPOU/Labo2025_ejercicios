import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto>productos;
    private String domicilio;
    private String nombre_empresa;
    private ArrayList<Empleado>empleados;

    public Empresa(ArrayList<Producto> productos, String domicilio, String nombre_empresa, ArrayList<Empleado> empleados) {
        this.productos = productos;
        this.domicilio = domicilio;
        this.nombre_empresa = nombre_empresa;
        this.empleados = empleados;
    }

    public Empresa(){
        this.productos = new ArrayList<>();
        this.domicilio = "Mercedes 13";
        this.nombre_empresa = "Walmart";
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    //3)
    public void cant_regalos(){

        int regalos_totales = 0;
        for (Empleado em: empleados){
            regalos_totales+=(em.getRegalos().size())*2;
        }
        System.out.println("los regalos que hay que darle a la empresa son: "+ regalos_totales);
    }

    //5)
    public double plata_total(){
        double total = 0;
        for (Empleado em: empleados){
                    total+=em.getSalario();
        }
        return total;
    }
}
