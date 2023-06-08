public class Alumno {
    int dni;
    String nombre;
    String apellido;
    int edad;
    double nota;
    int materiaAdeudadas;
    boolean abonoMatricula;


    public Alumno( int dni, String nombre, String apellido, int edad, double nota, int materiaAdeudadas, boolean abonoMatricula) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
        this.materiaAdeudadas = materiaAdeudadas;
        this.abonoMatricula = abonoMatricula;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getMateriaAdeudadas() {
        return materiaAdeudadas;
    }

    public void setMateriaAdeudadas(int materiaAdeudadas) {
        this.materiaAdeudadas = materiaAdeudadas;
    }

    public boolean isAbonoMatricula() {
        return abonoMatricula;
    }

    public void setAbonoMatricula(boolean abonoMatricula) {
        this.abonoMatricula = abonoMatricula;
    }



    @Override
    public String toString() {
        return "Alumno " +
                " Dni= " + dni + '\''+
                " nombre= " + nombre + '\'' +
                " apellido= " + apellido + '\'' +
                " edad= " + edad +
                " nota= " + nota +
                " materiaAdeudadas =" + materiaAdeudadas +
                " abono matricula =" + abonoMatricula;
    }
}
