public class Passaro extends Animal implements Voavel{
    public Passaro(String nome){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " canta!!");

    }

    @Override
    public void getNomeAnimal() {
        System.out.println("O nome do animal é: " + nome);
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando!!");
    }
}
