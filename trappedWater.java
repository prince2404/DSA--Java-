import java.util.*;

public class trappedWater{

    public static void trappedWater(int height[]){
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i < leftMax.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int rightMax[] = new int[height.length];
        rightMax[rightMax.length - 1] = height[height.length - 1];
        for(int i = rightMax.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1],height[i]);
        }

        int trapWater = 0;
        for(int i = 0; i < height.length; i++){
            int wl = Math.min(leftMax[i], rightMax[i]);
            trapWater = trapWater + (wl-height[i]);
        }

        System.out.println("Total trapped water = " + trapWater);
    }

    public static void buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        System.out.println("Max. profit = " + maxProfit);
    }
    
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        
        trappedWater(height);

        // int prices[] = {7,1,5,3,6,4};
        // int prices[] = {4,3,2,1,0};
        // buyAndSellStocks(prices);
    }
}