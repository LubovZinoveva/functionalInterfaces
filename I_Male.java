/**
 * Интерфейс I_Male наследуется от интерфейса I_Family. Это представители фамилии мужского пола с методом 
 * handshake() - рукопожатие.
 */
public interface I_Male extends I_Family {

    default void handshake(String name1, String name2){
        System.out.printf("%s и %s пожали друг другу руку", name1, name2);
    }

}