import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerSingl {
    private int num = 1;
    private Date time;
    private SimpleDateFormat dt1;

    private LoggerSingl() {
        log("Run the program!");
    }

    public void log(String msg) {
        System.out.println(num + ". " +"[ "+getDate()+" ] " + msg);
        num++;
    }

    private String getDate() {
        time = new Date();
        dt1 = new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm:ss");
        return dt1.format(time);
    }

    public static LoggerSingl getInstance() {
        return LoggerHolder.instanse;
    }

    private static class LoggerHolder {
        static final LoggerSingl instanse = new LoggerSingl();
    }

}
