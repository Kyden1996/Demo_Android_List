package sg.edu.rp.c346.id21030068.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    //ArrayList<String> alAndroidVersions;
    //ArrayAdapter<String> aaAndroidVersions;
    ArrayList<AndroidVersion> alAndroidVersions;
    //ArrayAdapter<AndroidVersion> aaAndroidVersions;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.listViewAndroidVersions);
        //alAndroidVersions = new ArrayList<String>();


        //alAndroidVersions.add("Pie - 9.0");
        //alAndroidVersions.add("Oreo - 8.0 - 8.1");
        //alAndroidVersions.add("Nougat - 7.0 - 7.1.2");
        //alAndroidVersions.add("Marshmallow - 6.0 - 6.0.1");
        //alAndroidVersions.add("Lollipop - 5.0 - 5.1.1");
        //alAndroidVersions.add("Kitkat - 4.4 - 4.4.4");
        //alAndroidVersions.add("Jelly Bean - 4.1 - 4.3.1");



        //alAndroidVersions = new ArrayList<>();
        //alAndroidVersions.add(new AndroidVersion("Pie", "9.0"));
        //alAndroidVersions.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        //alAndroidVersions.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));



        alAndroidVersions = new ArrayList<>();
        AndroidVersion item1 = (new AndroidVersion("Pie", "9.0"));
        AndroidVersion item2 = (new AndroidVersion("Oreo", "8.0 - 8.1"));
        AndroidVersion item3 = (new AndroidVersion("Nougat", "7.0 - 7.1.2"));

        alAndroidVersions.add(item1);
        alAndroidVersions.add(item2);
        alAndroidVersions.add(item3);

        //aaAndroidVersions = new ArrayAdapter<>(this,
                //android.R.layout.simple_list_item_1, alAndroidVersions);
        //lvAndroidVersions.setAdapter(aaAndroidVersions);

        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersions);
        lvAndroidVersions.setAdapter(adapter);

    }
}