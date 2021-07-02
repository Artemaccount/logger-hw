import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if(source.get(i) > treshold) {
                result.add(i);
                logger.log("Элемент " + i + " прошёл фильтрацию");
            } else {
                logger.log("Элемент " + i + " не прошёл фильтрацию");
            }
        }
        logger.log("Фильтрацию прошло " + result.size() + " элементов");
        return result;
    }
}