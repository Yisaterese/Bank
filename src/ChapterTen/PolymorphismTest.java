package ChapterTen;

public class PolymorphismTest {
    public static void main(String[] args) {

    CommissionEmployee commissionEmployee = new CommissionEmployee("sue", "John", "222-22-2222", 10_000, .06);
    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        System.out.printf("%s %s:%n%n%s%n%n",
                "call commissionEmployee's toString with subclass",
                "reference to subclass object",
                basePlusCommissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n",
                "call BasePlusCommissionEmployee's toString with subclass", "reference to subclass object",
                basePlusCommissionEmployee.toString());

    //CommissionEmployee commissionEmployee1 =  basePlusCommissionEmployee;

        System.out.printf("%s %s: %n%n%s%n",
                "call basePlusCommissionEmployee's toString with superClass",
                "reference to subclass object");//commissionEmployee1.toString());
    }
}
