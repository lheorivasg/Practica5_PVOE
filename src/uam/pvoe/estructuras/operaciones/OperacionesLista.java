/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.estructuras.operaciones;

import java.util.LinkedList;
import uam.pvoe.estructuras.clases.Alumno;

/**
 *
 * @author Kirig
 */
public class OperacionesLista {
    
    public LinkedList insertarAlumno(LinkedList listaAlumnos, Alumno alumno){
        listaAlumnos.add(alumno);
    return listaAlumnos;
    }
    
    public void imprimirLista (LinkedList lista){
        for(int i=0;i<lista.size();i++){
            Alumno al = (Alumno) lista.get(i);
            System.out.println(al.toString());
        }
    }
    
    
    public Alumno regresaAlumno(LinkedList lista, int posicion){
        Alumno alumno = (Alumno) lista.get(posicion);
        return alumno;
    }
    
    public int buscarAlumno(LinkedList lista, String matricula){
        int posicion = -1;
        for(int i=0;i<lista.size();i++){
            Alumno al = (Alumno) lista.get(i);
            if(al.getMatricula().compareTo(matricula)==0){
                posicion = i;
                break;
            }
        }
    
        return posicion;
    }
    
    
    public LinkedList borrarAlumno(LinkedList lista, int posicion){
        lista.remove(posicion);
        return lista;
    }
}
