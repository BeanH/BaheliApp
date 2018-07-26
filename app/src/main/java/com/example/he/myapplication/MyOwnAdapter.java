package com.example.he.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder>{

    int image[];
    String[] names;
    Context ctx;

    public MyOwnAdapter(Context ct,String[] names,int image[]){
        ctx=ct;
        this.names= names;
        this.image = image;
    }

    @Override
    public MyOwnAdapter.MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View myView = myInflater.inflate(R.layout.my_row,parent,false);
        return new MyOwnHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder holder, int position) {
        holder.image.setImageResource(image[position]);
        holder.text.setText(names[position]);

    }


    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView text;

        public MyOwnHolder(View itemView) {
            super(itemView);
            image= (ImageView)itemView.findViewById(R.id.image);
            text = (TextView)itemView.findViewById(R.id.name);
        }
    }
}
