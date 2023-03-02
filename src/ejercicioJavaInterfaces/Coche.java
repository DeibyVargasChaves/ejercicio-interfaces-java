package ejercicioJavaInterfaces;

public class Coche {

    String marca;
    String modelo;
    String color;
    int ancho;
    int alto;

    public Coche(){}


    public Coche(String marca, String modelo, String color, int ancho, int alto) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;


    }
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
