package java2assignment2;

public class Cash extends Asset {    
    public Cash(String name) {
        super(name);
    }
    @Override
    public AssetType getType() {
        return AssetType.cash;
    }
    @Override
    public String getName() {
        return super.name + ' ' + this.getType();
    }
}