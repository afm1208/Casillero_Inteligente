
import java.util.*;

/**
 * 
 */
public class Estado_locker {

    /**
     * Default constructor
     */
    public Estado_locker(int Id, String estado) {
        this.Id = Id;
        this.estado = estado;
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
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}