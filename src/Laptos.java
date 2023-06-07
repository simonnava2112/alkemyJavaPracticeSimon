public class Laptos extends Producto{
    String memoriaRam;
    public Laptos( String nombre, double precio, String marca, double impuesto, String memoriaRam) {
        super( nombre, precio, marca, impuesto);
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "Laptos "+ super.toString() +
                " memoriaRam='" + memoriaRam + '\'';
    }
    public double calcularPrecioTotal (double precio) {
        return precio * (1 + super.getImpuesto());
    }
}
