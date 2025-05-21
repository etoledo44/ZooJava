public class Leao extends Animal {
    public Leao(String nome){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " Ruge!");
    }

    @Override
    public void getNomeAnimal() {
        System.out.println("O nome do animal é: " + nome);
    }
}
