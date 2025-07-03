import java.time.LocalDate;

public class Producto_Perecedero extends Producto{
    private LocalDate fecha_vencimiento;
    private int dias_ya_vencido;

    public Producto_Perecedero(int codigo, String nombre_producto, String marca, String producto_empresa, LocalDate fecha_envasado, double precio, LocalDate fecha_vencimiento, int dias_ya_vencido) {
        super(codigo, nombre_producto, marca, producto_empresa, fecha_envasado, precio);
        this.fecha_vencimiento = fecha_vencimiento;
        this.dias_ya_vencido = dias_ya_vencido;
    }

    public Producto_Perecedero() {
        this.fecha_vencimiento = LocalDate.of(2025,9,10);
        this.dias_ya_vencido = 10;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getDias_ya_vencido() {
        return dias_ya_vencido;
    }

    public void setDias_ya_vencido(int dias_ya_vencido) {
        this.dias_ya_vencido = dias_ya_vencido;
    }

    public boolean esta_vencido(Producto product){
        boolean vencido = true;
        if(fecha_vencimiento.isAfter(LocalDate.now())){
            vencido= false;
        }
        return vencido;
    }

    //6)
    public int producto_ya_vencido(Producto_Perecedero producto){
        int vencido = -1;
        if(!esta_vencido(producto)){
            return vencido = (LocalDate.now().getDayOfYear()-producto.fecha_vencimiento.getDayOfYear());
        }
        return vencido;
    }
}
