package java2assignment2;
public class Refrigerator extends Asset {
    public Refrigerator(String name) {
        super(name);
    }
    @Override
    public AssetType getType() {
        return AssetType.refrigerator;
    }
    @Override
    public String getName() {
        return super.name + ' ' + this.getType();
    }
}