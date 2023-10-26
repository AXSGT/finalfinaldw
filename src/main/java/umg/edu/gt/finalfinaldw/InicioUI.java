package umg.edu.gt.finalfinaldw;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;



import Campos.Autor;
import Campos.Cuentas;
import Campos.Libros;
import Campos.Prestamos;
import Campos.TipoLibro;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author axlc1
 */
@ManagedBean(name = "bkn_Inicio")
@ViewScoped
public class InicioUI {
    private List<Autor> autores = new ArrayList<Autor>();
    private List<Cuentas> cuenta = new ArrayList<Cuentas>();
    private List<Libros> libro = new ArrayList<Libros>();
    private List<Prestamos> prestamo = new ArrayList<Prestamos>();
    private List<TipoLibro> tipoLibro = new ArrayList<TipoLibro>();
    
    //para autor
    private Long id_autor;
    private String nombre_autor;
    private String apellido_autor;
    
    //para cuentas (estudiantes)
    private Long id_estudiante;
    private String nombre_estudiante;
    private String apellido_estudiante;
    private String email_estudiante;
    private String usuario_estu;
    private Long clave_estu;
    private String fecha_registro_estu;
    private Long nivel_estu;
    
    //para libros
    private Long id_libro;
    private String nombre_libro;
    private String descripcion_libro;
    private String fecha_carga_libro;
    private Long id_tipo_libro;
    private Long id_autor_libro;
    private Long disponible_libro;
    
    //para prestamos
    private Long id_prestamo;
    private Long id_libro_prestamo; //viene de libro
    private Long id_cuenta_prestamo; //viene de estudiante
    private String fecha_prestamo;
    private String fecha_devolucion;
    
    //tipo libro
    private Long id_tipo; //tipo del libro UI
    private String nombre_tipo_libro;

    @PostConstruct
    public void init(){
        try {
            listarAutores();
        } catch (Exception e) {
            System.out.println("ERROR AL CONSUMIR LA WEB SERVICE "+ e.toString());
        }
    }
    
    public void listarAutores () throws IOException, InterruptedException {
        String link = "localhost:8085/ApiListar/resources/autores";
        HttpClient client = HttpClient.newHttpClient();
        
        //UNA SOLICITUD TIPO GET SIN PARAMETRO
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link))
                .GET()
                .build();
        
       //send the request to receive the response o request and response
       HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
       //salida
        System.out.println("La respuesta del servidor es: "+response.body());
        
        Gson gson = new Gson ();
        Type listType = new TypeToken<List<Autor>>(){    
        }.getType();
        List<Autor> autor = gson.fromJson(response.body(),listType);
        setAutor(autor);
    }
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the autor
     */
    public List<Autor> getAutor() {
        return autores;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(List<Autor> autores) {
        this.autores = autores;
    }

    /**
     * @return the cuenta
     */
    public List<Cuentas> getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(List<Cuentas> cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the libro
     */
    public List<Libros> getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(List<Libros> libro) {
        this.libro = libro;
    }

    /**
     * @return the prestamo
     */
    public List<Prestamos> getPrestamo() {
        return prestamo;
    }

    /**
     * @param prestamo the prestamo to set
     */
    public void setPrestamo(List<Prestamos> prestamo) {
        this.prestamo = prestamo;
    }

    /**
     * @return the tipoLibro
     */
    public List<TipoLibro> getTipoLibro() {
        return tipoLibro;
    }

    /**
     * @param tipoLibro the tipoLibro to set
     */
    public void setTipoLibro(List<TipoLibro> tipoLibro) {
        this.tipoLibro = tipoLibro;
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
     * @return the nombre_autor
     */
    public String getNombre_autor() {
        return nombre_autor;
    }

    /**
     * @param nombre_autor the nombre_autor to set
     */
    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    /**
     * @return the apellido_autor
     */
    public String getApellido_autor() {
        return apellido_autor;
    }

    /**
     * @param apellido_autor the apellido_autor to set
     */
    public void setApellido_autor(String apellido_autor) {
        this.apellido_autor = apellido_autor;
    }

    /**
     * @return the id_estudiante
     */
    public Long getId_estudiante() {
        return id_estudiante;
    }

    /**
     * @param id_estudiante the id_estudiante to set
     */
    public void setId_estudiante(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    /**
     * @return the nombre_estudiante
     */
    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    /**
     * @param nombre_estudiante the nombre_estudiante to set
     */
    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    /**
     * @return the apellido_estudiante
     */
    public String getApellido_estudiante() {
        return apellido_estudiante;
    }

    /**
     * @param apellido_estudiante the apellido_estudiante to set
     */
    public void setApellido_estudiante(String apellido_estudiante) {
        this.apellido_estudiante = apellido_estudiante;
    }

    /**
     * @return the email_estudiante
     */
    public String getEmail_estudiante() {
        return email_estudiante;
    }

    /**
     * @param email_estudiante the email_estudiante to set
     */
    public void setEmail_estudiante(String email_estudiante) {
        this.email_estudiante = email_estudiante;
    }

    /**
     * @return the usuario_estu
     */
    public String getUsuario_estu() {
        return usuario_estu;
    }

    /**
     * @param usuario_estu the usuario_estu to set
     */
    public void setUsuario_estu(String usuario_estu) {
        this.usuario_estu = usuario_estu;
    }

    /**
     * @return the clave_estu
     */
    public Long getClave_estu() {
        return clave_estu;
    }

    /**
     * @param clave_estu the clave_estu to set
     */
    public void setClave_estu(Long clave_estu) {
        this.clave_estu = clave_estu;
    }

    /**
     * @return the fecha_registro_estu
     */
    public String getFecha_registro_estu() {
        return fecha_registro_estu;
    }

    /**
     * @param fecha_registro_estu the fecha_registro_estu to set
     */
    public void setFecha_registro_estu(String fecha_registro_estu) {
        this.fecha_registro_estu = fecha_registro_estu;
    }

    /**
     * @return the nivel_estu
     */
    public Long getNivel_estu() {
        return nivel_estu;
    }

    /**
     * @param nivel_estu the nivel_estu to set
     */
    public void setNivel_estu(Long nivel_estu) {
        this.nivel_estu = nivel_estu;
    }

    /**
     * @return the id_libro
     */
    public Long getId_libro() {
        return id_libro;
    }

    /**
     * @param id_libro the id_libro to set
     */
    public void setId_libro(Long id_libro) {
        this.id_libro = id_libro;
    }

    /**
     * @return the nombre_libro
     */
    public String getNombre_libro() {
        return nombre_libro;
    }

    /**
     * @param nombre_libro the nombre_libro to set
     */
    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    /**
     * @return the descripcion_libro
     */
    public String getDescripcion_libro() {
        return descripcion_libro;
    }

    /**
     * @param descripcion_libro the descripcion_libro to set
     */
    public void setDescripcion_libro(String descripcion_libro) {
        this.descripcion_libro = descripcion_libro;
    }

    /**
     * @return the fecha_carga_libro
     */
    public String getFecha_carga_libro() {
        return fecha_carga_libro;
    }

    /**
     * @param fecha_carga_libro the fecha_carga_libro to set
     */
    public void setFecha_carga_libro(String fecha_carga_libro) {
        this.fecha_carga_libro = fecha_carga_libro;
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
     * @return the id_autor_libro
     */
    public Long getId_autor_libro() {
        return id_autor_libro;
    }

    /**
     * @param id_autor_libro the id_autor_libro to set
     */
    public void setId_autor_libro(Long id_autor_libro) {
        this.id_autor_libro = id_autor_libro;
    }

    /**
     * @return the disponible_libro
     */
    public Long getDisponible_libro() {
        return disponible_libro;
    }

    /**
     * @param disponible_libro the disponible_libro to set
     */
    public void setDisponible_libro(Long disponible_libro) {
        this.disponible_libro = disponible_libro;
    }

    /**
     * @return the id_prestamo
     */
    public Long getId_prestamo() {
        return id_prestamo;
    }

    /**
     * @param id_prestamo the id_prestamo to set
     */
    public void setId_prestamo(Long id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    /**
     * @return the id_libro_prestamo
     */
    public Long getId_libro_prestamo() {
        return id_libro_prestamo;
    }

    /**
     * @param id_libro_prestamo the id_libro_prestamo to set
     */
    public void setId_libro_prestamo(Long id_libro_prestamo) {
        this.id_libro_prestamo = id_libro_prestamo;
    }

    /**
     * @return the id_cuenta_prestamo
     */
    public Long getId_cuenta_prestamo() {
        return id_cuenta_prestamo;
    }

    /**
     * @param id_cuenta_prestamo the id_cuenta_prestamo to set
     */
    public void setId_cuenta_prestamo(Long id_cuenta_prestamo) {
        this.id_cuenta_prestamo = id_cuenta_prestamo;
    }

    /**
     * @return the fecha_prestamo
     */
    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    /**
     * @param fecha_prestamo the fecha_prestamo to set
     */
    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    /**
     * @return the fecha_devolucion
     */
    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    /**
     * @param fecha_devolucion the fecha_devolucion to set
     */
    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    /**
     * @return the id_tipo
     */
    public Long getId_tipo() {
        return id_tipo;
    }

    /**
     * @param id_tipo the id_tipo to set
     */
    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    /**
     * @return the nombre_tipo_libro
     */
    public String getNombre_tipo_libro() {
        return nombre_tipo_libro;
    }

    /**
     * @param nombre_tipo_libro the nombre_tipo_libro to set
     */
    public void setNombre_tipo_libro(String nombre_tipo_libro) {
        this.nombre_tipo_libro = nombre_tipo_libro;
    }
}
