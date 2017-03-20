package com.lazyfolkz.pe.reduxboilerforandroid;

import com.lazyfolkz.pe.reduxboilerforandroid.redux.Action;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.Reducer;

/**
 * Created by vishnupe on 13/3/17.
 */

public class RootReducer implements Reducer<Object> {
    @Override
    public Object reduce(Object currentState, Action action) throws NoSuchFieldException, IllegalAccessException {
        Integer newState = new Integer((Integer) currentState);
        switch (action.type){
            case ActionTypes.INC : newState++;
                return newState;
            case ActionTypes.DEC : newState--;
                return newState;
            default: return newState;
        }
    }
}
