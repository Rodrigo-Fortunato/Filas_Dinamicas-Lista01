package EX05.view;

import EX05.controller.FilaController;
import EX05.model.Cliente;
import filaGenerics.Fila;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fila<Cliente> fila = new Fila<>();
        Fila<Cliente> filaPrioritarios = new Fila<>();
        FilaController<Cliente> filaController = new FilaController<>();
        int menu = 0;


        while (menu!=9) {
            System.out.println("Selecione a Opção desejada: 1-Chamar Senha; " +
                    "2-Inserir Cliente não prioritario; " +
                    "3-Inserir Cliente prioritario");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println(filaController.chamarSenha(fila, filaPrioritarios));
                    break;
                case 2:
                    filaController.insertNotPriority(fila);
                    break;
                case 3:
                    filaController.insertPriority(filaPrioritarios);
                    break;
                case 9:
                    System.out.println("Encerrando");
                    break;

                default:
                    System.out.println("Digite uma Opção valida");
            }
        }




    }
}
