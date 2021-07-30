package CreatePattern.BuilderThinking;

public class MilkTea {
    private final String type;
    private final String size;
    private final boolean peral;
    private final boolean ice;

    private MilkTea(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.peral = builder.peral;
        this.ice = builder.ice;
    }
    public String GetTYpe() {
        return type;
    }
    public String GetSize() {
        return size;
    }
    public boolean GetPeral() {
        return peral;
    }
    public  boolean GetIce() {
        return ice;
    }
    public static class Builder {
        private final String type;
        private String size = "中杯";
        private boolean peral = true;
        private boolean ice = false;

        public Builder(String type) {
            this.type = type;
        }

        public Builder isPeral(boolean peral) {
            this.peral = peral;
            return this;
        }

        public Builder isIce(boolean ice) {
            this.ice = ice;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }
        public MilkTea build(){
            return new MilkTea(this);
        }
    }

}
