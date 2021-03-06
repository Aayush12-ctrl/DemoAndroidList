package sg.edu.rp.c346.id20007386.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<AndroidVersion> alAndroidVersions;
    ArrayAdapter<AndroidVersion> aaAndroidVersions;
    //ArrayAdapter<AndroidVersion> aaAndroidVersions;

    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.lvAndroidVersions);
        alAndroidVersions = new ArrayList<>();

        alAndroidVersions.add(new AndroidVersion("Pie", "9.0"));
        alAndroidVersions.add(new AndroidVersion("Oreo", "8.0-8.1"));
        alAndroidVersions.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        alAndroidVersions.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        alAndroidVersions.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        alAndroidVersions.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        alAndroidVersions.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));

        aaAndroidVersions = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alAndroidVersions);

        lvAndroidVersions.setAdapter(aaAndroidVersions);
        //aaAndroidVersions = new ArrayAdapter<>(this,
        //android.R.layout.simple_list_item_1, alAndroidVersions);


        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersions);


        //lvAndroidVersions.setAdapter(aaAndroidVersions);


        lvAndroidVersions.setAdapter(adapter);
    }
}