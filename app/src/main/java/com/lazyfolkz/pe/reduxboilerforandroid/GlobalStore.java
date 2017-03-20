package com.lazyfolkz.pe.reduxboilerforandroid;

import com.lazyfolkz.pe.reduxboilerforandroid.redux.Reducer;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.Store;

import java.util.HashMap;

/**
 * Created by vishnupe on 14/3/17.
 */
public class GlobalStore {

    private static Store storeInstance = null;

    public static Store getStore() {
        if(storeInstance == null){
            HashMap<String,Reducer<Object>> reducers = new HashMap<>();
            reducers.put("count",new RootReducer());

            storeInstance = new Store(new GlobalState(1),new GlobalStateCombineReducer().combineReduce(reducers));
        }
        return storeInstance;
    }

}
