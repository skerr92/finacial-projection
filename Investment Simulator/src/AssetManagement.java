import java.util.ArrayList;

public class AssetManagement {

    private String assetOrganizerName;
    private ArrayList<InvestmentAssets> assetsArrayList = new ArrayList<InvestmentAssets>();
    //Empty Constructor
    AssetManagement() {

    }

    /**
     *
     * @param organizerName Name of Asset List
     */
    AssetManagement(String organizerName) {
        assetOrganizerName = organizerName;
        ;
    }
    //Add item to Asset Management List
    public void add(InvestmentAssets initAsset) {
        assetsArrayList.add(initAsset);
    }
    //Remove item from Asset Management List
    public void remove(InvestmentAssets removeAsset) {
        assetsArrayList.remove(removeAsset);
    }
    //Get size of asset array
    public int size() {
        return assetsArrayList.size();
    }
    public String getAtIndex(int i) {
        return assetsArrayList.get(i).toString();
    }
    public String getNameAtIndex(int i) {
        return assetsArrayList.get(i).getName();
    }
    public int getValueAtIndex(int i) {
        return assetsArrayList.get(i).getValue();
    }
    public int getTermLengthAtIndex(int i) {
        return assetsArrayList.get(i).getTerm();
    }
    public String getTermTypeAtIndex(int i) {
        return assetsArrayList.get(i).getTermType();
    }
    public double getInterestAtIndex(int i) {
        return assetsArrayList.get(i).getInterestRate();
    }

    //Convert an Asset list to an line by line string using InvestmentAssets toString() method
    public void itemToString() {
        String itemString;
        for (int i = 0; i < assetsArrayList.size(); i++) {
            itemString = assetsArrayList.get(i).toString();
            System.out.println(itemString);
        }
    }

}
