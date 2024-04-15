package EX05.model;

public class Cliente {
    int Numero;
    String Nome;
    Cliente proximo;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "Numero= " + getNumero() +
                ", Nome= '" + getNome() + '}';
    }
}
