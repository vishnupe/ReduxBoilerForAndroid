package com.lazyfolkz.pe.reduxboilerforandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.lazyfolkz.pe.reduxboilerforandroid.model.Category;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.Action;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.Listner;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GlobalStore.getStore().subscribe(new Listner<GlobalState>() {
            @Override
            public void onEvent(GlobalState globalState) {
                Log.d("COUNT",""+globalState.count);
            }
        });
        try {
            GlobalStore.getStore().dispatch(new Action(ActionTypes.INC,new HashMap<String, String>()));
            GlobalStore.getStore().dispatch(new Action(ActionTypes.INC,new HashMap<String, String>()));
            GlobalStore.getStore().dispatch(new Action(ActionTypes.DEC,new HashMap<String, String>()));
            GlobalStore.getStore().dispatch(new Action(ActionTypes.INC,new HashMap<String, String>()));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }





    }
}
