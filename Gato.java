public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, double peso, String corPelo) {
        super(nome, idade, peso);
        this.corPelo = corPelo;
    }
}