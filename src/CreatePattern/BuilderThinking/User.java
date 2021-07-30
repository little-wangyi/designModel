package CreatePattern.BuilderThinking;

public class User {
    public static void main(String[] args) {
        MilkTea originalMilkTea = new MilkTea.Builder("原味").build();
        show(originalMilkTea);
        MilkTea bananaMilkTea = new MilkTea.Builder("香蕉味").isIce(true).isPeral(true).build();
        show(bananaMilkTea);
        MilkTea blueberryMilkTea = new MilkTea.Builder("蓝莓味").size("大杯").isIce(false).isPeral(false).build();
        show(blueberryMilkTea);
    }
    public static void show(MilkTea milkTea) {
        String type = milkTea.GetTYpe();
        String size = milkTea.GetSize();
        String peral;
        String ice;
        if (milkTea.GetPeral() == false) {
            peral = "不加珍珠";
        } else {
            peral = "加珍珠";
        }
        if (milkTea.GetIce() == false) {
            ice = "不加冰";
        } else {
            ice = "加冰";
        }
        System.out.printf("一杯%s奶茶%s,%s,%s\n",type,size,peral,ice);
    }

}
