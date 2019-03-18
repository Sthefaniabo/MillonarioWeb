/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import clases.ProgramaAprendices;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Equipo
 */
@Stateless
public class ProgramaAprendicesFacade extends AbstractFacade<ProgramaAprendices> {

    @PersistenceContext(unitName = "MillonarioWebSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaAprendicesFacade() {
        super(ProgramaAprendices.class);
    }
    
    public ProgramaAprendices consultarAprendiz(String nombreAprendiz) {
        String consultas = "select apren from ProgramaAprendices apren where apren.nombreAprendiz = '" + nombreAprendiz + "'";
        try {
            Query query = em.createQuery(consultas);
            return (ProgramaAprendices) query.getSingleResult();
        } catch (NoResultException u) {

            return null;
        }
    }
    
}
