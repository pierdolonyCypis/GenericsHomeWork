import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        try {
            myList.add(Integer.valueOf("125"));
        } catch (NumberFormatException e) {
            System.err.println("Ви ввели НЕ число!");
        }
        for (Integer list : myList) {
            System.out.println(list);
        }
    }
}
