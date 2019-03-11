/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import clases.Usuario;
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
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "MillonarioWebSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public Usuario consultarUsu(String numeroUsuario) {
        String consultas = "select usua from Usuario usua where usua.numeroUsuario = '" + numeroUsuario + "'";
        try {
            Query query = em.createQuery(consultas);
            return (Usuario) query.getSingleResult();
        } catch (NoResultException u) {

            return null;
        }
    }
}
