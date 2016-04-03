package srini.tabletutor;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class FullTableView extends ListActivity {

    private String[] getTableStringArray(int number) {
        String[] array = new String[13];
        for (int i = 0; i < 13; i++) {
            array[i] = (" " + number + " x " + i + " = " + (i * number));
        }
        return array;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_table_view);
        int tab = getIntent().getIntExtra("TABLE", 0);
        String[] array = getTableStringArray(tab);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);
        setListAdapter(adapter);

    }
}
