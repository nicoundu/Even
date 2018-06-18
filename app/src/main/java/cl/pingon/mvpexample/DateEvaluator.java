package cl.pingon.mvpexample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEvaluator {

    private DateCallback callback;

    public DateEvaluator(DateCallback callback) {
        this.callback = callback;
    }

    public void isEven(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
        String today = simpleDateFormat.format(new Date());
        int day = Integer.parseInt(today);

        if (day%2 == 0) {
            callback.even();

        }else {
            callback.unEven(today);

        }

    }

}
