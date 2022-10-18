//Ashley Grafner
//CSC 10606080, Computer Science 1 (Java)
//10/17/2022
/*Write a test program that creates a Stock object with the stock symbol ORCL , the name
Oracle Corporation , and the previous closing price of 34.5 . Set a new current
price to 34.35 and display the price-change percentage */

public class Ch9 {
    public static void main(String[] args) { //main method
        class Stock { //class name Stock
            String symbol; //str data field = symbol
            String name; // str data  field = name
            double previousClosingPrice; // The stock price for the previous day
            double currentPrice; // The stock price for the current time

            public Stock(String setSymbol, String setName) { //construct
                symbol = setSymbol;
                name = setName;
            }

            public String setSymbol() { //returns the symbol as str
                return symbol;
            }
            public String setName() { //returns name as str
                return name;
            }
            public double setCurrentPrice() { //returns the current price as a double
                return currentPrice;
            }
            public double setPreviousClosingPrice() { //returns previous price as double
                return previousClosingPrice;
            }

            public void setCurrentPrice(double currentPrice) {
                this.previousClosingPrice = this.currentPrice;
                this.currentPrice = currentPrice;
            }

            public double getChangePercent() { //method getChangePercent
                return (currentPrice - previousClosingPrice) / previousClosingPrice *100 ; // finds the percent changed
            }
        }

        //Example code
        Stock example = new Stock("ORCL","Oracle Corporation"); //symbol="ORCL" and name="Oracle Corporation"
        example.setCurrentPrice(34.5);
        example.setCurrentPrice(34.35);
        System.out.println("Stock name: " + example.setName() + " Symbol: " + example.setSymbol());
        System.out.println("Previous price: " + example.setPreviousClosingPrice());
        System.out.println("Current price: " + example.setCurrentPrice());

        System.out.println("Percent changed: " +example.getChangePercent()+" %");

    }
}





