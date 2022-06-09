
import java.util.*;

/**
 * 
 */
public class Encomienda {

    /**
     * Default constructor
     */
    public Encomienda(Usuario usuario, int Id, Slot slot, Casillero casillero, Date fecha_reserva,
            Date fecha_entregado, Date fecha_cancelado, String observacion, int codigo_recoger) {
        this.usuario = usuario;
        this.Id = Id;
        this.slot = slot;
        this.casillero = casillero;
        this.fecha_reserva = fecha_reserva;
        this.fecha_cancelado = fecha_cancelado;
        this.fecha_retirado = fecha_cancelado;
        this.observacion = observacion;
        this.codigo_recoger = codigo_recoger;

    }

    /**
     * 
     */
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
    private Slot slot;

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    /**
     * 
     */
    private Casillero casillero;

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }

    /**
     * 
     */
    private Date fecha_reserva;

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    /**
     * 
     */
    private Date fecha_retirado;

    public Date getFecha_retirado() {
        return fecha_retirado;
    }

    public void setFecha_retirado(Date fecha_retirado) {
        this.fecha_retirado = fecha_retirado;
    }

    /**
     * 
     */
    private Date fecha_cancelado;

    public Date getFecha_cancelado() {
        return fecha_cancelado;
    }

    public void setFecha_cancelado(Date fecha_cancelado) {
        this.fecha_cancelado = fecha_cancelado;
    }

    /**
     * 
     */
    private int codigo_recoger;

    public int getCodigo_recoger() {
        return codigo_recoger;
    }

    public void setCodigo_recoger(int codigo_recoger) {
        this.codigo_recoger = codigo_recoger;
    }

    private String observacion;

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * @param usuario   es el Usuario anfitrion de la reserva y del que su ID va a
     *                  ser el codigo de entrega
     * @param casillero Es el Casillero en el cual el anfitrion esta registrado y
     *                  genera la reserva en una taquilla de este
     */
    private void crear_encomienda(Usuario usuario, Casillero casillero) {
        // TODO implement here
    }

    /**
     * @param encomienda Es el objeto de la reserva que va a hacer parte de una
     *                   lisrta de reservas
     */
    private void borrar_encomienda(Encomienda encomienda) {
        // TODO implement here
    }

    /**
     * 
     */
    private void mostrar_encomienda() {
        // TODO implement here
    }

    /**
     * 
     */
    private void devolucion() {
        // TODO implement here
    }

}