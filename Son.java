import java.util.Random;
import java.util.function.UnaryOperator;

/**
 * Класс Son, наследуемый от класса Man и реализующий интерфейс I_Father. 
 * Добавляется поле colorHair + его геттер + конструктор.
 * Переопределяются методы Hello(), toString(), getPower().
 * В 19 строке метод getPower() использует интерфейс UnaryOperator. 
 */
public class Son extends Man implements I_Father {

    private String colorHair;

    public Son(Integer id, String name, String dateBirth, String colorHair) {
        super(id, name, dateBirth);
        this.colorHair = colorHair;
    }

    @Override
    public void getPower() {
        Random rand = new Random();
        Integer pow =  rand.nextInt(51);
        UnaryOperator<Integer> resultPower = (x) -> x * 10;
        System.out.println("Сын получил силу: " + resultPower.apply(pow));
    }    

    @Override
    public void Hello() {
        System.out.println("Привет, я сын, похож на папу");
    }

    public String getColorHair() {
        return colorHair;
    }

    @Override
    public String toString() {
        return String.format("Меня зовут %s %s. Я родился %s, цвет волос %s", getName(), getsName(), getDateBirth(), getColorHair());
    }

}
