public class Main {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(1,2,3,4);
        System.out.println(box1.getWeight());

        Triangle tr1 = new Triangle(8,6,4);
        System.out.println(tr1.square());

        Rect rc1 = new Rect(1,2);
        System.out.println(rc1.square());
    }
}
