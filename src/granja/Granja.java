package granja;

public class Granja
{
    private Granjero granjero;
    private String nombre;
    private String ubicacion;
    
    public Granja(Granjero granjero)
    {
        this.granjero = granjero;
    }
    
    public Granja(String nombre, String ubicacion, Granjero granjero)
    {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.granjero = granjero;
    }
    
    public String toString()
    {
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("\nDatos de la Granja");
        resultado.append("\n======================");
        resultado.append("\nNombre: ");
        resultado.append(nombre);
        resultado.append("\nUbicación: ");
        resultado.append(ubicacion);
        resultado.append("\nGranjero: ");
        resultado.append("\n======================");
        resultado.append(granjero);
        
        return resultado.toString();
    }
}
