package com.example.cinemagic2.ui.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemagic2.R;

import java.util.List;
import java.util.Locale;

// CartAdapter.java
public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private List<CartItem> cartItems;

    public CartAdapter(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        CartItem cartItem = cartItems.get(position);
        holder.itemMovieTextView.setText(cartItem.getMoviename());
        holder.itemAddressTextView.setText(cartItem.getAddress());
        holder.itemDateTextView.setText(cartItem.getDate());
        holder.itemSeatsTextView.setText(cartItem.getSeats());

    }

    @Override
    public int getItemCount() {
        return cartItems.size();
    }

    static class CartViewHolder extends RecyclerView.ViewHolder {
        TextView itemMovieTextView;
        TextView itemAddressTextView;
        TextView itemDateTextView;
        TextView itemSeatsTextView;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            itemMovieTextView = itemView.findViewById(R.id.textViewMovieName);
            itemDateTextView=itemView.findViewById(R.id.textViewDate);
            itemAddressTextView=itemView.findViewById(R.id.textViewAddress);
            itemSeatsTextView=itemView.findViewById(R.id.textViewSeats);
        }
    }
}
