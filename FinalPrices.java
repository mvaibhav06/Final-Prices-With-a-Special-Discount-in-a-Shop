import java.util.Arrays;

public class FinalPrices {
    public static int[] getFinalPrices(int[] prices){
        int j = 0;
        for (int i=0; i<prices.length; i++){
            for (j=i+1; j<prices.length; j++){
                if (prices[j] <= prices[i]){
                    prices[i] = prices[i]-prices[j];
                    break;
                }
            }
        }

        return prices;
    }
    public static void main(String[] args) {
        int[] nums = {10,1,1,6};
        System.out.println(Arrays.toString(getFinalPrices(nums)));
    }
}
