public class FinancialForecasting {

    public static double futureValue(double currentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return futureValue(currentValue, growthRate, years - 1) 
                * (1 + growthRate);
    }

    public static void main(String[] args) {

        double initialValue = 10000;   
        double growthRate = 0.08;      
        int years = 5;

        double result = futureValue(initialValue, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + result);
    }
}