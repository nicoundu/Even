package cl.pingon.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DateCallback {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.valueEt);

        textView = findViewById(R.id.responseTv);

        Button button = findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DateEvaluator(MainActivity.this).isEven();



            }
        });
    }


    @Override
    public void even() {
        textView.setText("El numero es par");

    }

    @Override
    public void unEven(String day) {
        textView.setText("El numero es inpar " + day);

    }
}
