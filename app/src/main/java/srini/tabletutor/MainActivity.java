package srini.tabletutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10, R.id.button11, R.id.button12})
    public void goToTable(Button button) {
        int val = Integer.valueOf((button.getText().toString().split(" "))[0]);
        Intent intent = new Intent(this, FullTableView.class);
        intent.putExtra("TABLE", val);
        startActivity(intent);
    }

    @OnClick(R.id.btnExit)
    public void exitApp(Button button) {
        button.setText("Exiting");
        finish();
    }
}
