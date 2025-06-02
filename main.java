public class main {
    public static void main(String[] args) {
        Refuge refuge = new Refuge();

        refuge.ajouterAnimal(new Chien("Thrall"));
        refuge.ajouterAnimal(new Chat("Grimg'or"));
        refuge.ajouterAnimal(new Chien("Vlad"));
        refuge.ajouterAnimal(new Chat("Jaina"));

        refuge.lesFairesJacter();
        refuge.afficherLesStats();
    }
}