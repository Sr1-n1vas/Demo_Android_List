package sg.edu.rp.c346.id20004969.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<AndroidVersion> alAndroidversions;
    // ArrayAdapter<AndroidVersion> aaAndroidversions;
    CustomAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.listViewAndroidVersions);
        alAndroidversions = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        alAndroidversions.add(item1);

        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        alAndroidversions.add(item2);

        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        alAndroidversions.add(item3);

        // aaAndroidversions = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,alAndroidversions);
        //lv.setAdapter(aaAndroidversions);

        Adapter = new CustomAdapter(this, R.layout.row, alAndroidversions);

        //lvAndroidVersions.setAdapter(aaAndroidVersions);

        lvAndroidVersions.setAdapter(Adapter);

    }
}