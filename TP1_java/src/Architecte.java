import Personne.Personne;


class Architecte extends Personne {
        private String conseilRegional;
        private boolean inscriptionOrdre;
        private Adresse adresse;
        private String telephone;

public Architecte(String nom, String prenom, String conseilRegional, String mail, String regional, boolean
        inscriptionOrdre, Adresse adresse, String telephone)
        {
        super(nom, prenom);
        this.conseilRegional = conseilRegional;
        this.inscriptionOrdre = inscriptionOrdre;
        this.adresse = adresse;

        if (telephoneValide(telephone)) {
        this.telephone = telephone; }
        else {
        this.telephone = ""; }
        Maj_conseilRegional();
        }
private boolean telephoneValide(String telephone){
        if (telephone == null || telephone.length() != 10) {
                return false;
        }

        for (int i = 0; i < 10; i++) {
                if (!Character.isDigit(telephone.charAt(i))) {
                                return false;
                }
        }

                return true;
        }

public void Maj_conseilRegional() {
        if (inscriptionOrdre) {
                conseilRegional = conseilRegional + " - Inscrit au conseil de l'ordre";
        } else {
                conseilRegional = conseilRegional + " - Non inscrit au conseil de l'ordre";
        }
}

public String toString () {
        String chaine = "";
        chaine = chaine + super.toString();
        chaine = chaine + this.conseilRegional + " ";
        if (this.inscriptionOrdre) {
                chaine = chaine + "inscrit ";
        } else {
                chaine = chaine + "pas inscrit ";
        }
        chaine = chaine + this.telephone + " ";
        return chaine;
}
}
