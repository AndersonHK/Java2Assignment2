package java2assignment2;

public class House extends Asset {
    public House(String name) {
        super(name);
    }
    @Override
    public AssetType getType() {
        return AssetType.house;
    }
    @Override
    public String getName() {
        return super.name + ' ' + this.getType();
    }
}