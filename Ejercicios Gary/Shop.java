package objetos;
public class Shop

{
        public static void main(String[] args) {
            double tax = 0.2;
            double total;
           CustomerNew c1 = new CustomerNew();
           c1.setNombre("pinky");
           System.out.println("Hello"+c1.getNombre());
           ClothingNew item1 = new ClothingNew("Blue Jacket", 20.9, 'M');
           ClothingNew item2 = new ClothingNew("Orange T-shirt", 10.5, 'S');
           System.out.println("Iteam 1 datos:"+" "+item1.getDescription()+" "+ item1.getPrice()+ " "+item1.getSize());
           System.out.println("Iteam 2 datos:"+" "+item2.getDescription()+" "+ item2.getPrice()+ " "+item2.getSize());
            total = ((item2.getPrice()*2)+item1.getPrice())*(1+tax);
            System.out.println(total);
           

          
        }
    }
