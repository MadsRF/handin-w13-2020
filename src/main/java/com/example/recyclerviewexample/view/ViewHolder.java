package com.example.recyclerviewexample.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample.R;


public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        LinearLayout ll = (LinearLayout)itemView;
        textView = ll.findViewById(R.id.textView);

    }

    public void setData(String d) {
        textView.setText(d);
    }
}
