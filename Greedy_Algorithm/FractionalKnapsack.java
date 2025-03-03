package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Fractional Knapsack (GFG)
 * Input:- arr={{60,10},{100,20},{120,30}} and w=50
 * Output:- 240
 * Explanation:- By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg,
 *               Hence total price will be 
 *               60 + 100 + (2/3) (120) => 60 + 100 + 80 => 240
 */

public class FractionalKnapsack { // T.C = O(NlogN) S.C = O(N)
    public static class Item {
        Integer value;
        Integer weight;

        public Item(Integer value, Integer weight) {
            this.value = value;
            this.weight = weight;
        }

        public String toString() {
            return "(" + value + ", " + weight + ")";
        }
    }

    public static class ItemComparator implements Comparator<Item> {
        public int compare(Item i1, Item i2) {
            double ratio1 = (double) i1.value / i1.weight;
            double ratio2 = (double) i2.value / i2.weight;
            return Double.compare(ratio2, ratio1); // Sort in descending order
        }
    }

    public static void main(String[] args) {
        List<Integer> value = List.of(60, 100, 120);
        List<Integer> weights = List.of(10, 20, 30);
        List<Item> itemsList = new ArrayList<>();

        for (int i = 0; i < value.size(); i++) {
            itemsList.add(new Item(value.get(i), weights.get(i)));
        }

        // Sorting items based on value/weight ratio
        itemsList.sort(new ItemComparator());
        System.out.println("Sorted Items by value/weight ratio: " + itemsList);

        int w = 50; // Knapsack capacity
        double profit = 0;

        for (Item item : itemsList) {
            if (item.weight <= w) {
                profit += item.value;
                w -= item.weight;
            } else {
                profit += ((double) item.value / item.weight) * w;
                break; // No more weight capacity
            }
        }

        System.out.println("Maximum Profit: " + profit);
    }
}
