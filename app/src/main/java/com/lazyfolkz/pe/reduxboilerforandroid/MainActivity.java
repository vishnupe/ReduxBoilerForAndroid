package com.lazyfolkz.pe.reduxboilerforandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lazyfolkz.pe.reduxboilerforandroid.redux.Action;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.Listner;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GlobalStore.getStore().getState();
        GlobalStore.getStore().subscribe(new Listner<GlobalState>() {
            @Override
            public void onEvent(GlobalState globalState) {
                Log.d("COUNT",""+globalState.count);
            }
        });
        GlobalStore.getStore().dispatch(new Action(ActionTypes.INC,new HashMap<String, String>()));
        GlobalStore.getStore().dispatch(new Action(ActionTypes.INC,new HashMap<String, String>()));
        GlobalStore.getStore().dispatch(new Action(ActionTypes.DEC,new HashMap<String, String>()));
        GlobalStore.getStore().dispatch(new Action(ActionTypes.INC,new HashMap<String, String>()));
    }
}
