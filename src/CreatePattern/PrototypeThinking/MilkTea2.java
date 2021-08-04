package CreatePattern.PrototypeThinking;

import com.sun.istack.internal.NotNull;

public class MilkTea2 implements Cloneable{
    public String type;
    public boolean ice;

    @NotNull
    @Override
    protected MilkTea2 clone() throws CloneNotSupportedException {
        return (MilkTea2) super.clone();
    }

    @Override
    public String toString() {
        return "MilkTea2{" +
                "type='" + type + '\'' +
                ", ice=" + ice +
                '}';
    }
}
