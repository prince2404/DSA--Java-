import java.util.*;

public class GreedyAlgo {
    
    public static void main(String args[]){
        int n = 4, m = 6;
        Integer verCost[] = {2,1,3,1,4};
        Integer horCost[] = {4,1,2};

        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());

        int v = 0, h = 0;
        int vp = 1, hp = 1;
        int cost = 0;

        while(v < verCost.length && h < horCost.length){
            if(verCost[v] >= horCost[h]){
                cost += verCost[v] * hp;
                vp++;
                v++;
            }else{
                cost += horCost[h] * vp;
                hp++;
                h++;
            }

        }

        while(v < verCost.length){
            cost += verCost[v] * hp;
            vp++;
            v++;
        }
        while(h < horCost.length){
            cost += horCost[h] * vp;
            hp++;
            h++;
        }

        System.out.println("Min cost = " + cost);

    }
    
}
