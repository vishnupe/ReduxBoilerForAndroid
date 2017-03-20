package com.lazyfolkz.pe.reduxboilerforandroid;

import com.lazyfolkz.pe.reduxboilerforandroid.redux.Action;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.CombineReducer;
import com.lazyfolkz.pe.reduxboilerforandroid.redux.Reducer;

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * Created by vishnupe on 20/3/17.
 */

public class GlobalStateCombineReducer implements CombineReducer<GlobalState> {
    @Override
    public Reducer<GlobalState> combineReduce(final HashMap<String, Reducer<Object>> reducers) {

        class CombinedReducer implements Reducer<GlobalState>{

            @Override
            public GlobalState reduce(GlobalState currentState, Action action) throws NoSuchFieldException, IllegalAccessException {
                GlobalState newState = new GlobalState(currentState);
                for (String key:reducers.keySet()
                        ) {
                    Field field = GlobalState.class.getField(key);
                    field.set(newState,reducers.get(key).reduce(field.get(newState),action));

                }
                return newState;
            }
        }

        return new CombinedReducer();

    }
}
