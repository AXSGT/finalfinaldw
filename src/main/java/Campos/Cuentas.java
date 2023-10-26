package Campos;

/**
 *
 * @author axlc1
 */
public class Cuentas {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String usuario;
    private Long clave;
    private String fecha_registro;
    private Long nivel;

    
    public Cuentas(String nombre, String apellido, String email, String usuario, Long clave, String fecha_registro, Long nivel){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
        this.fecha_registro = fecha_registro;
        this.nivel = nivel;
        
    }
    
    
    public Cuentas(){
        
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public Long getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(Long clave) {
        this.clave = clave;
    }

    /**
     * @return the fecha_registro
     */
    public String getFecha_registro() {
        return fecha_registro;
    }

    /**
     * @param fecha_registro the fecha_registro to set
     */
    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    /**
     * @return the nivel
     */
    public Long getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(Long nivel) {
        this.nivel = nivel;
    }
}
