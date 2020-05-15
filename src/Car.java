public class Car extends vehicule.Vehicule {
        private String modele;


        public Car(String brand, int kilometers){
            super(brand, kilometers);
        }

        public Car(String brand, int kilometers, String modele){
            super(brand, kilometers);
            this.modele = modele;
        }

        public String getModele(){
            return modele;
        }



        @Override
        public String doStuff() {

            return "je suis " + getBrand() + " et je fais vroum-vroum";

        }


    }
