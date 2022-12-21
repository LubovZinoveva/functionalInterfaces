import java.util.function.Consumer;

/**
 * В методе mainTree клиентский код. 
 * Здесь добавили использование интерфейса Consumer в строках 17, 26, 38. 
 */
public class mainTree {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Семья Кузнецовых в ожидании первенца. Кто же родился?");
        System.out.println("--------------------");
        Son first = new Son(1, "Петя", "30.08.2031", "русый");
        first.Hello();
        System.out.println(first);
        first.getPower();
        Consumer<String> fromFather = x -> System.out.println("От папы мне достался нос " + x);
        fromFather.accept(first.getNose());
        
        System.out.println();
        System.out.println("Кто второй?");
        System.out.println("--------------------");
        Daughter1 second = new Daughter1(2, "Алена", "18.02.2035");
        second.Hello();
        System.out.println(second);
        Consumer<String> hugs = x -> System.out.println("Люблю " + x);
        hugs.accept(second.getHug());
        System.out.printf("От мамы мне достался %s характер и %s глаза", second.getMomСharacter(), second.getColorEyes());
        
        System.out.println();
        System.out.println();
        System.out.println("Чтобы скучно не было, пойдем за третьим!");
        System.out.println("--------------------");
        Daughter2 third = new Daughter2(3, "Маша", "02.04.2037");
        third.Hello();
        System.out.println(third);
        third.getPower();
        Consumer<String> hugs2 = x -> System.out.println("У меня " + x);
        hugs2.accept(third.getHug());
        
        System.out.printf("От мамы мне достался %s характер и %s глаза. А от папы нос %s", third.getMomСharacter(), third.getColorEyes(), third.getNose());
        
    }
}
