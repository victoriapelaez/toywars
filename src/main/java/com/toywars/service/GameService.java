package com.toywars.service;

import com.toywars.data.*;
import com.toywars.data.punkytrolls.BluePunkyTroll;
import com.toywars.data.punkytrolls.PinkPunkyTroll;
import com.toywars.data.punkytrolls.GreenPunkyTroll;
import com.toywars.data.punkytrolls.RedPunkyTroll;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class GameService {

    /**
     * Lista que contendrá los diferentes objetos LifeBeing.
     */
    private static final List<LifeBeing> lifeBeingList = new ArrayList<>();

    /**
     * Método que, en función del PunkyTroll seleccionado por el usuario y de la acción elegida, ejecutará dicha
     * acción. Posteriormente esta acción se almacena en una lista de acciones realizadas.
     *
     *  @param trollName Parámetro de tipo string con el nombre del PunkyTroll.
     * @param action Parámetro de tipo acción.
     * @return Devuelve un objeto de tipo LifeBeing.
     * @throws Exception Muestra un mensaje de error especificando que la acción solicitada no existe.
     */
    public static LifeBeing doAction(String trollName, Action action) throws Exception {
        LifeBeing troll = getLifeBeing(trollName);
        switch (action) {
            case RUN:
                troll.doRun();
                break;
            case PLAY:
                troll.doPlay();
                break;
            case EAT:
                troll.doEat();
                break;
            case SLEEP:
                troll.doSleep();
                break;
            case REST:
                troll.doRest();
                break;
            case WALK:
                troll.doWalk();
                break;
            case DIE:
                troll.doDie();
                break;
            case PEE:
                troll.doPee();
                break;
            case FIGHT:
                troll.doFight();
                break;
            case SING:
                troll.doSing();
                break;
            case EXPLODE:
                troll.doExplode();
                break;
            case EXPLORE:
                troll.doExplore();
                break;
            case PLAY_GUITAR:
                troll.doPlay_guitar();
                break;
            case SPIT_FIRE:
                troll.doSpit_fire();
                break;
            case STUDY:
                troll.doStudy();
                break;
            case CODE:
                troll.doCode();
                break;
            case BURN:
                troll.doBurn();
                break;
            default:
                throw new Exception("Action doesn't exist");
        }
        troll.getActionsList().add(action);
        return getLifeBeing(trollName);
    }

    /**
     * Método que generará un nuevo objeto de tipo LifeBeing correspondiente a un PunkyTroll en función de la
     * elección del usuario. Además, el objeto de tipo LifeBeing se añade a la lista lifeBeingList.
     *
     * @param color Parámetro de tipo string que introducirá el usuario para poder seleccionar el tipo de PunkyTroll
     *              que desea.
     * @param name  Un string con el nombre introducido por el usuario y que se asignará al PunkyTroll elegido.
     * @return Devuelve un objeto LifeBeing correspondiente al PunkyTroll elegido por el usuario.
     * @throws Exception En caso de no coincidir el parámetro color con ninguno de los casos, se lanza un aviso de
     *                   que le color introducido no es valido.
     */
    public LifeBeing createTroll(String color, String name) throws Exception {
        LifeBeing troll;
        switch (Color.valueOf(color)) {
            case RED:
                troll = new RedPunkyTroll(name);
                break;
            case BLUE:
                troll = new BluePunkyTroll(name);
                break;
            case GREEN:
                troll = new GreenPunkyTroll(name);
                break;
            case PINK:
                troll = new PinkPunkyTroll(name);
                break;
            default:
                throw new Exception("Color not found: " + color);
        }
        lifeBeingList.add(troll);
        return troll;
    }

    /**
     * Una lista que contiene todos los LifeBeing que se vayan generando.
     *
     * @return Devuelve una lista de LifeBeing.
     */
    public static List<LifeBeing> getLifeBeingList() {
        return lifeBeingList;
    }

    /**
     * Dado un string que representa el nombre dado a un PunkyTroll, obtenemos el objeto LifeBeing correspondiente
     * al PunkyTroll con ese nombre.
     *
     * @param trollName Un string que contenga el nombre de un PunkyTroll dado por el usuario.
     * @return Devuelve, en caso de que exista, el objeto LifeBeing del PunkyTroll con el nombre "trollName".
     */
    public static LifeBeing getLifeBeing(String trollName) {
        return getLifeBeingList()
                .stream()
                .filter(lifeBeing -> lifeBeing.getToyName().equals(trollName))
                .findFirst()
                .get();
    }

    /**
     * Devuelve renderizado del LifeBeing
     */
    public void render() {

    }
}