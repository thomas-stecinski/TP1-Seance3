import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de l'architecte :\n ");
        String nom = sc.nextLine();
        System.out.println("Entrez le prénom de l'architecte : \n");
        String prenom = sc.nextLine();
        System.out.println("Quel est votre civilité : \n");
        String civilite = sc.nextLine();
        System.out.println("Quel est votre mail : \n");
        String mail = sc.nextLine();
        System.out.println("Entrez le conseil régional de l'architecte \n: ");
        String conseilRegional = sc.nextLine();
        System.out.println("Est-il inscrit au conseil de l'ordre (true / false) :\n ");
        boolean inscriptionOrdre = sc.nextBoolean();
        System.out.println("Entrez la rue de l'adresse :\n ");
        String voie = sc.nextLine();
        System.out.println("Entrez la ville de l'adresse : \n");
        String ville = sc.nextLine();
        System.out.println("Entrez le code postal de l'adresse :\n ");
        String cp = sc.nextLine();
        System.out.println("Entrez le téléphone de l'architecte :\n ");
        String telephone = sc.nextLine();

        Adresse adresse = new Adresse(voie, ville, cp);
        Architecte architecte = new Architecte(nom, prenom, civilite, mail, conseilRegional, inscriptionOrdre, adresse, telephone);
        System.out.println(architecte);


    }
}