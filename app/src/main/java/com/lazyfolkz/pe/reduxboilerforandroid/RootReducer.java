package com.lazyfolkz.pe.reduxboilerforandroid;

import com.lazyfolkz.pe.reduxboilerforandroid.redux.Action;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.Reducer;

/**
 * Created by vishnupe on 13/3/17.
 */

public class RootReducer implements Reducer<GlobalState> {
    @Override
    public GlobalState reduce(GlobalState currentState, Action action) {
        GlobalState newState = new GlobalState(currentState);
        switch (action.type){
            case ActionTypes.INC : newState.count++;
                return newState;
            case ActionTypes.DEC : newState.count--;
                return newState;
            default: return newState;
        }
    }
}
