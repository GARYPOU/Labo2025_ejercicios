package Oracle;

public class Customer2{
    private String nombre;
    private String size;

    private Clothing2[] items;


    public Customer2(String nombre, int measurement){
        this.nombre=nombre;
        setSize(measurement);
    }

    public Customer2(){
        this.nombre = "felipe";
        this.size = "M";


    }


    public void additems(Clothing2[] someItems){
        items = someItems;
    }

    public Clothing2[] getItems(){
        return items;
    }

    public double getTotalClothingCost(){

        double total = 0.0;

        for (Clothing2 item : items) {
//          if (c1.getSize().equals(item.getTalla())){
                total = total + item.getPrecio();
               // System.out.println("Iteam :" + ", " + item.getDescripcion() + ", " + item.getPrecio() + ", " + item.getTalla());

//                total = total + total * tax;
//                if (total > 15){
//                    break;
//                }
            //}
        }
        return total;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                size="S";
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

    public static void main(String[] args) {

    }
}