public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Я - "+this.name);
    }

    public String getName() {
        return name;
    }
}
