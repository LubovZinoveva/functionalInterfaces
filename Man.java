/**
 * Класс Man, реализующий интерфейс I_Family. 
 * Содержит поля id, name, dateBirth. 
 * Есть конструктор, геттеры и сеттеры полей, переопределение метода toString.
 */
public class Man<T, V> implements I_Family {
    
    private T id;
    private V name;
    private V dateBirth;
    
    
    public Man(T id, V name, V dateBirth) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
    }

    public T getId() {
        return id;
    }

    public V getName() {
        return name;
    }

    public V getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        return String.format("Меня зовут %s %s. День рождения: %s", getName(), getsName(), getDateBirth());
    }
}
