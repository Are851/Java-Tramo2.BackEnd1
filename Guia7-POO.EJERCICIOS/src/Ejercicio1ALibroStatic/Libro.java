/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */

package Ejercicio1ALibroStatic;

import java.util.Scanner;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int nroPag;
///Constructor vacio
    public Libro() {
    }
///Constructor con parametros
    public Libro(int isbn, String titulo, String autor, int nroPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
    }
    ///metodo para caragar datos
    public static void cargarLibro(Libro ingreso) {
        
        Scanner leer = new Scanner(System.in);    
        System.out.print("Ingrese ISBN: ");
        ingreso.setIsbn(leer.nextInt());
        leer.nextLine();
        
        System.out.print("Ingrese titulo: ");
        ingreso.setTitulo(leer.nextLine());
        
        System.out.print("Ingrese autor: ");
        ingreso.setAutor(leer.nextLine());
        
        System.out.print("Ingrese el nro de paginas: ");
        ingreso.setNroPag(leer.nextInt());
        
    }
///
    public static void mostrarLibro(Libro ingreso) {
        
        System.out.println(ingreso);
        
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    @Override //etiqueta sobreescribir
    public String toString() {
        return "Libro[" + "ISBN=" + isbn + ", Titulo=" + titulo + ", Autor=" + autor + ", Nro de Paginas=" + nroPag + ']';
    }
    
}
    
