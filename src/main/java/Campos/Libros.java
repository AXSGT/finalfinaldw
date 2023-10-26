package Campos;

/**
 *
 * @author axlc1
 */
public class Libros {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private String fecha_carga;
    private Long id_tipo_libro;
    private Long id_autor;
    private Long disponible;

    
    public Libros(String nombre, String descripcion, String fecha_carga, Long id_tipo_libro, Long id_autor, Long disponible){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_carga = fecha_carga;
        this.id_tipo_libro = id_tipo_libro;
        this.id_autor = id_autor;
        this.disponible = disponible;
    }
    
    
    public Libros(){
        
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha_carga
     */
    public String getFecha_carga() {
        return fecha_carga;
    }

    /**
     * @param fecha_carga the fecha_carga to set
     */
    public void setFecha_carga(String fecha_carga) {
        this.fecha_carga = fecha_carga;
    }

    /**
     * @return the id_tipo_libro
     */
    public Long getId_tipo_libro() {
        return id_tipo_libro;
    }

    /**
     * @param id_tipo_libro the id_tipo_libro to set
     */
    public void setId_tipo_libro(Long id_tipo_libro) {
        this.id_tipo_libro = id_tipo_libro;
    }

    /**
     * @return the id_autor
     */
    public Long getId_autor() {
        return id_autor;
    }

    /**
     * @param id_autor the id_autor to set
     */
    public void setId_autor(Long id_autor) {
        this.id_autor = id_autor;
    }

    /**
     * @return the disponible
     */
    public Long getDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(Long disponible) {
        this.disponible = disponible;
    }
    
    
    
    
}
