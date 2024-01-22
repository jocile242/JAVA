///// Classe Article - contient les informations d'un article /////

public class Article {
    protected String nom;
    protected Double prixunitaire;
    protected int quantite;
    protected Double tva;



    /// Constructeur Article - Nom - PrixUnitaire - Quantite - TVA par défaut /////

    public Article(String nom, Double prixunitaire, int quantite) {
        this.nom = nom;
        this.prixunitaire = prixunitaire;
        this.quantite = quantite;
        this.tva = 0.2;
    }


    ///// Constructeur Article - Nom - PrixUnitaire - Quantité - TVA personnalisé  /////

    public Article(String nom, Double prixunitaire, int quantite, Double tva) {
        this.nom = nom;
        this.prixunitaire = prixunitaire;
        this.quantite = quantite;
        this.tva = tva;
    }


    //////////////// Getter and Setter /////////////////////////////////////


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(Double prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }
}




























