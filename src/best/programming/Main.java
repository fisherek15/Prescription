package best.programming;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Medicine> medicines = new ArrayList<>();
        Medicine medicine1 = new Medicine("apap", 15.5, 0.2);
        Medicine medicine2 = new Medicine("nospa", 13.9, 0.1);
        Medicine medicine3 = new Medicine("ibuproM", 9.28, 0.5);

        medicines.add(medicine1);
        medicines.add(medicine2);
        medicines.add(medicine3);

        System.out.println("Max redunf: " + Medicines.maxRefund(medicines));
        System.out.println("Total value: " + Medicines.totalValue(medicines));
        Medicines.showMedicinesList(medicines);

    }
}
