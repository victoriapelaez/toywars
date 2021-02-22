package com.toywars.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase no implementada.
 *
 * @deprecated
 */
public class UserAction {

    public static List<Status> finalStatus;
    public static List<Action> userActionsDoneList = new ArrayList<>();

    public UserAction() {
    }

    public static List<Status> getFinalStatus() {
        return finalStatus;
    }

    public static void setFinalStatus(List<Status> finalStatus) {
        UserAction.finalStatus = finalStatus;
    }
}