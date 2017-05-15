package com.ipn.persistance;

import com.ipn.persistance.vo.Respuesta;
import java.util.List;

/**
 *
 * @author alopeze
 */
public interface RespuestaFacade {
    public Respuesta create(Respuesta respuesta);
    
    public void edit(Respuesta respuesta);

    public void remove(Respuesta respuesta);
    
    public Respuesta find(Long id);

    public List<Respuesta> findAll();

    public int count();
}
