public final class Veterinario {
    public void examinar(Animal a){
        System.out.println("Examinando o animal: " + a.getClass().getSimpleName());
        a.emitirSom();
    }
}
