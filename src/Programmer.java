public class Programmer extends Worker implements CanProgram {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void programme() {
        System.out.println("Я - программирую");
    }
}
