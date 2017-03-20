package com.lazyfolkz.pe.reduxboilerforandroid.redux;

import java.util.HashMap;

/**
 * Created by qburst on 20/3/17.
 */

public interface CombineReducer<State> {
    Reducer<State> combineReduce(final HashMap<String,Reducer<Object>> reducers);
}
