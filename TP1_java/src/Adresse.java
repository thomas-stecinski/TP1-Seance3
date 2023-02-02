public class Adresse {
    private String numero;
    private String voie;
    private String ville;
    private String cp;

    public Adresse(String numero, String voie, String ville){
        this.numero = validate(numero, 3);
        this.voie = validate(voie,50);
        this.ville = validate(ville,30);
        this.cp = validate(cp, 5);

    }
    private String validate (String chaine, Integer taaille){
        return chaine;
    }
}
