package Biblioteca;

public class microfilms extends revistas{
    protected int codMicroFilm;
    public microfilms(){
        super();
        setCodMicroFilm();
    }

    public void setCodMicroFilm(){
        this.codMicroFilm = tc.nextInt();
    }
}
