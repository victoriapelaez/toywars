package com.toywars.data;

import java.util.ArrayList;
import java.util.Date;
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
 * TODO ¿Para qué sirve esta clase? ¿No prodríamos añadir sus funcionalidades a la clase GameService?
 */
public class UserAction {

    /*No me acuerdo de qué iba a poner aquí*/
    public static List<Status> initialStatus;
    public static List<Status> currentStatus;
    public static List<Status> finalStatus;

    public List<Status> getStatus() {
        return null;
    }
}