public class Telefono extends Producto {
    String sistemaOperativo = "";
    double pixeles = 0.0;
    String modelo = "";

    public Telefono( String nombre, double precio, String marca, double impuesto, String sistemaOperativo, double pixeles, String modelo) {
        super(nombre, precio, marca, impuesto);
        this.sistemaOperativo = sistemaOperativo;
        this.pixeles = pixeles;
        this.modelo = modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPixeles() {
        return pixeles;
    }

    public void setPixeles(double pixeles) {
        this.pixeles = pixeles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telefono " + super.toString() +
                " sistemaOperativo='" + sistemaOperativo + '\'' +
                " pixeles=" + pixeles +
                " modelo='" + modelo + '\'';
    }
    @Override
    public double calcularPrecioTotal (double precio) {
        return precio * (1 + super.getImpuesto());
    }


}
