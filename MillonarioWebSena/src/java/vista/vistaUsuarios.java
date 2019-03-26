/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Usuario;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.password.Password;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.event.SelectEvent;
import persistencia.UsuarioFacade;

/**
 *
 * @author Equipo
 */
@Named(value = "vistaUsuarios")
@RequestScoped
public class vistaUsuarios {

    @EJB
    private UsuarioFacade usuaPersistencia;

    private List<Usuario> listaUsu;
    private SelectOneMenu cmbIndentificacion;
    private InputText txtDocumentoUsuario;
    private InputText txtNombreUsu;
    private InputText txtApellidoUsu;
    private InputText txtDireccionUsu;
    private InputText txtTelefonoUsu;
    private InputText txtCorreoUsu;
    private SelectOneMenu cmbPermisosUsu;
    private Password passUsuario;
    private Password passClaveOld;
    private Password passClaveNew;
    private Password passClaveNew2;
    private CommandButton btnRegistrar;
    private CommandButton btnModificar;
    private CommandButton btnEliminar;
    private CommandButton btnLimpiar;
    private CommandButton btnJugar;
    private Usuario usuSeleccionado;

    /**
     * Creates a new instance of vistaUsuarios
     */
    public vistaUsuarios() {
    }

    /**
     * @return the usuaPersistencia
     */
    public UsuarioFacade getUsuaPersistencia() {
        return usuaPersistencia;
    }

    /**
     * @param usuaPersistencia the usuaPersistencia to set
     */
    public void setUsuaPersistencia(UsuarioFacade usuaPersistencia) {
        this.usuaPersistencia = usuaPersistencia;
    }

    /**
     * @return the listaUsu
     */
    public List<Usuario> getListaUsu() {
        listaUsu = usuaPersistencia.findAll();
        return listaUsu;
    }

    /**
     * @param listaUsu the listaUsu to set
     */
    public void setListaUsu(List<Usuario> listaUsu) {
        this.listaUsu = listaUsu;
    }

    /**
     * @return the txtDocumentoUsuario
     */
    public InputText getTxtDocumentoUsuario() {
        return txtDocumentoUsuario;
    }

    /**
     * @param txtDocumentoUsuario the txtDocumentoUsuario to set
     */
    public void setTxtDocumentoUsuario(InputText txtDocumentoUsuario) {
        this.txtDocumentoUsuario = txtDocumentoUsuario;
    }

    /**
     * @return the cmbIndentificacion
     */
    public SelectOneMenu getCmbIndentificacion() {
        return cmbIndentificacion;
    }

    /**
     * @param cmbIndentificacion the cmbIndentificacion to set
     */
    public void setCmbIndentificacion(SelectOneMenu cmbIndentificacion) {
        this.cmbIndentificacion = cmbIndentificacion;
    }

    /**
     * @return the txtNombreUsu
     */
    public InputText getTxtNombreUsu() {
        return txtNombreUsu;
    }

    /**
     * @param txtNombreUsu the txtNombreUsu to set
     */
    public void setTxtNombreUsu(InputText txtNombreUsu) {
        this.txtNombreUsu = txtNombreUsu;
    }

    /**
     * @return the txtApellidoUsu
     */
    public InputText getTxtApellidoUsu() {
        return txtApellidoUsu;
    }

    /**
     * @param txtApellidoUsu the txtApellidoUsu to set
     */
    public void setTxtApellidoUsu(InputText txtApellidoUsu) {
        this.txtApellidoUsu = txtApellidoUsu;
    }

    /**
     * @return the txtDireccionUsu
     */
    public InputText getTxtDireccionUsu() {
        return txtDireccionUsu;
    }

    /**
     * @param txtDireccionUsu the txtDireccionUsu to set
     */
    public void setTxtDireccionUsu(InputText txtDireccionUsu) {
        this.txtDireccionUsu = txtDireccionUsu;
    }

    /**
     * @return the txtTelefonoUsu
     */
    public InputText getTxtTelefonoUsu() {
        return txtTelefonoUsu;
    }

    /**
     * @param txtTelefonoUsu the txtTelefonoUsu to set
     */
    public void setTxtTelefonoUsu(InputText txtTelefonoUsu) {
        this.txtTelefonoUsu = txtTelefonoUsu;
    }

    /**
     * @return the txtCorreoUsu
     */
    public InputText getTxtCorreoUsu() {
        return txtCorreoUsu;
    }

    /**
     * @param txtCorreoUsu the txtCorreoUsu to set
     */
    public void setTxtCorreoUsu(InputText txtCorreoUsu) {
        this.txtCorreoUsu = txtCorreoUsu;
    }

    /**
     * @return the cmbPermisosUsu
     */
    public SelectOneMenu getCmbPermisosUsu() {
        return cmbPermisosUsu;
    }

    /**
     * @param cmbPermisosUsu the cmbPermisosUsu to set
     */
    public void setCmbPermisosUsu(SelectOneMenu cmbPermisosUsu) {
        this.cmbPermisosUsu = cmbPermisosUsu;
    }

    /**
     * @return the passUsuario
     */
    public Password getPassUsuario() {
        return passUsuario;
    }

    /**
     * @param passUsuario the passUsuario to set
     */
    public void setPassUsuario(Password passUsuario) {
        this.passUsuario = passUsuario;
    }

    /**
     * @return the btnRegistrar
     */
    public CommandButton getBtnRegistrar() {
        return btnRegistrar;
    }

    /**
     * @param btnRegistrar the btnRegistrar to set
     */
    public void setBtnRegistrar(CommandButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    /**
     * @return the btnModificar
     */
    public CommandButton getBtnModificar() {
        return btnModificar;
    }

    /**
     * @param btnModificar the btnModificar to set
     */
    public void setBtnModificar(CommandButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    /**
     * @return the btnEliminar
     */
    public CommandButton getBtnEliminar() {
        return btnEliminar;
    }

    /**
     * @param btnEliminar the btnEliminar to set
     */
    public void setBtnEliminar(CommandButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    /**
     * @return the btnLimpiar
     */
    public CommandButton getBtnLimpiar() {
        return btnLimpiar;
    }

    /**
     * @param btnLimpiar the btnLimpiar to set
     */
    public void setBtnLimpiar(CommandButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    /**
     * @return the usuSeleccionado
     */
    public Usuario getUsuSeleccionado() {
        return usuSeleccionado;
    }

    /**
     * @param usuSeleccionado the usuSeleccionado to set
     */
    public void setUsuSeleccionado(Usuario usuSeleccionado) {
        this.usuSeleccionado = usuSeleccionado;
    }

    /**
     * @return the passClaveOld
     */
    public Password getPassClaveOld() {
        return passClaveOld;
    }

    /**
     * @param passClaveOld the passClaveOld to set
     */
    public void setPassClaveOld(Password passClaveOld) {
        this.passClaveOld = passClaveOld;
    }

    /**
     * @return the passClaveNew
     */
    public Password getPassClaveNew() {
        return passClaveNew;
    }

    /**
     * @param passClaveNew the passClaveNew to set
     */
    public void setPassClaveNew(Password passClaveNew) {
        this.passClaveNew = passClaveNew;
    }

    /**
     * @return the passClaveNew2
     */
    public Password getPassClaveNew2() {
        return passClaveNew2;
    }

    /**
     * @param passClaveNew2 the passClaveNew2 to set
     */
    public void setPassClaveNew2(Password passClaveNew2) {
        this.passClaveNew2 = passClaveNew2;
    }

    public void registrarUsu() {

        Usuario nuevoUsu = new Usuario();
        nuevoUsu.setTipoIdentificacion(cmbIndentificacion.getValue().toString());
        nuevoUsu.setNumeroUsuario(Integer.parseInt(txtDocumentoUsuario.getValue().toString()));
        nuevoUsu.setNombreUsuario(txtNombreUsu.getValue().toString());
        nuevoUsu.setApellidoUsuario(txtApellidoUsu.getValue().toString());
        nuevoUsu.setDireccionUsuario(txtDireccionUsu.getValue().toString());
        nuevoUsu.setTelefonoUsuario(txtTelefonoUsu.getValue().toString());
        nuevoUsu.setCorreoUsuario(txtCorreoUsu.getValue().toString());
        nuevoUsu.setPermisoUsuario(cmbPermisosUsu.getValue().toString());
        nuevoUsu.setClaveUsuario(passUsuario.getValue().toString());
        usuaPersistencia.create(nuevoUsu);
        limpiar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificación", "¡Usuario registrado correctamente!"));

    }

    public void modificarUsu() {

        Usuario usua = usuSeleccionado;
        usua.setTipoIdentificacion(cmbIndentificacion.getValue().toString());
        usua.setNumeroUsuario(Integer.parseInt(txtDocumentoUsuario.getValue().toString()));
        usua.setNombreUsuario(txtNombreUsu.getValue().toString());
        usua.setApellidoUsuario(txtApellidoUsu.getValue().toString());
        usua.setDireccionUsuario(txtDireccionUsu.getValue().toString());
        usua.setTelefonoUsuario(txtTelefonoUsu.getValue().toString());
        usua.setCorreoUsuario(txtCorreoUsu.getValue().toString());
        usua.setPermisoUsuario(cmbPermisosUsu.getValue().toString());
        usua.setClaveUsuario(passUsuario.getValue().toString());
        usuaPersistencia.edit(usua);
        limpiar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificación", "¡Usuario modificado correctamente!"));

    }

    public void limpiar() {

        getTxtDocumentoUsuario().setValue("");
        getTxtNombreUsu().setValue("");
        getTxtApellidoUsu().setValue("");
        getTxtDireccionUsu().setValue("");
        getTxtTelefonoUsu().setValue("");
        getTxtCorreoUsu().setValue("");
        getPassUsuario().setValue("");
    }

    public void eliminarUsu() {

        Usuario usu = usuSeleccionado;
        Usuario usuario = usuaPersistencia.find(usu.getCodigoUsuario());
        if (usuario.equals(usu)) {
            usuaPersistencia.remove(usuario);
            limpiar();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificación", "¡Usuario eliminado correctamente!"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificación", "¡No se pudo eliminar el usuario!"));
        }

    }

    public void ingresar_usu() {

        String usua = txtDocumentoUsuario.getValue().toString();
        String contra = passUsuario.getValue().toString();

        Usuario logueado = usuaPersistencia.consultarUsu(usua);
        String pagina = "";
        if (logueado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Notificación", "¡Usuario no registrado!"));
        } else {
            if (!logueado.getClaveUsuario().equals(contra)) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Notificación", "¡Clave incorrecta!"));
            } else {
                try {
                    if (logueado.getPermisoUsuario().equals("Administrador")) {
                        pagina = "admin/indexUsuario.xhtml";
                    } else {
                        if (logueado.getPermisoUsuario().equals("Coordinador")) {
                            pagina = "admin/indexPregunta.xhtml";
                        }else{
                            if(logueado.getPermisoUsuario().equals("Instructor")){
                                pagina = "admin/indexPreguntaCuestionario.xhtml";
                            }else{
                                if(logueado.getPermisoUsuario().equals("Funcionario")){
                                    pagina = "admin/indexCuestionario.xhtml";
                                }
                            }
                        }
                    }

                    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", logueado);
                    FacesContext.getCurrentInstance().getExternalContext().redirect(pagina);
                } catch (IOException ex) {
                    Logger.getLogger(vistaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void cerrarSesion() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("usuario");
            FacesContext.getCurrentInstance().getExternalContext().redirect("../index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(vistaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void seleccionarUsu(SelectEvent evento) {
        usuSeleccionado = (Usuario) evento.getObject();
        if (usuSeleccionado != null) {
            cmbIndentificacion.setValue(usuSeleccionado.getTipoIdentificacion());
            txtDocumentoUsuario.setValue(usuSeleccionado.getNumeroUsuario());
            txtNombreUsu.setValue(usuSeleccionado.getNombreUsuario());
            txtApellidoUsu.setValue(usuSeleccionado.getApellidoUsuario());
            txtDireccionUsu.setValue(usuSeleccionado.getDireccionUsuario());
            txtTelefonoUsu.setValue(usuSeleccionado.getTelefonoUsuario());
            txtCorreoUsu.setValue(usuSeleccionado.getCorreoUsuario());
            cmbPermisosUsu.setValue(usuSeleccionado.getPermisoUsuario());
            passUsuario.setValue(usuSeleccionado.getClaveUsuario());
        }
    }
    
    public void limpiarLogin(){
        
        getTxtDocumentoUsuario().setValue("");
        getPassUsuario().setValue("");
    }

    /**
     * @return the btnJugar
     */
    public CommandButton getBtnJugar() {
        return btnJugar;
    }

    /**
     * @param btnJugar the btnJugar to set
     */
    public void setBtnJugar(CommandButton btnJugar) {
        this.btnJugar = btnJugar;
    }
    
    public void jugar(){
        
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("../indexProgramaAprendiz.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(vistaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
