package com.toywars.data.punkytrolls;

import com.toywars.data.Action;
import com.toywars.data.LifeBeing;
import com.toywars.data.RenderType;
import com.toywars.data.Status;

import java.util.List;

/**
 * Runner
 */
public class RedPunkyTroll extends LifeBeing {

    /*Cada uno de los trolls tendrá sus propios Status que definiremos en el constructor.
     * ¿Debemos traer los getter y los setters de la clse LifeBeing?*/

    private Status status;

    public RedPunkyTroll(Status status) {
        this.status = status;
    }

    public RedPunkyTroll(Status status, String toyName, Integer healthPoints, Integer strength, Integer intelligence, Integer agility, Integer charm, Status status1) {
        super(status, toyName, healthPoints, strength, intelligence, agility, charm);
        this.status = status1;
    }

    @Override
    public List<Action> getCurrentAction() {
        if (status.getCurrentAction().equals(Action.EAT)) {
            return null;
        }
        return null;
    }
}
