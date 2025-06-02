public class Chien extends Animal {
    public Chien(String name) {
        super(name);
    }

    @Override
    public void communique() {
        System.out.println("Le chien " + getName() + " aboie.");
    }
}