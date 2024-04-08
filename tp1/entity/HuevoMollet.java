package entity;

import java.util.ArrayList;
import java.util.List;

public class HuevoMollet extends Receta {
    public HuevoMollet() {
        this.nombreReceta = "Huevo Mollet";
        this.tiempoCoccion = 6;
        this.ingredientesReceta =new ArrayList<>(List.of(new Ingrediente("Agua", 200), new Ingrediente( "Huevo", 1)));
        this.preparacion = "Usar un cocedor a baja temperatura y programarlo a 64ºC exactamente y cocer los huevos durante 6 minutos. La clara está más solida y la yema queda prácticamente líquida en comparación con el huevo pasado por agua.";
    }
}
