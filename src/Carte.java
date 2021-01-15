public class Carte {

    private int chiffre;
    private String couleur;

    public Carte(int chiffre, String couleur){
        this.chiffre = chiffre;
        this.couleur = couleur;

    }


    public String toString(){
        return "Carte : " + this.couleur + " " + this.chiffre ;
    }





}
