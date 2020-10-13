package best.programming;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Medicines {

    public static String maxRefund(List<Medicine> medicines){
        String medicineName = medicines
                .stream()
                .max(Comparator.comparing(Medicine::refundValue))
                .get().getName();

        return medicineName;
    }

    public static double totalValue(List<Medicine> medicines){
        return medicines
                .stream()
                .map(medicine -> medicine.getRefundPrice(true))
                .reduce(0D, Double::sum);

    }

    public static void showMedicinesList(List<Medicine> medicines){
        medicines.forEach(System.out::println);
    }


}
