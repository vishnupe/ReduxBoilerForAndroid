package com.lazyfolkz.pe.reduxboilerforandroid;

import com.lazyfolkz.pe.reduxboilerforandroid.redux.Action;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.Reducer;

/**
 * Created by vishnupe on 13/3/17.
 */

public class RootReducer implements Reducer<GlobalState> {
    @Override
    public GlobalState reduce(GlobalState currentState, Action action) {
        // use immutable object here
        switch (action.type){
            case ActionTypes.INC : currentState.count++;
                return currentState;
            case ActionTypes.DEC : currentState.count--;
                return currentState;
            default: return currentState;
        }
    }
}
