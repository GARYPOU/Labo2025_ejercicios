public class Shopapp{
    public static void main(String[] args) {
        Customer2 c1 = new Customer2("pinky", 3);

        double tax = 0.2;

        double total = 0.0;

        //c1.setNombre("pinky");
        //c1.setSize("S");

        System.out.println("min precio" + Clothing2.MIN_PRECIO);


        Clothing2 item1 = new Clothing2("Campera azul", 20.9, "M");
        Clothing2 item2 = new Clothing2("Remera naranja", 10.5, "S");
        Clothing2[] items = {item1, item2, new Clothing2("bufanda verde", 5.0, "S"), new Clothing2("Remera azul", 10.5, "S")};


        //System.out.println("Iteam 1 :" + ", " + item1.getDescripcion() + ", " + item1.getPrecio() + ", " + item1.getTalla());
        //System.out.println("Iteam 2 :" + ", " + item2.getDescripcion() + ", " + item2.getPrecio() + ", " + item2.getTalla());
        //total = (item1.getPrecio()+(item2.getPrecio()*2)*(1+tax));

        int measurement = 8;

        c1.additems(items);

        //c1.setSize(measurement);

        System.out.println("Nombre del customer es "+c1.getNombre() + "," + c1.getSize() + "," + c1.getTotalClothingCost());
        for (Clothing2 item : c1.getItems()) {
            System.out.println("items" + " " + item.getDescripcion());
        }

    }
}