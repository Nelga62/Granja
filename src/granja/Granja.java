package granja;

public class Granja
{
    private Granjero granjero;
    private String nombre;
    private String ubicacion;
    private int numeroAnimales;
    
    public Granja(Granjero granjero)
    {
        this.granjero = granjero;
    }
    
    public Granja(String nombre, String ubicacion, Granjero granjero, int numeroAnimales)
    {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.granjero = granjero;
        this.numeroAnimales = numeroAnimales;
    }
    
    public String toString()
    {
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("\nDatos de la Granja");
        resultado.append("\n======================");
        resultado.append("\nNombre: ");
        resultado.append(nombre);
        resultado.append("\nUbicacion: ");
        resultado.append(ubicacion);
        resultado.append("\nNúmero de animales: ");
        resultado.append(numeroAnimales);
        resultado.append("\nGranjero: ");
        resultado.append("\n======================");
        resultado.append(granjero);
        
        return resultado.toString();
    }
}
