/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.estructuras.principal;

import java.util.LinkedList;
import uam.pvoe.estructuras.clases.Alumno;
import uam.pvoe.estructuras.operaciones.OperacionesLista;

/**
 *
 * @author Kirig
 */
public class Principal {

    private static LinkedList listaAlumnos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listaAlumnos = new LinkedList();
        insertarAlumno();
        imprimirLista();
        buscarAlumno("Matricula 2");
        buscarAlumno("Matricula 8");
        recuperarAlumno("Matricula 2");
        recuperarAlumno("Matricula 8");
        borrarAlumno("Matricula 8");
        borrarAlumno("Matricula 2");
    }

    /*Operación para insertar un alumno*/
    public static void insertarAlumno() {
        OperacionesLista operaciones = new OperacionesLista();
        Alumno alumno;
        for (int i = 0; i < 5; i++) {
            alumno = new Alumno();
            alumno.setMatricula("Matricula " + (i + 1));
            alumno.setNombre("Nombre " + (i + 1));
            alumno.setPrimerApellido("Primer Apellido " + (i + 1));
            alumno.setSegundoApellido("Segundo Apellido " + (i + 1));
            alumno.setLicenciatura("Licenciatura " + (i + 1));
            listaAlumnos
                    = operaciones.insertarAlumno(listaAlumnos, alumno);
        }
    }

    /*Operación para imprimir una lista*/
    public static void imprimirLista() {
        OperacionesLista operaciones = new OperacionesLista();
        operaciones.imprimirLista(listaAlumnos);
    }

    /*Operación para buscar un alumno por matrícula*/
    public static void buscarAlumno(String matricula) {
        OperacionesLista operaciones = new OperacionesLista();
        int posicion = operaciones.buscarAlumno(listaAlumnos, matricula);
        if (posicion < 0) {
            System.out.println("El alumno no se encuentra");
        } else {
            System.out.println("El alumno está en la posición "
                    + posicion);
        }
    }


    /*Operación para recuperar un alumno*/
    public static void recuperarAlumno(String matricula) {
        OperacionesLista operaciones = new OperacionesLista();
        int posicion = operaciones.buscarAlumno(listaAlumnos, matricula);
        if (posicion >= 0) {
            Alumno alumno = operaciones.regresaAlumno(listaAlumnos, posicion);
            System.out.println(alumno.toString());
        } else {
            System.out.println("El alumno no se encuentra ");
        }
    }

    /*Operación para borrar un alumno*/
    public static void borrarAlumno(String matricula) {
        OperacionesLista operaciones = new OperacionesLista();
        int posicion = operaciones.buscarAlumno(listaAlumnos, matricula);
        if (posicion >= 0) {
            listaAlumnos = operaciones.borrarAlumno(listaAlumnos,
                    posicion);
            imprimirLista();
        } else {
            System.out.println("El alumno no se encuentra ");
        }
    }

}
