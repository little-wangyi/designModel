package PrototypeThinking;

public class MilkTea {
    public String type;
    public boolean ice;

    public MilkTea clone() {
        MilkTea milkTea = new MilkTea();
        milkTea.type = this.type;
        milkTea.ice = this.ice;
        return milkTea;
    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", ice=" + ice +
                '}';
    }
}
