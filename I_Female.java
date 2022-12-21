/**
 * Интерфейс I_Female наследуется от интерфейса I_Family. Это представители женского пола с методом 
 * getHug() - объятия.
 */
public interface I_Female extends I_Family{
   
    default String getHug(){
        return "обнимашки!";
    }

}
