public class BoxWeight extends Box {
    private int weight;

    public BoxWeight(int length, int width, int height, int weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
