package InvoiceWithDiscountPlusTax.v2_oop_file;

public class Invoice {

    private  double amount;
    private  double tax;
    private  double discountedAmount;
    private  double total;

    public void calculate (double price , double quantity){

        amount = price * quantity;

        if (amount <= 200){
            // apply tax

            tax = amount * 0.08;
            discountedAmount = amount;
            total = amount + tax;
        }

        else{
            //apply discount
            discountedAmount = amount * 0.85;
            tax = discountedAmount * 0.08;
            total = discountedAmount + tax;
        }
    }

    public double getDiscountedAmount() {
        return discountedAmount;
    }

    public double getTax(){
        return  tax;
    }

    public double getTotal(){
        return  total;
    }
}
