package entity;

import java.util.ArrayList;
import java.util.List;

public class HuevoAgua extends Receta{
    public HuevoAgua() {
        this.nombreReceta = "Huevo Agua";
        this.tiempoCoccion = 10;
        this.ingredientesReceta =new ArrayList<>(List.of(new Ingrediente("Agua", 200), new Ingrediente( "Huevo", 1)));
        this.preparacion = "Usar un cocedor a baja temperatura y programarlo a 64ºC exactamente y cocer los huevos unos 10 minutos o más. La clara empieza a cuajar a 63ºC y la yema a 65ºC  por lo que si usamos una temperatura entre las dos, conseguiremos un huevo con la clara cuajada (aunque no excesivamente dura) y la yema líquida.";
    }

}



