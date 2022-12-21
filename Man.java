/**
 * Класс Man, реализующий интерфейс I_Family. 
 * Содержит поля id, name, dateBirth. 
 * Есть конструктор, геттеры и сеттеры полей, переопределение метода toString.
 */
public class Man implements I_Family {
    
    private Integer id;
    private String name;
    private String dateBirth;
    
    public Man(Integer id, String name, String dateBirth) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateBirth() {
        return dateBirth;
    }
    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return String.format("Меня зовут %s %s. День рождения: %s", getName(), getsName(), getDateBirth());
    }
}
