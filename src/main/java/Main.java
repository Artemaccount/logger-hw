import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        int level = 0;
        int filterLevel = 0;
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        System.out.print("Введите размер списка:");
        String inputSize = scanner.nextLine();
        logger.log("Получили размер списка");
        System.out.print("Введите верхнюю границу для значений:");
        String inputLevel = scanner.nextLine();
        logger.log("Получили верхнюю границу для значений");
        try{
             size = Integer.parseInt(inputSize);
             level = Integer.parseInt(inputLevel);
            logger.log("Строка успешно конвертирована в числа");
        } catch (Exception e) {
            logger.log("Строка не конвертирована в числа");
            System.out.println("Неверно указаны числа");
        }
        List<Integer> source = new ArrayList();
        for (int i = 0; i < size; i++) {
            int number = new Random().nextInt(level);
            source.add(number);
        }
        System.out.print("Введите порог для фильтра: ");
        String inputFilter = scanner.nextLine();
        logger.log("Получили порог для фильтра");
        try{
            filterLevel = Integer.parseInt(inputFilter);
            logger.log("Строка успешно конвертирована в число");
        } catch (Exception e){
            System.out.println("Неверно указано число");
        }
        Filter filter = new Filter(filterLevel);

        System.out.println(filter.filterOut(source));

    }
}
