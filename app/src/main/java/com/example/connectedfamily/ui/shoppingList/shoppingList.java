package com.example.connectedfamily.ui.shoppingList;

import androidx.core.view.MotionEventCompat;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.connectedfamily.R;

public class shoppingList extends Fragment {

    private ShoppingListViewModel mViewModel;
    private View view;

    public static shoppingList newInstance() {
        return new shoppingList();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.shopping_list_fragment, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ShoppingListViewModel.class);
        // TODO: Use the ViewModel

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this.getActivity(),
                android.R.layout.simple_list_item_1,
                mViewModel.getShoppingList());

        ListView list = (ListView) view.findViewById(R.id.shoppingList);
        list.setAdapter(adapter);

    }

}