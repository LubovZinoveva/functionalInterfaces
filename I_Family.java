/**
 * Интерфейс I_Family задает фамилию древа и определяет базовое приветствие.
 */
public interface I_Family {
    
    String sName = "Кузнецов(а)";

    default public String getsName() {
        return sName;
    }

    default void Hello(){
        System.out.println("Привет, я " + getsName());
    }
    
}


