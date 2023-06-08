import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(new Alumno(95919798,"Simon","Nava",32,10.0,10, false));
        alumnos.add(new Alumno(12345678,"Laura","Gomez",25,9.5,0, false));
        alumnos.add(new Alumno(98765432,"Carlos","Rodriguez",28,8.7,1, true));
        alumnos.add(new Alumno(55555555,"Ana","Lopez",22,7.2,2, false));
        alumnos.add(new Alumno(11111111,"Pedro","Fernandez",30,9.8,3, false));
        alumnos.add(new Alumno(99999999,"Marta","Martinez",27,6.5,5, true));
        alumnos.add(new Alumno(44444444,"Luis","Gonzalez",29,8.9,0, false));
        alumnos.add(new Alumno(77777777,"Maria","Sanchez",24,7.8,1, true));
        String opcion = "";

        while(opcion != "i"){
            System.out.println("Menu Principal");
            System.out.println("Ingrese a Listar alumnos ordenados de forma decreciente");
            System.out.println("Ingrese b Obtener el promedio de edad de los alumnos");
            System.out.println("Ingrese c Informar los alumnos que adeudan materias de la secundaria");
            System.out.println("Ingrese d Encontrar el alumno con la nota mas alta");
            System.out.println("Ingrese e Informar si algun alumno no abono la matricula");
            System.out.println("Ingrese f Agregar un nuevo alumno");
            System.out.println("Ingrese g Eliminar un alumno");
            System.out.println("Ingrese h Modificar un alumno");
            System.out.println("Ingrese i Salir");
            System.out.println("------------------------");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.next();

            switch (opcion) {
                case "a":
                    System.out.println("ALumnos ordenados de forma decreciente por nombre");
                    Collections.sort(alumnos, new Comparator<Alumno>() {
                        @Override
                        public int compare(Alumno alumno1, Alumno alumno2) {
                            return alumno1.getNombre().compareTo(alumno2.getNombre());
                        }
                    });
                    for (Alumno alumno : alumnos) {
                        System.out.println("------------------------");
                        System.out.println(alumno.toString());
                        System.out.println("------------------------");
                    }
                    break;
                case "b":
                    System.out.println("Promedio de edad de los alumnos");
                    int sumaEdades = 0;
                    for (Alumno alumno : alumnos) {
                        sumaEdades += alumno.getEdad();
                    }
                    System.out.println("El promedio de edad de los alumnos es: " + (sumaEdades / alumnos.size()));
                    break;
                case "c":
                    System.out.println("Alumnos que adeudan materias de la secundaria");
                    for (Alumno alumno : alumnos) {
                        if (alumno.getMateriaAdeudadas() > 0) {
                            System.out.println("------------------------");
                            System.out.println(alumno.toString());
                            System.out.println("------------------------");
                        }
                    }
                    break;
                case "d":
                    System.out.println("Alumno con la nota mas alta");
                    Alumno alumnoNotaMasAlta = alumnos.get(0);
                    for (Alumno alumno : alumnos) {
                        if (alumno.getNota() > alumnoNotaMasAlta.getNota()) {
                            alumnoNotaMasAlta = alumno;
                        }
                    }
                    System.out.println("------------------------");
                    System.out.println("Dni: " + alumnoNotaMasAlta.getDni() + ", Apellido: " + alumnoNotaMasAlta.getApellido() + ", Nombre: " + alumnoNotaMasAlta.getNombre() + ", Edad: " + alumnoNotaMasAlta.getEdad() + ", Nota: " + alumnoNotaMasAlta.getNota());
                    break;
                case "e":
                    System.out.println("Alumnos que no abonaron la matricula");
                    for (Alumno alumno : alumnos) {
                        if (!alumno.isAbonoMatricula()) {
                            System.out.println("------------------------");
                            System.out.println(alumno.toString());
                            System.out.println("------------------------");
                        }
                    }
                    break;
                case "f":
                    System.out.println("Agregar un nuevo alumno");
                    System.out.print("Ingrese el dni: ");
                    int dni = scanner.nextInt();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese la nota: ");
                    double nota = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad de materias adeudadas: ");
                    int materiasAdeudadas = scanner.nextInt();
                    System.out.print("Ingrese si abono la matricula: ");
                    boolean abonoMatricula = scanner.nextBoolean();
                    alumnos.add(new Alumno(dni, nombre, apellido, edad, nota, materiasAdeudadas, abonoMatricula));
                    break;
                case "g":
                    System.out.println("Eliminar un alumno");
                    System.out.print("Ingrese el dni del alumno a eliminar: ");
                    int dniAlumnoEliminar = scanner.nextInt();
                    for (Alumno alumno : alumnos) {
                        if (alumno.getDni() == dniAlumnoEliminar) {
                            alumnos.remove(alumno);
                            break;
                        }
                    }
                    break;
                case "h":
                    for (Alumno alumno : alumnos) {
                        System.out.println("------------------------");
                        System.out.println(alumno.toString());
                        System.out.println("------------------------");
                    }
                    System.out.println("ingrese dni del alumno a modificar");
                    int dniAlumno = scanner.nextInt();
                    boolean encontrado = false;

                    for (Alumno alumno : alumnos) {
                        if (alumno.getDni() == dniAlumno) {
                            System.out.println("Ingrese el nuevo dato para el alumno:");
                            System.out.println("1. Nombre");
                            System.out.println("2. Apellido");
                            System.out.println("3. Edad");
                            System.out.println("4. Nota");
                            System.out.println("5. Materia Adeudada");
                            System.out.println("6. Matricula");
                            System.out.print("Ingrese su opción: ");
                            int opcionModificar = scanner.nextInt();

                            switch (opcionModificar) {
                                case 1:
                                    System.out.print("Ingrese el nuevo nombre: ");
                                    String nuevoNombre = scanner.next();
                                    alumno.setNombre(nuevoNombre);
                                    System.out.println("Nombre modificado con éxito.");
                                    break;
                                case 2:
                                    System.out.print("Ingrese el nuevo apellido: ");
                                    String nuevoApellido = scanner.next();
                                    alumno.setApellido(nuevoApellido);
                                    System.out.println("Apellido modificado con éxito.");
                                    break;
                                case 3:
                                    System.out.print("Ingrese la nueva edad: ");
                                    int nuevaEdad = scanner.nextInt();
                                    alumno.setEdad(nuevaEdad);
                                    System.out.println("Edad modificada con éxito.");
                                    break;
                                case 4:
                                    System.out.print("Ingrese la nueva nota: ");
                                    double nuevaNota = scanner.nextDouble();
                                    alumno.setNota(nuevaNota);
                                    System.out.println("Nota modificada con éxito.");
                                    break;
                                case 5:
                                    System.out.print("Ingrese si adeuda materias (true/false): ");
                                    int nuevasMateriaAdeudada = scanner.nextInt();
                                    alumno.setMateriaAdeudadas(nuevasMateriaAdeudada);
                                    System.out.println("Materia adeudada modificada con éxito.");
                                    break;
                                case 6:
                                    System.out.print("Ingrese la nueva adeuda matrícula: ");
                                    boolean nuevaAdeudaMatricula = scanner.nextBoolean();
                                    alumno.setAbonoMatricula(nuevaAdeudaMatricula);
                                    System.out.println("Adeunda Matrícula modificada con éxito.");
                                    break;
                                default:
                                    System.out.println("Opción inválida.");
                                    break;
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró ningún alumno con ese dni.");
                    }
                    break;
                case "i":
                    System.out.println("Salir");
                    opcion = "i";
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
        }
        System.out.println("Finalizo el programa");
    }
}