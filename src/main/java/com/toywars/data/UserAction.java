package com.toywars.data;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO ¿Recoger los datos y almacenarlos?
 * Recoger los datos que se generen en las demás clases, como por ejemplo el status inicial, el status actual,
 * los puntos iniciales y actuales, el nivel, la acciones realizadas, etc y alamcenarlos
 * en distintas listas.
 *
 * o
 *
 * TODO ¿La clase UserAction qué funcionalidades debe implementar?
 * Recoger i registrar las acciones realizadas (o seleccionadas) por el usuario únicamente.
 *
 * en caso de ser así...
 *
 * TODO ¿Qué puñetas hacemos aquí?
 * ¿Aquí se deberían añadir las acciones del enum Action? Es decir, hay implementar
 * la clase Action?
 *
 * TODO ¿Para qué sirve esta clase? ¿No podríamos añadir sus funcionalidades a la clase GameService?
 */
public class UserAction {

    /* Aquí se deberán ir almacenando los niveles y puntuaciones obtenidos por los distintos usuarios
    * para que se puedan consultar o se muestren por pantalla a cada nueva partida.
    * Que al finalizar la partida, se muestre un listado de las puntuaciones obtenidas. */
    public static List<Status> finalStatus;
    public static List<Action> userDoneActionsList = new ArrayList<>();

    public UserAction() {
    }

    public static List<Status> getFinalStatus() {
        return finalStatus;
    }

    public static void setFinalStatus(List<Status> finalStatus) {
        UserAction.finalStatus = finalStatus;
    }
}