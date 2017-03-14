package com.lazyfolkz.pe.reduxboilerforandroid.redux;

/**
 * Created by vishnupe on 13/3/17.
 */

public interface Listner<State> {
    void onEvent(State state);
}
