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

    public RedPunkyTroll(Status status, String toyName) {
        super(status, toyName, 9999, 78, 34, 89, 14);
    }


}
