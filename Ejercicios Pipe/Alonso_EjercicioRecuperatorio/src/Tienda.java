import java.util.ArrayList;

public class Tienda {
    private ArrayList<Empresa>empresas;
    private ArrayList<Producto>productos_tienda;

    public Tienda(ArrayList<Empresa> empresas, ArrayList<Producto>productos) {
        this.empresas = empresas;
        this.productos_tienda = productos;
    }

    public Tienda() {
        this.empresas = new ArrayList<>();
        this.productos_tienda = new ArrayList<>();
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Producto> getProductos() {
        return productos_tienda;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos_tienda = productos;
    }



    //2)
    public void productos_vencidos(){
        for(Producto p: productos_tienda){
            if(p instanceof Producto_Perecedero){
                if (((Producto_Perecedero) p).esta_vencido(p)){
                    System.out.println("nombre del producto:"+p.getNombre_producto()+" y la marca es:"+p.getMarca());
                }
            }
        }
    }


    //4)
    public Empresa empresa_mayor_cantidad(){
        int mayor =0;
        Empresa mayorempresa = new Empresa();
        for (Empresa e: empresas){
            if(e.getProductos().size()>=mayor){
                mayor=e.getProductos().size();
                mayorempresa = e;
            }
        }
        return mayorempresa;
    }

    //7)
    public void si_tiene_beneficio(){

    }

}
