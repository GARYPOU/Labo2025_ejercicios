package Oracle;

public class Clothing2 implements Comparable<Clothing2>{
    private String descripcion;
    private double precio;
    private String talla="M";

    public final static double MIN_PRECIO = 10.0;
    public final static double TAX_RATE = 0.2;

    public Clothing2(String descripcion, double precio, String atalla){
        this.descripcion=descripcion;
        this.precio=precio;
        talla = atalla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio + (precio *  TAX_RATE);
    }

    public void setPrecio(double precio) {
        this.precio = (precio > MIN_PRECIO) ? precio : MIN_PRECIO;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString(){
        return getDescripcion() +","+ getTalla() +","+ getPrecio();
    }

    @Override
    public int compareTo(Clothing2 c){
        return this.descripcion.compareTo(c.descripcion);
    }


    public static void main(String[] args) {

    }
}