package granja;

public class Mascota
{
    private String nombre;
    private int edad;
    private String tipo;

    public Mascota(String nombre, int edad, String tipo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nMascota: ");
        sb.append("\n======================");
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nEdad: ");
        sb.append(edad);
        sb.append("\nTipo: ");
        sb.append(tipo);
        
        return sb.toString();
    }
}
