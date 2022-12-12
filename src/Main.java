import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy("nurofen", 17, 3, "17/17/2069");
        Pharmacy pharmacy2 = new Pharmacy("analgin", 17, 99, "17/17/2078");
        Pharmacy pharmacy3 = new Pharmacy("aspirin", 17, 58, "17/17/2044");
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        printPharmacyWithLowerPriceThanFive(pharmacies);
    }
    public static void printPharmacyWithLowerPriceThanFive(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();
        for (Pharmacy p : pharmacies) {
            if(p.price > 5) {
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }
}