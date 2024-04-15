package EX01.view;

import EX01.controller.InverterFila;
import filaGenerics.Fila;

public class MainInverter {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        InverterFila<Integer> inverterFila = new InverterFila<>(fila);

        fila.insert(18);
        fila.insert(39);
        fila.insert(12);
        fila.insert(73);
        fila.insert(90);
        fila.insert(61);

        try {
            System.out.println("Lista Padrão");
            fila.list();

            inverterFila.Inverter();

            System.out.println("Lista invertida");
            fila.list();
            System.out.println("Item removido: "+  fila.remove());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
