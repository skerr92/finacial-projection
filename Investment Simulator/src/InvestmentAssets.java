public class InvestmentAssets {

    private String asset;
    private int value;
    private int investmentTerm;
    private String termType;
    private double interestRate;


    InvestmentAssets() {

    }

    InvestmentAssets(String asset1, int value1) {
        asset = asset1;
        value = value1;
        investmentTerm = 12;
        interestRate = 1.0;
        termType = "Month";
    }
    InvestmentAssets(String asset1, int value1, int theTerm, String typeTerm, double theRate) {
        asset = asset1;
        value = value1;
        investmentTerm = theTerm;
        termType = typeTerm;
        interestRate = theRate;
    }


    // Setters

    public void setTerm(int term, String type) {

        if ((term > 0) && !(type.isEmpty())) {
            this.investmentTerm = term;
            this.termType = type;
            //System.out.println(this.investmentTerm);
        } else if (type.isEmpty()) {
            System.out.println("Term type can not be empty");
        } else {
            System.out.println("Term Can Not Be Less Than 0");
        }
    }

    public void setInterestRate(double rate) {
        if (rate >= 0) {
            this.interestRate = rate;
            //System.out.println(this.interestRate);
        }
    }

    public void changeAssetValue(int newValue) {
        if (newValue > 0) {
            this.value = newValue;
            //System.out.println(this.value);
        } else {
            System.out.println("Assets can not have negative values");
        }
    }
    public void setAssetName(String name) {
        //Name should not contain white spaces. I will figure out how to remove all white space later.
        if (!(name.isEmpty())) {
            this.asset = name;
            //System.out.println(this.asset);
        } else {
            System.out.println("You must not leave asset name empty. Asset name unchanged");
        }
    }

    // Getters
    public String toString() {
        return asset + " " + value + " " + investmentTerm + " " + termType + " " + interestRate;
    }

    public String getName() {
        return asset;
    }
    public int getValue() {
        return value;
    }
    public int getTerm() {
        return investmentTerm;
    }
    public String getTermType() {
        return termType;
    }
    public double getInterestRate() {
        return interestRate;
    }



}
