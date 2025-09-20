package java2assignment2;

public abstract class Asset {
    protected String name;
    
        public Asset(String name) {
            this.name = name;
        }
    
        public AssetType getType() {
            return AssetType.cash; // Default type
        }
    
        public String getName() {
            return this.name;
        }
}