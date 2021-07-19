package CreatePattern.AbsFactory;

import CreatePattern.Factory.PhoneFactory;

public abstract interface AbstractFactory {
    abstract Phone getHuawei();
    abstract Phone getIphone();
}
