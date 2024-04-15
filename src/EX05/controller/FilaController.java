package EX05.controller;

import EX05.model.Cliente;
import filaGenerics.Fila;

import java.util.Scanner;

public class FilaController<T> {

    private int chamadasPrioritarias = 0;
    private boolean regraDe3 = false;
    private static int Senha = 0;
    private static int SenhaPrioritaria = 0;
    //deve dar ao usuário a
    //possibilidade de inserir uma nova senha na fila,
    //uma nova senha na fila de prioritários

    //O método de inserir um novo elemento na fila;

    //ou chamar uma pessoa para o atendimento.
    //O método de remover o primeiro elemento da fila, que será atendido. A fila não pode estar vazia;

    //O método de chamado que deve seguir a seguinte regra:
    //• Fazer 3 chamadas prioritárias para 1 da fila não prioritária
    //• Se não houver prioritários, já se deve chamar dos não prioritários


    public void insertNotPriority(Fila<Cliente> fila) {
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Senha++;

        System.out.println("Digite o Nome do Cliente");
        cliente.setNome(scan.next());
        cliente.setNumero(Senha);
        fila.insert(cliente);
        System.out.println(cliente);

    }

    public void insertPriority(Fila<Cliente> filaPrioritaria) {
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        SenhaPrioritaria++;

        System.out.println("Digite o Nome do Cliente");
        cliente.setNome(scan.next());
        cliente.setNumero(SenhaPrioritaria);
        filaPrioritaria.insert(cliente);
        System.out.println(cliente);
    }


    public T chamarSenha(Fila<T> fila, Fila<T> filaPrioritaria) {


        if (chamadasPrioritarias == 3) {
            regraDe3 = true;
            chamadasPrioritarias = 0;
        }

        if (filaPrioritaria.isEmpty() || regraDe3) {

            regraDe3 = false;
            if (!fila.isEmpty()) {

                return callNotPriority(fila);
            }

        } else {
            chamadasPrioritarias++;
            return callPriority(filaPrioritaria);
        }


        return null;

    }

    private T callPriority(Fila<T> filaPrioritaria) {
        try {
            return filaPrioritaria.remove();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private T callNotPriority(Fila<T> fila) {

        try {
            return fila.remove();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
