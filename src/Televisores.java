public class Televisores extends Producto{
    int pulgadas = 0;
    String resolucion = "";
    public Televisores(String nombre, double precio, String marca, double impuesto, int pulgadas, String resolucion) {
        super( nombre, precio, marca, impuesto);
        this.pulgadas = pulgadas;
        this.resolucion= resolucion;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " pulgadas=" + pulgadas +
                " resolucion='" + resolucion + '\'';
    }
    public double calcularPrecioTotal (double precio) {
        return precio * (1 + super.getImpuesto());
    }
}
