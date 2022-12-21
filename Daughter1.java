/**
 * Класс Daughter1, наследуемый от класса Man и реализующий интерфейс I_Mother. 
 * Создается конструктор и переопределяется метод Hello();
 * В этом классе дочь наследует черты мамы.
 */

public class Daughter1 extends Man implements I_Mother {
    
    public Daughter1(Integer id, String name, String dateBirth) {
        super(id, name, dateBirth);
    }
    
    @Override
    public void Hello() {
        System.out.println("Привет, я дочка, похожа на маму");
    }
}
