package java2assignment2;
public class Stock extends Asset {
    public Stock(String name) {
        super(name);
    }
    @Override
    public AssetType getType() {
        return AssetType.stock;
    }
    @Override
    public String getName() {
        return super.name + ' ' + this.getType();
    }
}