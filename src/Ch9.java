//Ashley Grafner
//CSC 10606080, Computer Science 1 (Java)
//10/17/2022
/*Write a test program that creates a Stock object with the stock symbol ORCL , the name
Oracle Corporation , and the previous closing price of 34.5 . Set a new current
price to 34.35 and display the price-change percentage */

public class Ch9 {
    public static void main(String[] args) { //main method
        class Stock { //class name Stock
            private String symbol; //str data field = symbol
            private String name; // str data  field = name
            private double previousClosingPrice; // The stock price for the previous day
            private double currentPrice; // The stock price for the current time
            public Stock(String setSymbol, String setName) { //construct
                this.symbol = setSymbol;
                this.name = setName;
                this.previousClosingPrice = 0;
                this.currentPrice = 0;
            }
            public Stock(String setSymbol, String setName, double setPreviousClosingPrice, double setCurrentPrice) { //construct
                this.symbol = setSymbol;
                this.name = setName;
                this.previousClosingPrice = setPreviousClosingPrice;
                this.currentPrice = setCurrentPrice;
                //explicit setters
            }

            public String getSymbol() {
                return symbol;
            }
            public void setSymbol(String symbol) {
                this.symbol = symbol;
            }

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }

            public double getPreviousClosingPrice() {
                return previousClosingPrice;
            }
            public void setPreviousClosingPrice(double previousClosingPrice) {
                this.previousClosingPrice = previousClosingPrice;
            }

            public double getCurrentPrice() {
                return currentPrice;
            }
            public void setCurrentPrice(double currentPrice) {
                this.currentPrice = currentPrice;
            }

            public double getChangePercent() { //method getChangePercent
                return (currentPrice - previousClosingPrice) / previousClosingPrice *100 ; // finds the percent changed
            }
        }
        //Example code:
        Stock ORCLStock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        Stock YAHOOStock = new Stock("YAHOO", "Yahoo", 34.5, 34.35);

        System.out.println("Stock name: " + ORCLStock.getName());
        System.out.println("Symbol: " + ORCLStock.getSymbol());
        System.out.println("Previous Price: " +ORCLStock.getPreviousClosingPrice());
        System.out.println("Current Price: " + ORCLStock.getCurrentPrice());

        System.out.println("The percent change is " + ORCLStock.getChangePercent() + "%");
    }
}