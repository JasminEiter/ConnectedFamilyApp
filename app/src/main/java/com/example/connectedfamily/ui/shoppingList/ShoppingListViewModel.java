package com.example.connectedfamily.ui.shoppingList;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.lifecycle.ViewModel;

import com.example.connectedfamily.R;

public class ShoppingListViewModel extends ViewModel {
    private String items[] = {"Bread","Cheese", "Milk", "Cake"};;

    public String[] getShoppingList(){

        //für jetzt
        this.getSampleItems();
        return items;
    }

    private void getSampleItems() {
        //Normal Datenbank bzw. eigentlich ins Model selbst

    }

}

