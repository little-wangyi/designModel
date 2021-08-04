package CreatePattern.PrototypeThinking;

public class Order {
    public static void main(String[] args) throws CloneNotSupportedException {
//        MilkTea FamousMilkTea = new MilkTea();
//        FamousMilkTea.type = "原味奶茶";
//        FamousMilkTea.ice = false;
//
//        MilkTea MyMilkTea = FamousMilkTea.clone();
//        System.out.println(FamousMilkTea.toString());
//        System.out.println(MyMilkTea.toString());
        MilkTea2 famousMilkTea = new MilkTea2();
        famousMilkTea.type = "原味奶茶";
        famousMilkTea.ice = false;
        MilkTea2 myMilkTea = famousMilkTea.clone();
        System.out.println(famousMilkTea);
        System.out.println(myMilkTea);
    }
}
