
import java.util.*;

/**
 * 
 */
public class Casillero {

    /**
     * Default constructor
     */
    public Casillero(int Id, String compañia, String agencia, String vfirmware, String vapp, String informacion,
            boolean conectado, String tipo, int codigo, int bateria, Date fecha_creado, Date fecha_actualizado) {

        this.Id = Id;
        this.compañia = compañia;
        this.agencia = agencia;
        this.vfirmware = vfirmware;
        this.vapp = vapp;
        this.informacion = informacion;
        this.conectado = conectado;
        this.tipo = tipo;
        this.codigo = codigo;
        this.bateria = bateria;
        this.fecha_actualizado = fecha_actualizado;
        this.fecha_creado = fecha_creado;

    }

    /**
     * 
     */
    // CREAMOS LAS LISTAS DONDE ALMACENAREMOS EL RESTO DE OBJETOS
    private ArrayList<Slot> slots;

    public ArrayList<Slot> getSlots() {
        return slots;
    }

    public Slot getSlot(int num) {
        Slot slot = null;
        boolean encontrado = false;
        Iterator<Slot> it = slots.iterator();
        while (!encontrado && it.hasNext()) {
            Slot sl = it.next();
            if (sl.getId() == num) {
                slot = sl;
                encontrado = true;
            }

        }
        return slot;
    }

    public void setSlots(ArrayList<Slot> slots) {
        this.slots = slots;
    }

    private ArrayList<Usuario> usuarios;

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario getUsuarios(String doc) {
        Usuario user = null;
        boolean encontrado = false;
        Iterator<Usuario> it = usuarios.iterator();
        while (!encontrado && it.hasNext()) {
            Usuario u = it.next();
            if (u.getNumdocumento().equals(doc)) {
                user = u;
                encontrado = true;
            }

        }
        return user;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

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
    private String compañia;

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    /**
     * 
     */
    private String agencia;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * 
     */
    private String vfirmware;

    public String getVfirmware() {
        return vfirmware;
    }

    public void setVfirmware(String vfirmware) {
        this.vfirmware = vfirmware;
    }

    /**
     * 
     */
    private String vapp;

    public String getVapp() {
        return vapp;
    }

    public void setVapp(String vapp) {
        this.vapp = vapp;
    }

    /**
     * 
     */
    private String informacion;

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    /**
     * 
     */
    private boolean conectado;

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    /**
     * 
     */
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     */
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * 
     */
    private int bateria;

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    /**
     * 
     */
    private Date fecha_creado;

    public Date getFecha_creado() {
        return fecha_creado;
    }

    public void setFecha_creado(Date fecha_creado) {
        this.fecha_creado = fecha_creado;
    }

    /**
     * 
     */
    private Date fecha_actualizado;

    public Date getFecha_actualizado() {
        return fecha_actualizado;
    }

}