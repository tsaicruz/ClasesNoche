package ar.org.centro8.curso.java.proyecto.repositorios.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.org.centro8.curso.java.proyecto.entities.Curso;
import ch.qos.logback.core.filter.Filter;

public interface I_CursoRepository {
    void save(Curso curso);
    void remove(Curso curso);
    void update(Curso curso);
    default Curso getById(int id){
        return getAll()
                .stream()
                .filter(c->c.getId()==id)
                .findFirst()
                .orElse(new Curso());
    }
    List<Curso>getAll();
    default List<Curso>getLikeTitulo(String titulo){
        if(titulo==null) return new ArrayList();
        return getAll()
                .stream()
                .filter(c->c.getTitulo()!=null)
                .filter(c->c.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                //.toList();
                .collect(Collectors.toList());
    }
}
