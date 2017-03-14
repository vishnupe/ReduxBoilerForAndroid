package com.lazyfolkz.pe.reduxboilerforandroid.redux;

/**
 * Created by qburst on 13/3/17.
 */

public interface Reducer <State> {
     State reduce(State currentState, Action action);
}
