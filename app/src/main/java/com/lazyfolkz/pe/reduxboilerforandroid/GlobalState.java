package com.lazyfolkz.pe.reduxboilerforandroid;

/**
 * Created by vishnupe on 13/3/17.
 */

public class GlobalState {
    public int count;

    public GlobalState(){
        this.count=1;
    }

    public GlobalState(GlobalState another){
        this.count = another.count;
    }

}
