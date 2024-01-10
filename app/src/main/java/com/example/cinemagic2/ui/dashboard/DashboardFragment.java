package com.example.cinemagic2.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemagic2.R;
import com.example.cinemagic2.databinding.FragmentDashboardBinding;

import java.util.List;
import java.util.Locale;


public class DashboardFragment extends Fragment {


    private FragmentDashboardBinding binding;
    private CartManager cartManager;
    

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RecyclerView recyclerView = root.findViewById(R.id.recyclerViewCart);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        cartManager = CartManager.getInstance();
        List<CartItem> cartItems = cartManager.getCartItems();

        CartAdapter cartAdapter = new CartAdapter(cartItems);
        recyclerView.setAdapter(cartAdapter);



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}