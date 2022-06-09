
import java.util.*;

/**
 * 
 */
public class Usuario {

    /**
     * Default constructor
     */
    public Usuario(int Id, String nombre, String documento, String numdocumento, int telefono, String contraseña,
            String contraseñña, int codigo_entrega) {
        this.Id = Id;
        this.nombre = nombre;
        this.documento = documento;
        this.numdocumento = numdocumento;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.contraseñña = contraseñña;
        this.codigo_entrega = codigo_entrega;
    }

    /**
     * 
     */
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    /**
     * 
     */
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     */
    private String documento;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * 
     */
    private String numdocumento;

    public String getNumdocumento() {
        return numdocumento;
    }

    public void setNumdocumento(String numdocumento) {
        this.numdocumento = numdocumento;
    }

    /**
     * 
     */
    private int telefono;

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     */
    private String contraseña;

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * 
     */
    private String contraseñña;

    public String getContraseñña() {
        return contraseñña;
    }

    public void setContraseñña(String contraseñña) {
        this.contraseñña = contraseñña;
    }

    /**
     * 
     */
    private int codigo_entrega;

    public int getCodigo_entrega() {
        return codigo_entrega;
    }

    public void setCodigo_entrega(int codigo_entrega) {
        this.codigo_entrega = codigo_entrega;
    }

    /**
     * 
     */
    public void mostrar_usuarios() {

    };

    /**
     * 
     */
    private void registrar_usuaio() {
        // TODO implement here
    }

    /**
     * 
     */
    private void eliminar_usuario() {
        // TODO implement here
    }

    /**
     * 
     */
    private void cambiar_contraseña() {
        // TODO implement here
    }

}