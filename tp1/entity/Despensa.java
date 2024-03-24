package entity;

import java.util.ArrayList;
import java.util.List;

public class Despensa {
        protected List<Ingrediente> ingredientes;

        public Despensa() {
            this.ingredientes = new ArrayList<>();
        }
        public Despensa(List <Ingrediente> ing) {
            this.ingredientes = ing;

        }

        public void addIngredient(Ingrediente newIng) {
            ingredientes.add(newIng);

        }
        public void getIngredient(String nombre, int newCant) {
            for (Ingrediente ingrediente : ingredientes) {
                if (ingrediente.getNombre().equals(nombre)) {
                    ingrediente.sacar(newCant);
                    System.out.println("El ingrediente " + nombre + " tiene una cantidad de: " + ingrediente.cantidad);
                }
            }
        }
}








