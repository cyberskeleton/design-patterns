import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        sb.append('x');
        System.out.println(sb);

        Character[] array = {'a', 'b', 'c'};
        sb.appendCharacters(List.of(array));
        System.out.println(sb);

        Character[] array1 = {'d', 'e', 'f'};
        sb.insertCharacters(List.of(array1), 2);
        System.out.println(sb);

        Character[] array2 = {'g', 'h', 'j'};
        sb.insertCharacters(List.of(array2), 100);
        System.out.println(sb);
    }
}
