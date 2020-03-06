package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultText, messageText, scorerText;
    String result, messages, scorer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.result);
        messageText = findViewById(R.id.winner);
        scorerText = findViewById(R.id.result_name);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            result = bundle.getString("result");
            messages = bundle.getString("messages");
            scorer = bundle.getString("scorer");


            messageText.setText(messages);

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    scorerText.setText(scorer);
                }
            }, 2000);
            resultText.setText(result);

        }
    }
}
