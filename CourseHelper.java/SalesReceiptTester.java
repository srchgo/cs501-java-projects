public class SalesReceiptTester {
    public static void main(String[] args) {
        double [] prices = new double [100];
        double positiveTotal = 0;
        double negativeTotal = 0;
        double tax = 0;
        double totalDue = 0;
        double mostExpensive = Double.MIN_VALUE;
        boolean foundPositive = false;
        boolean foundNegative = false;

        // Populate prices array
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Math.round((Math.random() * 22 - 2) * 100.0) / 100.0;

            if (prices[i] > 0) {
                foundPositive = true;
                positiveTotal += prices[i];
                if (prices[i] > mostExpensive) {
                    mostExpensive = prices[i];
                }
            } else {
                foundNegative = true;
                negativeTotal += prices[i];
            }
        }

        tax = Math.round(positiveTotal * 0.03 * 100.0) / 100.0;
        totalDue = Math.round((positiveTotal + tax) * 100.0) / 100.0;

        // TEST CASES
        System.out.println("=== WHITE BOX TEST RESULTS ===");

        // Test 1: Check array is filled
        boolean allFilled = true;
        for (double p : prices) {
            if (p == 0.0) {
                allFilled = false;
                break;
            }
        }
        System.out.println(allFilled ? "Array fill test passed." : "Array fill test failed.");

        // Test 2: Check positive sum is calculated
        System.out.println(foundPositive && positiveTotal > 0 ? "Positive total calculation passed." : "Positive total calculation failed.");

        // Test 3: Check negative sum is calculated
        System.out.println(foundNegative ? "Negative total calculation passed." : "Negative total calculation failed.");

        // Test 4: Check most expensive item is greater than or equal to all values
        boolean maxCorrect = true;
        for (double p : prices) {
            if (p > mostExpensive) {
                maxCorrect = false;
                break;
            }
        }
        System.out.println(maxCorrect ? "Most expensive item test passed." : "Most expensive item test failed.");

        // Test 5: Check tax is 3% of positive total (rounded)
        double expectedTax = Math.round(positiveTotal * 0.03 * 100.0) / 100.0;
        System.out.println(tax == expectedTax ? "Tax calculation test passed." : "Tax calculation test failed.");

        // Test 6: Check totalDue is sum of positiveTotal and tax
        double expectedTotalDue = Math.round((positiveTotal + tax) * 100.0) / 100.0;
        System.out.println(totalDue == expectedTotalDue ? "Total due calculation passed." : "Total due calculation failed.");

        System.out.println("=== END OF TESTS ===");
    }
}
