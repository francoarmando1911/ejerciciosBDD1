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
    private int isbn;
    private String autor;
    private Date fechaPublicacion;
    private int cantPaginas;
    private String categoria;

    public Libro(Integer id, String titulo, int isbn, String autor, Date fechaPublicacion, String categoria, int cantPaginas) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.categoria = categoria;
        this.cantPaginas = cantPaginas;
    }
}
