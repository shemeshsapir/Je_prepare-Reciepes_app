package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Internet;

import java.util.ArrayList;

public class InternetAdapter extends RecyclerView.Adapter<InternetAdapter.InternetViewHolder>
{
    private ArrayList<Internet> internetArrayList;

    public InternetAdapter(ArrayList<Internet> internetArrayList)
    {
        this.internetArrayList = internetArrayList;
    }

    @NonNull
    @Override
    public InternetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_internet, parent, false);
        return new InternetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InternetViewHolder holder, int position)
    {
        holder.linkName.setText(internetArrayList.get(position).getName());
        holder.linkDescription.setText(internetArrayList.get(position).getDescription());
    }

    @Override
    public int getItemCount()
    {
        return internetArrayList.size();
    }

    public class InternetViewHolder extends RecyclerView.ViewHolder
    {
        private TextView linkName, linkDescription;

        public InternetViewHolder(@NonNull View itemView)
        {
            super(itemView);
            linkName = itemView.findViewById(R.id.linkNameRow);
            linkDescription = itemView.findViewById(R.id.linkDescriptionRow);
        }
    }
}