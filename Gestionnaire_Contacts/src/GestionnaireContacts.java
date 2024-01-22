import java.util.ArrayList;

public class GestionnaireContacts {
    ///// Array list /////
    private ArrayList<Contact> listeContact = new ArrayList<>();



///////////////////////////////////////////////////METHODES///////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// ///// Ajouter Nouveau Contact/////

    public void ajouterContact(Contact contact) { // En-tête de la méthode
        // Ajouter contact dans la liste
            listeContact.add(contact);
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Affichage des contacts

    public void afficherContacts() { // En-tête de la méthode
        for(Contact contact: listeContact){
            System.out.println(contact);
        }
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Mettre à jour d'un contact

    public void mettreAJourContact(String nom, String prenom, String email) {  // En-tête de la méthode
        Contact contact = chercherContact(nom,prenom);
        contact.setEmail(email);
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Recherche d'un contact

    public Contact chercherContact(String nom, String prenom) {  // En-tête de la méthode
        for (Contact contact:listeContact){
            if (nom == contact.getNom() && prenom == contact.getPrenom()){
                return contact;
            }
        }
        return null;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Suppression d'un contact

    public void supprimerContact(String nom, String prenom) { // En-tête de la méthode
           Contact contact = chercherContact(nom,prenom);
           listeContact.remove(contact);
        }
    }








