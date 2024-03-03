import java.util.ArrayList;
import java.text.DecimalFormat;

public class Receipt {
    
    DecimalFormat f = new DecimalFormat("##.00");

    private ArrayList<Payment> payments = new ArrayList<>();

    public void newPayment(String name, int netto, int vat){
        payments.add(new Payment(name, netto, vat));
    }

    public void printReceipt(){

        int totalNetto8 = 0;
        int totalNetto23 = 0;
        double totalVAT8 = 0;
        double totalVAT23 = 0;

        for(Payment payment: payments){

            if(payment.getVat()==8){
                totalNetto8+=payment.getNetto();
            }
            else{
                totalNetto23+=payment.getNetto();
            }

        }
        totalVAT23=(totalNetto23*0.23);
        totalVAT8=(totalNetto8*0.08);
        
        System.out.println("|               | Total netto | Total VAT |");
        System.out.println("|---------------|-------------|-----------|");
        System.out.println("| VAT 8%        |     "+totalNetto8+"     |   "+f.format(totalVAT8)+"   |");
        System.out.println("| VAT 23%       |     "+totalNetto23+"      |   "+f.format(totalVAT23)+"   |");
    }
}
