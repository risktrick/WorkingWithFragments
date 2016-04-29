package com.lol.workingwithfragments;

import java.util.UUID;

/**
 * Created by user on 29.04.16.
 */
public class Model {

    String name;
    UUID uuid;

    public Model(){
        name = "name";
        uuid = UUID.randomUUID();
    }
}
