package CreatePattern.SimpleFactory;

public class SimpleFactory {
   public Phone GetPhone(String name){
       switch (name){
           case "huawei":
               return new Huawei();
           case "iphone":
               return new Iphone();
       }
       return null;
   }
}
