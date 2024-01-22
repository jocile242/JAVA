import java.util.ArrayList;
import java.util.Objects;

    public class ListeDeCourses {

    private ArrayList<Article> listeArticle = new ArrayList<>();



///////////////////////////////////////////////////METHODES///////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// Ajout d'articles, avec et sans TVA spécifiée ////////

    public void ajouterArticle (Article article) {
            listeArticle.add(article);
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////
////////// Affichage de la liste ////////

    public void afficherListe() {
        for(Article article: listeArticle){
            System.out.println(article);
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////  Calcul du coût total avec TVA ////////

    public double calculerTotal() {
     double calculerTotal = 0;
        for (Article article : listeArticle) {
            calculerTotal += article.getQuantite() * article.getPrixunitaire() + article.getTva();
    }
    return calculerTotal;
}


////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////  Retirer un article ////////


    public void retirerArticle(String nom) {
        for (Article article : listeArticle) {
            if (Objects.equals(nom, article.getNom())) {
                listeArticle.remove(article); //////// Faire une copie de la liste temporaire  ////////
            }
        }
    }


}





