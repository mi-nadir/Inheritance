import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(1,2,3,4);
        System.out.println(box1.getWeight());

        Triangle tr1 = new Triangle(8,6,4);
        System.out.println(tr1.square());

        Rect rc1 = new Rect(1,2);
        System.out.println(rc1.square());

        Programmer pr = new Programmer("Максим");
        Cook cook = new Cook("Михаил");
        Driver dr = new Driver("Виталий");
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(pr);
        workers.add(cook);
        workers.add(dr);
        for (Worker worker : workers) {
            System.out.println(worker.getName());
        }
        for (Worker worker : workers) {
            worker.voice();
        }
        pr.programme();
        cook.cook();
        dr.drive();

        Director director = new Director();
        Cnt cnt = new Cnt();
        director.force(cnt, 12);
        director.force(new Counter() {
            @Override
            public String report(int month) {
                return "Отчет за "+month+" месяцев";
            }
        }, 11);

        try {
            int[] nums = new int[1];
            nums[0] = 1;
            nums[2] = 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка ArrayIndexOutOfBoundsException: "+e);
        } catch (Exception e1) {
            System.out.println("Другая ошибка "+e1);
        }
        int random = (int)(Math.random()*90+10);
        System.out.println(String.format("Случайное число %s Попробуйте еще раз", random));
    }
}
