import entity.Ingrediente;
import entity.Despensa;

public class Main {
    public static void main(String[] args) {

        Ingrediente agua = new Ingrediente("Agua",500);
        Ingrediente huevo = new Ingrediente("Huevo", 3 );
        // Iterar sobre el ArrayList y llamar al método mostrarDatos() de cada objeto
        System.out.println(agua);
        System.out.println(huevo);

        Despensa despensa = new Despensa();
        despensa.addIngredient(agua);
        despensa.addIngredient(huevo);

    // Quitamos cierta cantidad de ingredientes
        despensa.getIngredient("Agua", 100);
        despensa.getIngredient("Huevo", 1);
        despensa.getIngredient("Huevo", 5);
    }
}




