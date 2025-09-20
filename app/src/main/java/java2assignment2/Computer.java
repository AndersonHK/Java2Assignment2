package java2assignment2;
public class Computer extends Asset {
    public Computer(String name) {
        super(name);
    }
    @Override
    public AssetType getType() {
        return AssetType.computer;
    }
    @Override
    public String getName() {
        return super.name + ' ' + this.getType();
    }
}