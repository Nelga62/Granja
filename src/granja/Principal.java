package granja;

public class Principal
{

    public static void main(String []args)
    {
      Granjero paco = new Granjero("Paco", "Martinez", 58, 'H');
      Granja granjaDePaco = new Granja("Pacolandia", "Corea del Norte", paco, 20);
      Mascota mascota = new Mascota("Rex", 13, "Perro");
      paco.setMascota(mascota);
      System.out.println(granjaDePaco); 
    }

}