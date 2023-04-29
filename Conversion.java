abstract class Conversion {
    double amount;
    
    abstract double moneyConversion();
}

class RupeeToDollar extends Conversion {
    RupeeToDollar(double amount) {
        this.amount = amount;
    }
    
    @Override
    double moneyConversion() {
        // Assuming 1 Rupee = 0.014 USD
        return amount * 0.014;
    }
}

class RupeeToEuro extends Conversion {
    RupeeToEuro(double amount) {
        this.amount = amount;
    }
    
    @Override
    double moneyConversion() {
        // Assuming 1 Rupee = 0.012 Euro
        return amount * 0.012;
    }
}

public class Main {
    public static void main(String[] args) {
        Conversion c1 = new RupeeToDollar(100);
        Conversion c2 = new RupeeToEuro(100);
        System.out.println("100 Rupees in Dollars: $" + c1.moneyConversion());
        System.out.println("100 Rupees in Euros: €" + c2.moneyConversion());
    }
}
