package kr.hs.emirim.ko502804.project11_1;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.img1, R.drawable.img2, R.drawable.img3,R.drawable.img4, R.drawable.img5,
                        R.drawable.img6,R.drawable.img7, R.drawable.img8, R.drawable.img9,R.drawable.img10,
                        R.drawable.img1, R.drawable.img2, R.drawable.img3,R.drawable.img4, R.drawable.img5,
                        R.drawable.img6,R.drawable.img7, R.drawable.img8, R.drawable.img9,R.drawable.img10};

    public GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(posterIds[i]);

        final int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context, R.layout.dialog1, null);
                ImageView imgLarge = dialogView.findViewById(R.id.imgv_large);
                imgLarge.setImageResource(posterIds[pos]);
                dialog.setTitle("Large Poster");
                dialog.setIcon(R.drawable.p1);
                dialog.setView(dialogView);
                dialog.setNegativeButton("close", null);
                dialog.show();
            }
        });

        return imgv;
    }
}
