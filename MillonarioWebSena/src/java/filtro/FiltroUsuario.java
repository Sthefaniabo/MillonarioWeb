/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtro;

import clases.Usuario;
import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.UsuarioFacade;

/**
 *
 * @author Equipo
 */
@Named(value = "filtroUsuario")
@RequestScoped

public class FiltroUsuario implements javax.servlet.Filter {

     private FilterConfig configuration;

    @EJB
    private UsuarioFacade usuarioPersistencia;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.configuration = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        Usuario u = (Usuario) ((HttpServletRequest) request).getSession().getAttribute("usuario");
       

        if (u != null) {
             chain.doFilter(request, response);          
        } else {
            ((HttpServletResponse) response).sendRedirect("../SesionInvalida.xhtml");
        }

    }


    @Override
    public void destroy() {
        this.configuration = null;
    }
    
    
}
