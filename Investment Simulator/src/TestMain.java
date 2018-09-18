public class TestMain {
    public static void main(String[] args) {
        String asset = "testAsset1";
        String testAssetMan = "Asset Management Test Array";
        int assetValue = 1000;
        InvestmentAssets testAsset = new InvestmentAssets(asset, assetValue);
        AssetManagement testTest = new AssetManagement(testAssetMan);
        testAsset.changeAssetValue(1500);
        testAsset.setInterestRate(4.9);
        testAsset.setTerm(24, "weeks");
        testAsset.setAssetName("HappyTime");

        InvestmentAssets secondTest = new InvestmentAssets("secondtest",5000);
        InvestmentAssets thirdTest = new InvestmentAssets("thirdtest",500);
        testTest.add(testAsset);
        testTest.add(secondTest);
        testTest.add(thirdTest);
        String filename = "outputfile.txt";
        AssetListFile outputFile = new AssetListFile(filename);
        outputFile.saveAssetFile(filename, testTest);
        outputFile.loadAssetFile(filename, testTest);

    }
}