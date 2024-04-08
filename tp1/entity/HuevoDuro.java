package entity;

import java.util.ArrayList;
import java.util.List;

public class HuevoDuro extends Receta {
    public HuevoDuro() {
        this.nombreReceta = "Huevo Duro";
        this.tiempoCoccion = 11;
        this.ingredientesReceta =new ArrayList<>(List.of(new Ingrediente("Agua", 200), new Ingrediente( "Huevo", 1)));
        this.preparacion = "Poner el huevo en agua hirviendo, el tiempo de cocción para el huevo duro es de 11 minutos. Así, tanto yema como clara quedarán completamente cuajadas. Si nos pasamos de tiempo, la yema quedará menos jugosa.";
    }
}
