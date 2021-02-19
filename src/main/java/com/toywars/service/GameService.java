package com.toywars.service;

import com.toywars.data.Action;
import com.toywars.data.LifeBeing;
import com.toywars.data.Status;
import com.toywars.data.UserAction;
import com.toywars.data.punkytrolls.RedPunkyTroll;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private UserAction userAction; // Lista de acciones
    private Integer maxPoints; // Puntución máxima total del juego.
    private LifeBeing currentLifeBeing; // TODO ¿Estoooo qué? ¿Es correcto?


    /*En función del personaje(Troll) y en función de la acción ejecutada por el usuario se realizará un
     * cambio en el Status.
     * Por ejemplo; el Troll rojo es el corredor, por lo tanto si la acción seleccionada por el
     * ususario es la de correr se le sumarán x puntos, en cambio si es la de caminar se le restarán*/
    public void doAction(Action action) {
        Status status = new Status();
        // Hacer un if para cada uno de los punkytrolls, ya que la puntuación no es la misma en cada caso.
        switch (action) {
            case RUN:
                status.setCurrentPoints(50);
                break;
            case PEE:
                status.setCurrentPoints(3);
                break;
            case SLEEP:
                status.setCurrentPoints(25);
                break;
            case BURN:
                status.setCurrentPoints(-100);
                break;
            default:
                status.setCurrentPoints(0);
                break;
        }
    }

    /*Reinicio lifeBeing, nueva accion.*/
    public void resetLifeBeing() {

    }

    /*Devuelve renderizado del LifeBeing*/
    public void render() {

    }

    /*Devuelve el status del LifeBeing*/
    public void getStatus() {

    }

    /*Mostrará solo las acciones que cada tipo de punkytroll puede hacer, ya que algunas son exclusivas de cada uno*/
    public void getActions() {

    }

    /*Listado de los cambios*/
    public void getUserActions() {

    }
}