package mad155.kmathes.mad155module7endangeredspecies2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {

    // test to see if this works with class defined outside of MainActivity

    Context context;
    ImageView pic;
    Integer animals[];


    //.. this would not auto generate... I had to type manually
    //public ImageAdapter(MainActivity mainActivity) {
    // then it got changed to...
    public ImageAdapter(Context c, ImageView pic, Integer[] animals) {

        this.context = c;
        this.pic = pic;
        this.animals = animals;

    }

    @Override
    public int getCount() {
        //return 0;
        return animals.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        pic = new ImageView(context);
        pic.setImageResource(animals[position]);
        pic.setScaleType(ImageView.ScaleType.FIT_XY);
        pic.setLayoutParams(new GridView.LayoutParams(330,300));
        return pic;
        //return null;
    }


}




