package com.ipn.persistance;

import com.ipn.persistance.vo.Pregunta;
import java.util.List;

/**
 *
 * @author alopeze
 */
public interface PreguntaFacade {
    public Pregunta create(Pregunta pregunta);
    
    public void edit(Pregunta pregunta);

    public void remove(Pregunta pregunta);
    
    public Pregunta find(Long id);

    public List<Pregunta> findAll();

    public int count();
}
