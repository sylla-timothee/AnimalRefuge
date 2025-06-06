import java.util.ArrayList;

public class Refuge {
    private  ArrayList<Animal> animaux;

    public Refuge() {
        animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void lesFairesJacter() {
        for (Animal animal : animaux) {
            animal.communique();
        }
    }

    public void afficherLesStats() {
        int chiens = 0, chats = 0, autres = 0;
        for (Animal animal : animaux) {
            if (animal instanceof Chien) {
                chiens++;
            } else if (animal instanceof Chat) {
                chats++;
            } else {
                autres++;
            }
        }

        System.out.println("Statistiques du refuge :");
        System.out.println("Nombre de chiens : " + chiens);
        System.out.println("Nombre de chats : " + chats);    
        System.out.println("Nombre d'autres animaux : " + autres);

    }
}