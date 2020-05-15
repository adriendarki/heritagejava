public class Boat extends vehicule.Vehicule {
    private String modele;

    public Boat(String brand, int kilometers){
        super(brand, kilometers);

    }

    public Boat(String brand, int kilometers, String modele){
        super(brand, kilometers);
        this.modele = modele;
    }

    public String GetModele(){
        return modele;
    }


    @Override
    public String doStuff() {

        return "je suis " + getBrand() + " et je fais glou-glou";

    }

}
