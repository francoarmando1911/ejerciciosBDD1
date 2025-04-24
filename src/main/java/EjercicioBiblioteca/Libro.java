package EjercicioBiblioteca;

import java.util.Date;

/*
    - Título
    - ISBN
    - Autor o autores
    - Fecha de publicación
    - Cantidad de páginas
    - Editorial
    - Dirección y teléfono de la editorial
    - Categoría(s) a la(s) que pertenece (Ficción, Historia, Arte, Referencia, etc.)
    - Fecha en que el ejemplar se dio de alta en la biblioteca
    - Código de inventario del ejemplar
    - Código de ubicación del ejemplar
 */
public class Libro {
    private Integer id;
    private String titulo;
    private Integer isbn;
    private String autor;
    private Date fechaPublicacion;
    private Integer cantPaginas;
    public enum categoria{
        FICCION,
        HISTORIA,
        ARTE,
        REFERENCIA
    }

    public Libro(Integer id, String titulo, Integer isbn, String autor, Date fechaPublicacion, Integer cantPaginas) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.cantPaginas = cantPaginas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(Integer cantPaginas) {
        this.cantPaginas = cantPaginas;
    }
}
