
import java.util.*;

/**
 * 
 */
public class Slot {

    /**
     * Default constructor
     */
    public Slot(int Id, int num_taquilla, Tamaño tamaño, Estado_locker estado_locker, String observacion) {
        this.Id = Id;
        this.num_taquilla = num_taquilla;
        this.tamaño = tamaño;
        this.estado_locker = estado_locker;
        this.observacion = observacion;
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
    private int num_taquilla;

    public int getNum_taquilla() {
        return num_taquilla;
    }

    public void setNum_taquilla(int num_taquilla) {
        this.num_taquilla = num_taquilla;
    }

    /**
     * 
     */
    private Tamaño tamaño;

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * 
     */
    private Estado_locker estado_locker;

    public Estado_locker getEstado_locker() {
        return estado_locker;
    }

    public void setEstado_locker(Estado_locker estado_locker) {
        this.estado_locker = estado_locker;
    }

    /**
     * 
     */
    private String observacion;

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    // metodo para saber si el slot ya existe y nos retorne un booleano TRUE /
    // EXISTE -- FALSE / NO EXISTE
    public boolean slotexiste(int num, Casillero casillero) {
        // Inicializamos la variable existe para alli poner el booleano y lo
        // inicializamos = FALSE
        boolean existe = false;
        for (Slot slot : casillero.getSlots()) {
            if (slot.getId() == num) {
                existe = true;
                break;
            }

        }
        return existe;

    }

    public Tamaño asignar_tamaño(int Id_tamaño) {

        Tamaño pequeño = new Tamaño(Id_tamaño, "pequeño");
        Tamaño mediano = new Tamaño(Id_tamaño, "mediano");
        Tamaño grande = new Tamaño(Id_tamaño, "grande");

        if (Id_tamaño == 1) {
            return pequeño;
        } else if (Id_tamaño == 2) {
            return mediano;
        } else if (Id_tamaño == 3) {
            return grande;
        } else {
            System.out.println("No hay mas tamaños disponibles");
        }

        return tamaño;
    }

}