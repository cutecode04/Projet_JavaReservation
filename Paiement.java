import java.util.Date;

public class Paiement {
    private double montant;
    private String methode;
    private String Statut;
    private Date datePaiement;

    public Paiement(double montant, String methode, String statut, Date datePaiement) {
        this.montant = montant;
        this.methode = methode;
        Statut = statut;
        this.datePaiement = datePaiement;
    }


    public void Payer(){

    }

    public void Rembourser(){

    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String statut) {
        Statut = statut;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "montant=" + montant +
                ", methode='" + methode + '\'' +
                ", Statut='" + Statut + '\'' +
                ", datePaiement=" + datePaiement +
                '}';
    }

}
