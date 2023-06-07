
public class Main {
    public static void main(String[] args) {
        Telefono t = new Telefono("smartphone",35000.0,"samsung",0.15,"android", 50.0, "s20" );
        Laptos l = new Laptos("notebook 12",500000.00,"asus",0.20, "16gb");
        Televisores tele = new Televisores("smarttv", 450000.00, "samsung", 0.25, 75, "4k");
        /*
        System.out.println(t.toString());
        t.setPixeles(40.12);
        System.out.println(t.toString());
        System.out.println(t.getModelo());
         */
        System.out.println(l);
        System.out.println(tele);
        System.out.println(t);
        System.out.println(t.calcularPrecioTotal(t.getPrecio()));
    }
}