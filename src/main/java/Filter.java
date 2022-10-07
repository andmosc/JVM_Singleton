import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private final int numFilter;

    public Filter(int numFilter) {
        this.numFilter = numFilter;
    }

    public List<Integer> filterOut(List<Integer> source) {
        LoggerSingl logger = LoggerSingl.getInstance();

        return source.stream().filter(f -> {
            if(f > numFilter) logger.log("element \"" + f + "\" fit");
            else logger.log("element \"" + f + "\" does not fit");
            return f > numFilter;
        }).collect(Collectors.toList());

    }
}
