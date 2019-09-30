package task6;

public class Thing {
    private String name;
    private int weight;
    private int cost;

    public Thing(String name, int weight, int cost) {
        this.name = name;
        setWeight(weight);
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight =weight;
        }
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
