package Campos;

/**
 *
 * @author axlc1
 */
public class TipoLibro {
    
    private Long id;
    private String nombre;

    public TipoLibro (String nombre){
        
    }
    
    public TipoLibro (){
        
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
    
}
