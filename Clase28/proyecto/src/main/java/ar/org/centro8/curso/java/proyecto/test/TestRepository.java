package ar.org.centro8.curso.java.proyecto.test;

import java.sql.Connection;

import ar.org.centro8.curso.java.proyecto.connections.Connector;
import ar.org.centro8.curso.java.proyecto.entities.Alumno;
import ar.org.centro8.curso.java.proyecto.entities.Curso;
import ar.org.centro8.curso.java.proyecto.enums.Dia;
import ar.org.centro8.curso.java.proyecto.enums.Turno;
import ar.org.centro8.curso.java.proyecto.repositorios.interfaces.I_AlumnoRepository;
import ar.org.centro8.curso.java.proyecto.repositorios.interfaces.I_CursoRepository;
import ar.org.centro8.curso.java.proyecto.repositorios.jdbc.AlumnoRepository;
import ar.org.centro8.curso.java.proyecto.repositorios.jdbc.CursoRepository;

public class TestRepository {
    public static void main(String[] args) {
        Connection conn=Connector.getConnection();
        I_CursoRepository cr=new CursoRepository(conn);

        Curso curso=new Curso("phyton", "Torres", Dia.JUEVES, Turno.NOCHE);
        cr.save(curso);
        System.out.println(curso);

        cr.remove(cr.getById(2));

        curso=cr.getById(3);
        curso.setTurno(Turno.TARDE);
        cr.update(curso);

        cr.getAll().forEach(System.out::println);
        System.out.println("***********************************************");
        cr.getLikeTitulo("ph").forEach(System.out::println);
        
        System.out.println("***********************************************");
        I_AlumnoRepository ar=new AlumnoRepository(conn);

        Alumno alumno=new Alumno("Laura", "Salas", 26, 3);
        ar.save(alumno);
        System.out.println(alumno);

        ar.remove(ar.getById(4));

        alumno=ar.getById(3);
        alumno.setNombre("Florencia");
        ar.update(alumno);

        ar.getAll().forEach(System.out::println);

    }
}
