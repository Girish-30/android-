package com.example.girish.exerzone;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListview extends ArrayAdapter<String>{

private String[] exercise;
private String[] desc;
private Integer[] imgid;
private Techniques context;

     public CustomListview(Techniques context, String[] exercise,String[] desc ,Integer[] imgid ) {
        super(context, R.layout.layout,exercise);

        this.context=context;
        this.exercise=exercise;
        this.desc=desc;
        this.imgid=imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder=null;
        if(r==null)
        {

            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.layout,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag (viewHolder);
        }
        else {
            viewHolder =(ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);

        viewHolder.tvw1.setText(exercise[position]);
        viewHolder.tvw2.setText(desc[position]);
        return r;
    }

    private void getView() {
    }
    class ViewHolder
    {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;
        ViewHolder(View v)
        {
            tvw1=(TextView) v.findViewById(R.id.tvexercise);
            tvw2=(TextView) v.findViewById(R.id.tvdesc);
            ivw=(ImageView) v.findViewById(R.id.imghead);
        }
    }
}
