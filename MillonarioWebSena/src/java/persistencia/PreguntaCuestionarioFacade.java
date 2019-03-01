/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import clases.PreguntaCuestionario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Equipo
 */
@Stateless
public class PreguntaCuestionarioFacade extends AbstractFacade<PreguntaCuestionario> {

    @PersistenceContext(unitName = "MillonarioWebSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PreguntaCuestionarioFacade() {
        super(PreguntaCuestionario.class);
    }
    
}
