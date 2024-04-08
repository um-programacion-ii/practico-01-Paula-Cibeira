package entity;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    protected String nombreReceta;
    protected int tiempoCoccion;
    protected List<Ingrediente> ingredientesReceta;
    protected String preparacion;

    public Receta() {
        this.ingredientesReceta = new ArrayList<>();
    }

    public Receta(String nombreReceta,int tiempoCoccion, List<Ingrediente> ingredientesReceta, String preparacion) {
        this.nombreReceta = nombreReceta;
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientesReceta = ingredientesReceta;
        this.preparacion = preparacion;
    }
    @Override
    public String toString(){
        String result = "\nReceta: " + nombreReceta + "\n";
        for (Ingrediente ingrediente : ingredientesReceta) {
            result += ingrediente.toString() + "\n";
        }
        result += "Tiempo de cocción: " + tiempoCoccion + " minutos\n";
        result += "Preparación: " + preparacion + "\n";
        return result;
    }

}
