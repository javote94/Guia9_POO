package entidad;

public class Ahorcado {

    //Atributos
    private String[] palabraSecreta;
    private int nLetrasEncontradas;
    private int jugadasMaximo;

    //Constructor vacío
    public Ahorcado() {
    }
    
    //Constructor con parámetros
    public Ahorcado(String[] palabraSecreta, int jugadasMaximo) {
        this.palabraSecreta = palabraSecreta;
        this.jugadasMaximo = jugadasMaximo;
    }
    

    //Getters & Setters
    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getnLetrasEncontradas() {
        return nLetrasEncontradas;
    }

    public void setnLetrasEncontradas(int nLetrasEncontradas) {
        this.nLetrasEncontradas = nLetrasEncontradas;
    }

    public int getJugadasMaximo() {
        return jugadasMaximo;
    }

    public void setJugadasMaximo(int jugadasMaximo) {
        this.jugadasMaximo = jugadasMaximo;
    }
}


