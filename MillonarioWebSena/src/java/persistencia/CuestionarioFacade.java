/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import clases.Cuestionario;
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
public class CuestionarioFacade extends AbstractFacade<Cuestionario> {

    @PersistenceContext(unitName = "MillonarioWebSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuestionarioFacade() {
        super(Cuestionario.class);
    }
    
     public Cuestionario consultarIngreso(String codigoIngresoCuestionario) {
        String consultas = "select cuest from Cuestionario cuest where cuest.codigoIngresoCuestionario = '" + codigoIngresoCuestionario + "'";
        try {
            Query query = em.createQuery(consultas);
            return (Cuestionario) query.getSingleResult();
        } catch (NoResultException u) {

            return null;
        }
    }
     
     public int cuesAleatorio (Cuestionario cues){
         getEntityManager().persist(cues);
         getEntityManager().flush();
         return cues.getCodigoCuestionario();
     
     }
    
}
