package Entidades;

import java.util.Scanner;

public class Libro {
    public int iSBN;
    public String titulo;
    public String autor;
    public int numeroDePaginas;

    Scanner leer = new Scanner(System.in);

    public int getiSBN() {
        return iSBN;
    }

    public void setiSBN() {
        System.out.println("Introduzca el ISBN");
        this.iSBN = leer.nextInt();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo() {
        System.out.println("Introduzca el titulo");
        leer.nextLine();
        this.titulo = leer.nextLine();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor() {
        System.out.println("Introduzca el autor");
        this.autor = leer.nextLine();
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas() {
        System.out.println("Introduzca el numero de paginas");
        this.numeroDePaginas = leer.nextInt();
    }


    public void cargarDatos() {
        setiSBN();
        setTitulo();
        setAutor();
        setNumeroDePaginas();
    }

    public void mostrarDatos() {
        System.out.println("iSBN = " + getiSBN());
        System.out.println("titulo = " + getTitulo());
        System.out.println("autor = " + getAutor());
        System.out.println("numeroDePaginas = " + getNumeroDePaginas());
    }

    public Libro() {
    }

    public Libro(int iSBN, String titulo, String autor, int numeroDePaginas) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
}
/*
Crear una clase llamada Entidades.Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/