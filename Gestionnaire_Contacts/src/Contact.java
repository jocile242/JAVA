///// Classe Contact - contient les informations d'un contact /////

public class Contact {
   private String nom;
   private String prenom;
   private String telephone;
   private String email;

   //////////////// Constructeur de contact /////////////////

   public Contact(String nom, String prenom, String telephone, String email) {
      this.nom = nom;
      this.prenom = prenom;
      this.telephone = telephone;
      this.email = email;
   }

   //////////////// Getter and Setter //////////////////// /////////////////

   public String getNom() {                          //////////////// Getter
      return nom;
   }

   public void setNom(String nom) {                   //////////////// Setter
      this.nom = nom;
   }

   public String getPrenom() {                        //////////////// Getter
      return prenom;
   }

   public void setPrenom(String prenom) {             //////////////// Setter
      this.prenom = prenom;
   }

   public String getTelephone() {                       //////////////// Getter
      return telephone;
   }

   public void setTelephone(String telephone) {          //////////////// Setter
      this.telephone = telephone;
   }

   public String getEmail() {                            //////////////// Getter
      return email;
   }

   public void setEmail(String email) {                  //////////////// Setter
      this.email = email;
   }
}








