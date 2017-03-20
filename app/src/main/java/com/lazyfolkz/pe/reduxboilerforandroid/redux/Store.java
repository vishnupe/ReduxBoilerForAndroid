package com.lazyfolkz.pe.reduxboilerforandroid.redux;

import android.util.Log;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by vishnupe on 13/3/17.
 */

public class Store <State> {

    protected State currentState;
    protected Reducer<State> reducer;
    protected HashMap <UUID, Listner> subscribers = new HashMap <> ();

    public Store(State initialState, Reducer reducer){
        this.currentState = initialState;
        this.reducer = reducer;
    }

    public State getState(){
        return currentState;
    };

    public UUID subscribe(Listner<State> listner){
        UUID listnerId = UUID.randomUUID();
        subscribers.put(listnerId,listner);
        return listnerId;
    };

    public void unsubscribe(UUID listnerId){
        subscribers.remove(listnerId);
    }

    public void dispatch(Action action) throws NoSuchFieldException, IllegalAccessException {
        Log.d("DISPATCHED",action.type);
        currentState = reducer.reduce(currentState,action);
        for(UUID key : subscribers.keySet()){
            subscribers.get(key).onEvent(currentState);
        }
    };


}
