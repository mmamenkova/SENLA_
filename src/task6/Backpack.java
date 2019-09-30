package task6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int maxWeight;
    private int bestCost;
    private List<Thing> bestThings = null;

    public Backpack(int maxWeight) {
        setMaxWeight(maxWeight);
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }

    public void setMaxWeight(int maxWeight){
        if (maxWeight>0) {
            this.maxWeight = maxWeight;
        }
    }

    public List<Thing> getBestThings(){
        return this.bestThings;
    }

    public int getBestCost() {
        return this.bestCost;
    }

    private int CalcWeight(List<Thing> things) {
        int sum = 0;
        for (Thing th : things) {
            sum += th.getWeight();
        }
        return sum;
    }

    private int CalcCost(List<Thing> things) {
        int sum = 0;
        for (Thing th : things) {
            sum += th.getCost();
        }
        return sum;
    }

    private void CheckSet(List<Thing> things) {
        if (bestThings == null) {
            if (CalcWeight(things) <= maxWeight) {
                bestThings = things;
                bestCost = CalcCost(things);
            }
        } else {
            if (CalcWeight(things) <= maxWeight && CalcCost(things) > bestCost) {
                bestThings = things;
                bestCost = CalcCost(things);
            }
        }
    }

    public void MakeAllSets(List<Thing> things) {
        if (things.size() > 0)
            CheckSet(things);

        for (int i=0; i<things.size(); i++) {
            List<Thing> newSet = new ArrayList<Thing>(things);
            newSet.remove(i);
            MakeAllSets(newSet);
        }
    }
}
