package mad155.kmathes.mad155module7endangeredspecies2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer[] animals =  {
            R.drawable.eagle,
            R.drawable.elephant,
            R.drawable.gorilla,
            R.drawable.panther,
            R.drawable.panda,
            R.drawable.polar};

    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GridView grid = (GridView) findViewById(R.id.gridView1);
        GridView grid = (GridView) findViewById(R.id.grid1);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);

        grid.setAdapter(new ImageAdapter(this, pic, animals));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),"Selected Species: " + (position + 1),
                        Toast.LENGTH_SHORT).show();

                pic.setImageResource(animals[position]);


            }
        });

    }




}
