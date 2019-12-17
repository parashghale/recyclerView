package com.example.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class contactAdapter extends RecyclerView.Adapter<contactAdapter.contactViewHolder> {
    List<contact> contactlist;


    @NonNull
    @Override
    public contactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull contactViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class contactViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProfile;
        TextView name, phone;

        public contactViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile =itemView.findViewById(R.id.imgProfile);
            name =itemView.findViewById(R.id.contact);
            phone=itemView.findViewById(R.id.phone);




        }
    }

}
