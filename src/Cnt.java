public class Cnt implements Counter {
    @Override
    public String report(int month) {
        return "Отчет за "+month+" месяцев";
    }
}
