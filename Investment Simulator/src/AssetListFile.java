import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;


public class AssetListFile {

    String filename;
    InvestmentAssets asset1 = new InvestmentAssets();
    AssetManagement assetManagement = new AssetManagement(filename);
    AssetListFile() {

    }
    AssetListFile(String fileName) {
        filename = fileName;

    }

    public void loadAssetFile(String filename, AssetManagement assetManagement) {
        try {
            Scanner assetInput = new Scanner(new File(filename));

            while (assetInput.hasNext()) {
                String [] line = assetInput.nextLine().split(" ");
                int valueInt = Integer.parseInt(line[1]);
                int termInt = Integer.parseInt(line[2]);
                double rateDouble = Double.parseDouble(line[4]);
                InvestmentAssets newAsset = new InvestmentAssets(line[0], valueInt, termInt, line[3], rateDouble);
                assetManagement.add(newAsset);


            }
            for (int i = 0; i < assetManagement.size()/2; i++) {
                System.out.println(assetManagement.getAtIndex(i));
            }
        }
        catch (java.io.IOException ex) {
            System.err.println("File " + filename + " does not exist");
        }
    }

    public static void saveAssetFile(String filename, AssetManagement assetManagement) {
        try {
            PrintWriter newAssetFile = new PrintWriter(new File(filename));

            for (int i = 0; i < assetManagement.size(); i++) {

                newAssetFile.println(assetManagement.getNameAtIndex(i) + " " + assetManagement.getValueAtIndex(i) +" "+ assetManagement.getTermLengthAtIndex(i) +" "+ assetManagement.getTermTypeAtIndex(i) +" "+ assetManagement.getInterestAtIndex(i));

            }

            newAssetFile.close();

        }
        catch (java.io.IOException ex) {
            System.err.println("Could not open file to write");

        }
    }

}
