public abstract class Animal implements Identificavel {
    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void dormir(){
        System.out.println(nome + " está dormindo agora... zZz");
    }

    public abstract void emitirSom();
    public abstract void getNomeAnimal();
    public String getTipo(){
        String tipo = this.getClass().getSimpleName();
        return tipo.isEmpty() ? "Animal anonimo" : tipo;
    }
}
