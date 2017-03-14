package com.lazyfolkz.pe.reduxboilerforandroid.redux;

import java.util.HashMap;

/**
 * Created by vishnupe on 13/3/17.
 */

public class Action {
    public String type;
    public HashMap<String, String> payload = new HashMap<>();

    public Action(String type, HashMap<String, String> payload) {
        this.payload = payload;
        this.type = type;
    }
}
