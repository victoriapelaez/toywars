package com.toywars.data.punkytrolls;

import com.toywars.data.LifeBeing;
import com.toywars.data.Status;

import java.util.List;

/**
 * Runner
 */
public class RedPunkyTroll extends LifeBeing {

    /*
     * Cada uno de los trolls tendrá sus propios Status que definiremos en el constructor.
     * */
    public RedPunkyTroll() {
    }

    public RedPunkyTroll(Status status, String toyName, Integer healthPoints, Integer strength, Integer intelligence, Integer agility, Integer charm) {
        super(status, toyName, healthPoints, strength, intelligence, agility, charm);
    }
}
