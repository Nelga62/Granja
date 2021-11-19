package granja;

public class Granjero
{
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private Mascota mascota;
    
    public Granjero(String nombre, String apellidos, int edad, char sexo)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getApellidos()
    {
        return apellidos;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public void setMascota(Mascota mascota){
        this.mascota = mascota;
    }
    
    public String toString()
    {
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("\nNombre: ");
        resultado.append(nombre);
        resultado.append("\nApellidos: ");
        resultado.append(apellidos);
        resultado.append("\nEdad: ");
        resultado.append(edad);
        resultado.append("\nSexo: ");
        resultado.append(sexo);
        resultado.append(mascota);
        
        return resultado.toString();
    }
}
