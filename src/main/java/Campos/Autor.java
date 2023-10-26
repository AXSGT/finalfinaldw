package Campos;

/**
 *
 * @author axlc1
 */
public class Autor {
    
    private Long id;
    private String nombre;
    private String apellido;

    
    
    public Autor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Autor(){
        
    }
    
    
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
