package com.example.tugasrecyclerview2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

import static android.widget.Toast.LENGTH_LONG;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        return UserData.nama.length;
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TextView tvNama, tvUmur, tvAsal;
        private final ImageView ivImage;
        private Button btnDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            btnDetail = itemView.findViewById(R.id.btn_userDetail);
            tvNama = itemView.findViewById(R.id.tv_userNama);
            tvUmur = itemView.findViewById(R.id.tv_userUmur);
            tvAsal = itemView.findViewById(R.id.tv_userAsal);
            ivImage = itemView.findViewById(R.id.iv_userImage);

            itemView.setOnClickListener(this);
        }

        public void onBind(int position) {
            //set tv dan iv
            tvNama.setText(UserData.nama[position]);
            tvUmur.setText("Umur : " + UserData.umur[position]);
            tvAsal.setText("Asal : " + UserData.asal[position]);
            ivImage.setImageResource(UserData.image[position]);


        }

        @Override
        public void onClick(View v) {

        }
    }
}