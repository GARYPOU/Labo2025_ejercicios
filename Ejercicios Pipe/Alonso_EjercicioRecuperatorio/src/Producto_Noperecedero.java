import java.time.LocalDate;

public class Producto_Noperecedero extends Producto {
    private double peso_paquete;
    private boolean envoltorio_reciclable;

    public Producto_Noperecedero(int codigo, String nombre_producto, String marca, String producto_empresa, LocalDate fecha_envasado, double precio, boolean envoltorio_reciclable, double peso_paquete) {
        super(codigo, nombre_producto, marca, producto_empresa, fecha_envasado, precio);
        this.envoltorio_reciclable = envoltorio_reciclable;
        this.peso_paquete = peso_paquete;
    }

    public Producto_Noperecedero() {
        this.envoltorio_reciclable = true;
        this.peso_paquete = 10.5;
    }
}
