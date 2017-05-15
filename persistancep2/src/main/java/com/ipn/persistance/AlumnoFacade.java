package com.ipn.persistance;

import com.ipn.persistance.vo.Alumno;
import java.util.List;

/**
 *
 * @author alopeze
 */
public interface AlumnoFacade {
    public Alumno create(Alumno alumno);
    
    public void edit(Alumno alumno);

    public void remove(Alumno alumno);
    
    public Alumno find(Long id);

    public List<Alumno> findAll();

    public int count();
}
