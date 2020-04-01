package com.example.recyclerviewexample.adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample.R;
import com.example.recyclerviewexample.storage.NoteStorage;
import com.example.recyclerviewexample.view.ViewHolder;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private NoteStorage noteStorage;

    public Adapter(NoteStorage noteStorage) {
        this.noteStorage = noteStorage;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // parent is "this" of mainActivity
        LinearLayout ll = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.mylayout, parent, false);
        return new ViewHolder(ll); // pass the linearLayout as a constructor arg. to viewHolder
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(noteStorage.list.get(position)); // dummy data for the rows
    }

    @Override
    public int getItemCount() {
        return noteStorage.list.size(); // dummy number of item rows
    }




}
