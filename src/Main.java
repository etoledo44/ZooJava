//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Leo");
        Passaro passaro = new Passaro("Pass");

        Veterinario vet = new Veterinario();



        leao.dormir();
        passaro.dormir();

        leao.emitirSom();
        passaro.emitirSom();
        passaro.voar();

        vet.examinar(leao);
        vet.examinar(passaro);

        Animal animalAnonimo = new Animal("Criatura misteriosa") {
            @Override
            public void emitirSom() {
                System.out.println(nome + " faz um som bizarro...");
            }

            @Override
            public void getNomeAnimal() {
                System.out.println("Esse animal é misterioso, será que tem nome?");
            }
        };
        animalAnonimo.emitirSom();
        animalAnonimo.getNomeAnimal();

        leao.getTipo();
        passaro.getTipo();
        animalAnonimo.getTipo();

        class Cuidador{
            void alimentar(Animal a){
                System.out.println("Alimentando " + a.getTipo());
            }
        }

        Cuidador cuidador = new Cuidador();
        cuidador.alimentar(leao);
        cuidador.alimentar(passaro);
        cuidador.alimentar(animalAnonimo);
    }
}