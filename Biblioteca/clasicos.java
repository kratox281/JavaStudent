package Biblioteca;

public class clasicos extends documento{

    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int anio;
    public clasicos(){
        super();
        setTitulo();
        setAutor();
        setEditorial();
        setAnio();
    }

    public void setTitulo (){
        System.out.println("Introduce el titulo");
        this.titulo = tc.next();
    }
    public void setAutor (){
        System.out.println("Introduce el autor");
        this.autor = tc.next();
    }
    public void setEditorial(){
        System.out.println("Introduce la editorial");
        this.editorial = tc.next();
    }
    public void setAnio(){
        System.out.println("Introduce el año de publicación");
        this.anio = tc.nextInt();
    }


}
