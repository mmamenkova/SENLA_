package task6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Thing("Аптечка", 1, 1500));
        things.add(new Thing("Котелок", 1, 500));
        things.add(new Thing("Книга", 1, 600));
        things.add(new Thing("Бинокль", 1, 5000));

        Backpack backpack = new Backpack(2);
        backpack.MakeAllSets(things);
        List<Thing> solve = backpack.getBestThings();
        if (solve == null) {
            System.out.println("Нет решения");
        } else {
            for (Thing s : solve) {
                System.out.println(s.getName() + ", " + s.getWeight() + ", " + s.getCost());
            }
        }
    }
}
