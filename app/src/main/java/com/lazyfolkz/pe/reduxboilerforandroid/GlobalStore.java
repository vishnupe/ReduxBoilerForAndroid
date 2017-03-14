package com.lazyfolkz.pe.reduxboilerforandroid;

import com.lazyfolkz.pe.reduxboilerforandroid.redux.Store;

/**
 * Created by vishnupe on 14/3/17.
 */
public class GlobalStore {

    private static Store storeInstance = new Store(new GlobalState(),new RootReducer());

    public static Store getStore() {
        return storeInstance;
    }

}
