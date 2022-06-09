
import java.util.*;

/**
 * 
 */
public class Tamaño {

    /**
     * Default constructor
     */
    public Tamaño(int Id, String tamaño) {
        this.Id = Id;
        this.tamaño = tamaño;
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
    private String tamaño;

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

}