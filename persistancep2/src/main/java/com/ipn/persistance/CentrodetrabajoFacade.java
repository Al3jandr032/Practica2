
package com.ipn.persistance;

import com.ipn.persistance.vo.Centrodetrabajo;
import java.util.List;

/**
 *
 * @author alopeze
 */
public interface CentrodetrabajoFacade {
    public Centrodetrabajo create(Centrodetrabajo centrotrabajo);
    
    public void edit(Centrodetrabajo centrotrabajo);

    public void remove(Centrodetrabajo centrotrabajo);
    
    public Centrodetrabajo find(Long id);

    public List<Centrodetrabajo> findAll();

    public int count();
}
