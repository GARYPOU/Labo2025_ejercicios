import java.time.LocalDate;

public class Producto {
    private int codigo;
    private String nombre_producto;
    private String marca;
    private String producto_empresa;
    private LocalDate fecha_envasado;
    private double precio;

    public Producto(int codigo, String nombre_producto, String marca, String producto_empresa, LocalDate fecha_envasado, double precio) {
        this.codigo = codigo;
        this.nombre_producto = nombre_producto;
        this.marca = marca;
        this.producto_empresa = producto_empresa;
        this.fecha_envasado = fecha_envasado;
        this.precio = precio;
    }

    public Producto() {
        this.codigo = 1;
        this.nombre_producto = "botella";
        this.marca = "Smart";
        this.producto_empresa = "Walmart";
        this.fecha_envasado = LocalDate.of(2000,5,20);
        this.precio = 1000;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProducto_empresa() {
        return producto_empresa;
    }

    public void setProducto_empresa(String producto_empresa) {
        this.producto_empresa = producto_empresa;
    }

    public LocalDate getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(LocalDate fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
