package java2assignment2;

class AssetFactory {
    public static  Asset createAsset(AssetType type, String assetName) {
        switch (type) {
            case cash:
                return new Cash(assetName);
            case stock:
                return new Stock(assetName);
            case house:
                return new House(assetName);
            case computer:
                return new Computer(assetName);
            case refrigerator:
                return new Refrigerator(assetName);
            default:
                throw new IllegalArgumentException("Invalid asset type: " + type);
        }
    }
}