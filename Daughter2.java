import java.util.Random;
import java.util.function.BinaryOperator;

/**
 * Класс Daughter2, наследуемый от класса Man и реализующий интерфейсы I_Mother и I_Father. 
 * Создается конструктор и переопределяется метод Hello(), getPower(), getHug();
 * В этом классе дочь наследует черты мамы и папы.
 * В 22 строке метод getPower() использует интерфейс BinaryOperator.
 */
public class Daughter2 extends Man implements I_Mother, I_Father {
    
    public Daughter2(Integer id, String name, String dateBirth) {
        super(id, name, dateBirth);
    }

    @Override
    public String getHug() {
        return "крепкие объятия";
    }

    @Override
    public void getPower() {
        Random rand = new Random();
        BinaryOperator<Integer> getPow = (a, b) -> a * b;
        System.out.println("Дочь получила силу: " + getPow.apply(rand.nextInt(21), 10));
    }

    @Override
    public void Hello() {
        System.out.println("Привет, я дочка. Чуть-чуть похожа на маму, чуть-чуть на папу :)");
    }
    
}
