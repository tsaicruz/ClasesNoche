package ar.org.centro8.curso.java.proyecto.repositorios.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ar.org.centro8.curso.java.proyecto.entities.Alumno;
import ar.org.centro8.curso.java.proyecto.entities.Curso;

public interface I_AlumnoRepository {
    void save(Alumno alumno);
    void remove(Alumno alumno);
    void update(Alumno alumno);
    default Alumno getById(int id){
        return getAll()
                .stream()
                .filter(a->a.getId()==id)
                .findFirst()
                .orElse(new Alumno());
    }
    List<Alumno>getAll();
    default List<Alumno>getLikeApellido(String apellido){
        if(apellido==null) return new ArrayList();
        return getAll()
                .stream()
                //.filter(a->a.getApellido()!=null && a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .filter(a->a.getApellido()!=null)
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                //.toList();
                .collect(Collectors.toList());
    }
    default List<Alumno>getByCurso(Curso curso){
        if(curso==null) return new ArrayList();
        return getAll()
                .stream()
                .filter(a->a.getIdCurso()==curso.getId())
                //.toList();
                .collect(Collectors.toList());
    }
}
