package cc.somkiat.dtaccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        result = (TextView) findViewById(R.id.result);
    }

    public void add(View view) {
        Calculator calculator = new Calculator();
        int i1 = Integer.parseInt(input1.getText().toString());
        int i2 = Integer.parseInt(input2.getText().toString());
        int r = calculator.บวก(i1, i2);
        result.setText(String.valueOf(r));
    }

    public void minus(View view) {
        Calculator calculator = new Calculator();
        int i1 = Integer.parseInt(input1.getText().toString());
        int i2 = Integer.parseInt(input2.getText().toString());
        int r = calculator.ลบ(i1, i2);
        result.setText(String.valueOf(r));
    }
}
