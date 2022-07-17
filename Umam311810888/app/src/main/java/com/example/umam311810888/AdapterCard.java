package com.example.umam311810888;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class AdapterCard {
    public class CardViewHolder extends RecyclerView.ViewHolder{ ImageView ivKuliner;
        TextView tvNamaKuliner, tvTentangKuliner;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            ivKuliner = itemView.findViewById(R.id.iv_card_foto);
            tvNamaKuliner = itemView.findViewById(R.id.tv_card_nama);
            tvTentangKuliner = itemView.findViewById(R.id.tv_card_tentang);
        }
    }
}