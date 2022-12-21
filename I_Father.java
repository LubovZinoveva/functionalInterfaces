/**
 * Интерфейс I_Father наследуется от интерфейса I_Female. 
 * Содержит поле nose + его геттер и метод, дарующий силу
 */
public interface I_Father extends I_Male{
    
    String nose = "с горбинкой";

    public void getPower();

    default public String getNose() {
        return nose;
    }

}
