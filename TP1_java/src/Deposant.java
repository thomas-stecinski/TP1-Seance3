import Personne.Personne;

class Deposant extends Personne {
    private String civilite;
    private String mail;
    private String adresse;

    public Deposant(String nom, String prenom, String civilite, String mail, String adresse) {
        super(nom, prenom);
        this.civilite = civilite;
        this.mail = mail;
        this.adresse = adresse;
    }
public String toString(){
        String chaine = "";
        chaine = chaine + super.toString() + " ";
        chaine = chaine + this.civilite + " ";
        chaine = chaine + this.mail + " ";
        chaine = chaine + this.adresse + " ";
        return chaine;

}

}
