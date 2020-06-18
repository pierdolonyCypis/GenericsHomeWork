import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        try {
            newList.add(Integer.valueOf("125")); // це можливо за умови що не буде містити будь-яких інших симолів крім чисел
        } catch (NumberFormatException e) {
            System.err.println("Ви ввели НЕ число!");
        }
        for (Integer list : newList) {
            System.out.println(list);
        }
    }
}
