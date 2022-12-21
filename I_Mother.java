/**
 * Интерфейс I_Mother наследуется от интерфейса I_Female. 
 * Содержит поля - цвет глаз(colorEyes) и характер(momСharacter) + геттеры для чтения этих параметров. 
 */
public interface I_Mother extends I_Female {
   
    String momСharacter = "сенситивный";
    String colorEyes = "карие";
    
    default String getColorEyes() {
        return colorEyes;
    }

    default public String getMomСharacter() {
        return momСharacter;
    }
}
