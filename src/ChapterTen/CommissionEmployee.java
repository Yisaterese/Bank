package ChapterTen;

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
        if (grossSale < 0.0) throw new IllegalArgumentException("Gross sale must be >= 0.0");

    if(commissionRate <=0.0||commissionRate >=1.0){
        throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0");
    }
    this.firstName =firstName;
    this.lastName =lastName;
    this.socialSecurityNumber =socialSecurityNumber;
    this.grossSales =grossSales;
    this.commissionRate =commissionRate;
    }
    public  String getFirstName(){
        return  firstName;
    }

    private  String getLastName(){
        return  lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    private void setGrossSales(double grossSales){
        if (grossSales < 0.0) throw new IllegalArgumentException("Gross sale must be >= 0.0");
        this.commissionRate = commissionRate;
    }

    private double getGrossSales() {
        return grossSales;
    }
    public void  setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw  new IllegalArgumentException("commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate(){return commissionRate;}

    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public  String toString(){
        return  String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(),getLastName(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }

}
