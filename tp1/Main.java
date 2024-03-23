import entity.Ingrediente;

public class Main {
    public static void main(String[] args) {

        Ingrediente agua = new Ingrediente("Agua",500);
        Ingrediente huevo = new Ingrediente("Huevo", 3 );
        // Iterar sobre el ArrayList y llamar al método mostrarDatos() de cada objeto
        System.out.println(agua);
        System.out.println(huevo);
        }
    }

