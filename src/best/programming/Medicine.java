package best.programming;

public class Medicine {

    private final String name;
    private final double price;
    private final double refund;

    public Medicine(String name, double price, double refund) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.price = price;
        this.refund = refund;
    }

    public String getName() {
        return name;
    }

    public double getRefundPrice(boolean insured){
        if(insured){
            return price * (1 - refund);
        }
        return price;
    }

    public double refundValue(){
        return refund * price;
    }

    @Override
    public String toString() {
        return "name='" + name + ", price=" + price + ", refund=" + refund * 100 + "%";
    }
}
