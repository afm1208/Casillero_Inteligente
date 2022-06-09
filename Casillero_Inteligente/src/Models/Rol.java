
import java.util.*;

/**
 * 
 */
public class Rol {

    /**
     * Default constructor
     */
    public Rol(int Id, String descripcion) {
        this.Id = Id;
        this.descripcion = descripcion;
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
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}