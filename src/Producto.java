 public class Producto {
        private String nombre;
        private double precio;
        private String marca;

        private double impuesto;

        public Producto( String nombre, double precio, String marca, double impuesto) {
            this.nombre = nombre;
            this.precio = precio;
            this.marca = marca;
            this.impuesto = impuesto;
        }

        // Métodos getter y setter para cada atributo
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

         public double getImpuesto() {
             return impuesto;
         }

         public void setImpuesto(double impuesto) {
             this.impuesto = impuesto;
         }

     @Override
     public String toString() {
         return "Producto" + " "+
                 "nombre= " + nombre + '\'' +
                 ", precio= " + precio +
                 ", marca= " + marca;
     }

     public double calcularPrecioTotal (double precio) {

            return precio;
     }
 }

