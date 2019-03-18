/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Cuestionario;
import java.io.IOException;
import java.util.ArrayList;
//import java.math.BigInteger;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.event.SelectEvent;
import persistencia.CuestionarioFacade;
import java.util.Random;

/**
 *
 * @author Equipo
 */
@Named(value = "vistaCuestionario")
@RequestScoped
public class VistaCuestionario {

    @EJB
    private CuestionarioFacade cuestionarioPersistencia;
    
    private List<Cuestionario> listaCuestionario;
    
    private InputText txtCodigoCuestionario;
    private InputText txtNombreCuestionario;
    private SelectOneMenu cmbInstructorCuestionario;
    private CommandButton btnRegistrar;
    private CommandButton btnModificar;
    private CommandButton btnEliminar;
    private CommandButton btnLimpiar;
    private CommandButton btnRegistrarAprendices;
    private Cuestionario cuestionarioSeleccionado;
    private ArrayList<SelectItem> itemsCuestionario;
    private Random numeroAleatorio;
    /**
     * Creates a new instance of VistaCuestionario
     */
    public VistaCuestionario() {
        Random aleatorio = new Random();
            int numero;
           numero = aleatorio.nextInt(1000);
           System.out.println("El numero aleatorio es"+numero);
    }
    
    
    

    /**
     * @return the cuestionarioPersistencia
     */
    public CuestionarioFacade getCuestionarioPersistencia() {
        return cuestionarioPersistencia;
    }

    /**
     * @param cuestionarioPersistencia the cuestionarioPersistencia to set
     */
    public void setCuestionarioPersistencia(CuestionarioFacade cuestionarioPersistencia) {
        this.cuestionarioPersistencia = cuestionarioPersistencia;
    }

    /**
     * @return the listaCuestionario
     */
    public List<Cuestionario> getListaCuestionario() {
        listaCuestionario = cuestionarioPersistencia.findAll();
        return listaCuestionario;
    }

    /**
     * @param listaCuestionario the listaCuestionario to set
     */
    public void setListaCuestionario(List<Cuestionario> listaCuestionario) {
        this.listaCuestionario = listaCuestionario;
    }

    /**
     * @return the txtCodigoCuestionario
     */
    public InputText getTxtCodigoCuestionario() {
        return txtCodigoCuestionario;
    }

    /**
     * @param txtCodigoCuestionario the txtCodigoCuestionario to set
     */
    public void setTxtCodigoCuestionario(InputText txtCodigoCuestionario) {
        this.txtCodigoCuestionario = txtCodigoCuestionario;
    }

    /**
     * @return the txtNombreCuestionario
     */
    public InputText getTxtNombreCuestionario() {
        return txtNombreCuestionario;
    }

    /**
     * @param txtNombreCuestionario the txtNombreCuestionario to set
     */
    public void setTxtNombreCuestionario(InputText txtNombreCuestionario) {
        this.txtNombreCuestionario = txtNombreCuestionario;
    }

    /**
     * @return the cmbInstructorCuestionario
     */
    public SelectOneMenu getCmbInstructorCuestionario() {
        return cmbInstructorCuestionario;
    }

    /**
     * @param cmbInstructorCuestionario the cmbInstructorCuestionario to set
     */
    public void setCmbInstructorCuestionario(SelectOneMenu cmbInstructorCuestionario) {
        this.cmbInstructorCuestionario = cmbInstructorCuestionario;
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
     * @return the btnRegistrarAprendices
     */
    public CommandButton getBtnRegistrarAprendices() {
        return btnRegistrarAprendices;
    }

    /**
     * @param btnRegistrarAprendices the btnRegistrarAprendices to set
     */
    public void setBtnRegistrarAprendices(CommandButton btnRegistrarAprendices) {
        this.btnRegistrarAprendices = btnRegistrarAprendices;
    }

    /**
     * @return the cuestionarioSeleccionado
     */
    public Cuestionario getCuestionarioSeleccionado() {
        return cuestionarioSeleccionado;
    }

    /**
     * @param cuestionarioSeleccionado the cuestionarioSeleccionado to set
     */
    public void setCuestionarioSeleccionado(Cuestionario cuestionarioSeleccionado) {
        this.cuestionarioSeleccionado = cuestionarioSeleccionado;
    }
    
    /**
     * @return the itemsCuestionario
     */
    public ArrayList<SelectItem> getItemsCuestionario() {
        listaCuestionario = cuestionarioPersistencia.findAll();
        itemsCuestionario = new ArrayList<>();
        for(Cuestionario c : listaCuestionario){
            itemsCuestionario.add(new SelectItem(c.getInstructorCuestionario()));
        }
        return itemsCuestionario;
    }

    /**
     * @param itemsCuestionario the itemsCuestionario to set
     */
    public void setItemsCuestionario(ArrayList<SelectItem> itemsCuestionario) {
        this.itemsCuestionario = itemsCuestionario;
    }
    
    
    /**
     * @return the numeroAleatorio
     */
    public Random getNumeroAleatorio() {

        return numeroAleatorio;
    }

    /**
     * @param numeroAleatorio the numeroAleatorio to set
     */
    public void setNumeroAleatorio(Random numeroAleatorio) {
                    Random aleatorio = new Random();
            int numero;
            numero = aleatorio.nextInt(1000);
            System.out.println("El numero aleatorio es"+numero);
        this.numeroAleatorio = numeroAleatorio;
    }
    
    public void numeroAleatorio(){
        Cuestionario cuesRandom = new Cuestionario();
        cuesRandom.setCodigoCuestionario(Integer.parseInt(txtCodigoCuestionario.getValue().toString()));
    }
    
    
    public void registrar(){
       Cuestionario nuevoCues = new Cuestionario();
        nuevoCues.setCodigoCuestionario(Integer.parseInt(txtCodigoCuestionario.getValue().toString()));
        nuevoCues.setNombreCuestionario(txtNombreCuestionario.getValue().toString());//De estas forma capturamos un objeto o un texto pero en String.
        nuevoCues.setInstructorCuestionario(cmbInstructorCuestionario.getValue().toString());
        cuestionarioPersistencia.create(nuevoCues);
        limpiar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificacion", "Cuestionario Registrado"));
    }
    
    
    public void seleccionarCuestionario(SelectEvent evento){
        
        /*cuestionarioSeleccionado = (Cuestionario) evento.getObject();
        if (cuestionarioSeleccionado != null) {
            txtNombreCuestionario.setValue(cuestionarioSeleccionado.getNombreCuestionario());
            txtCodigoCuestionario.setValue(cuestionarioSeleccionado.getCodigoCuestionario());
            cmbInstructorCuestionario.setValue(cuestionarioSeleccionado.getInstructorCuestionario());
        }*/
        cuestionarioSeleccionado = (Cuestionario) evento.getObject();
        txtNombreCuestionario.setValue(cuestionarioSeleccionado.getNombreCuestionario());
        txtCodigoCuestionario.setValue(cuestionarioSeleccionado.getCodigoCuestionario());
        
    }
       
    
    public void modificar(){
        
        Cuestionario cuestionario = cuestionarioSeleccionado;
        cuestionario.setCodigoCuestionario(Integer.parseInt(txtCodigoCuestionario.getValue().toString()));
        cuestionario.setNombreCuestionario(txtNombreCuestionario.getValue().toString());
        cuestionario.setInstructorCuestionario(cmbInstructorCuestionario.getValue().toString());
        cuestionarioPersistencia.edit(cuestionario);
        limpiar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificación", "¡Cuestionario modificado correctamente!"));
        
        
    }
    
    
    public void eliminar(){
         Cuestionario cues = cuestionarioSeleccionado;
         cues.setNombreCuestionario(txtNombreCuestionario.getValue().toString());   //De estas forma capturamos un objeto o un texto pero en String.
         cues.setCodigoCuestionario(Integer.parseInt(txtCodigoCuestionario.getValue().toString()));
         cuestionarioPersistencia.remove(cues);
         limpiar();
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificacion", "Cuestionario Eliminado Correctamente!!")); 
    }
    
    public void limpiar(){
        
        getTxtCodigoCuestionario().setValue("");
        getTxtNombreCuestionario().setValue("");
        getCmbInstructorCuestionario().setValue("");  
    }
    
    
    public void registrarAprendices() throws IOException{
        //Esta linea de codigo me permite realizar el Direccionamiento a otro Index del mismo proyecto. PARA TENER EN CUENTA.
        FacesContext.getCurrentInstance().getExternalContext().redirect("indexProgramaAprendiz.xhtml");
    }

    

    
    
    
}
