package EX01.controller;

import filaGenerics.Fila;

public class InverterFila<T> {

    private Fila<T> fila;
    public InverterFila(Fila<T> fila) {
        this.fila = fila;
    }
    public void Inverter(){
        T aux;

        if (!fila.isEmpty()){
            try {
                aux = fila.remove();
                Inverter();
                fila.insert(aux);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }


}
