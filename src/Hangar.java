public class Hangar {

        public static void main (String[] args){

            Car voiture = new Car("Clio", 5000);
            Boat bateau = new Boat("Titanic", 2000);

            String retour = voiture.doStuff();
            System.out.println(retour);


            retour = bateau.doStuff();
            System.out.println(retour);


        }
    }

