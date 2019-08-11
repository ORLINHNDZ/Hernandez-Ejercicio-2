package com.hernandez;
import java.util.ArrayList;
import com.hernandez.excepciones.ErrorValidacion;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner element = new Scanner(System.in);
        ArrayList<Turista> Turistas = new ArrayList();


        System.out.println("BIENVENIDO");
        boolean y = true;
        while (y == true){
            System.out.println("1. Ingresar nuevo turista: ");
            System.out.println("2. Mostrar turistas: ");
            System.out.println("3. Ingresar nuevo turista: ");
            int opc = LectorDeDatos.solicitarEntero("Eliga su opcion: ");
            switch (opc){
                case 1:
                    int cont = 0;
                    Turista IngresoTurista = new Turista();
                    boolean i = true;
                    while (i == true){
                        System.out.println("REGISTRO DE NUEVO TURISTA");
                        System.out.println("Ingrese el nombre del turista: ");
                        String nom = element.nextLine();
                        System.out.println("Ingrese el número de teléfono");
                        String tel = element.nextLine();
                    try {
                        IngresoTurista.setNombre(nom);

                        IngresoTurista.setTelefono(tel);
                        i = false;
                    } catch (ErrorValidacion errorValidacion) {
                        System.err.println(errorValidacion.getMessage());
                        i = true;
                    }
                        for (Turista t : Turistas) {
                            if (tel.equals(t.telefono)) {
                                t.setContador(1);
                                cont = 1;
                                break;
                            }
                        }
                    }
                    if (cont == 0) {
                        IngresoTurista.setContador(0);
                        Turistas.add(IngresoTurista);
                    }
                    break;
                case 2:
                    if (Turistas.isEmpty()) {
                        System.out.println("No hay registros");
                    }
                    for (Turista t : Turistas){
                        System.out.println(t.getNombre() + " , " + t.getTelefono() + " , Cantidad: " + t.getContador());
                    }
                    break;
                case 3:
                    y = false;
                    System.out.println("Cerrando sistma");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}


