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

    private Integer maxPoints; // Puntución máxima total del juego.

    private static final List<LifeBeing> lifeBeingList = new ArrayList<>();

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

    /*En función del personaje(Troll) y en función de la acción ejecutada por el usuario se realizará un
     * cambio en el Status.
     * Por ejemplo; el Troll rojo es el corredor, por lo tanto si la acción seleccionada por el
     * ususario es la de correr se le sumarán x puntos, en cambio si es la de caminar se le restarán
     * Hay un conjunto de acciones genéricas para todos los Trolls y unas acciones específicas de cada Troll,
     * ¿como reflejamos eso? ¿implementando los métodos de las acciones en la clase del Troll?
     * Si esto es muy complicado, se dejan todas las acciones como genéricas y per avall.
     * */
    public void doAction(String color, Action action) {
        // Hacer un if para cada uno de los punkytrolls, ya que la puntuación no es la misma en cada caso.
//        if (color.equalsIgnoreCase("red")) {
//            switch (action) {
//                case RUN:
//                    this.currentLifeBeing.doRun();
//                    break;
//                case PLAY:
//                    this.currentLifeBeing.doPlay();
//                    break;
//                case EAT:
//                    this.currentLifeBeing.doEat();
//                    break;
//                case SLEEP:
//                    this.currentLifeBeing.doSleep();
//                    break;
//                case REST:
//                    this.currentLifeBeing.doRest();
//                    break;
//                case WALK:
//                    this.currentLifeBeing.doWalk();
//                    break;
//                case DIE:
//                    this.currentLifeBeing.doDie();
//                    break;
//                case PEE:
//                    this.currentLifeBeing.doPee();
//                    break;
//                case FIGHT:
//                    this.currentLifeBeing.doFight();
//                    break;
//                case SING:
//                    this.currentLifeBeing.doSing();
//                    break;
//                case EXPLODE:
//                    this.currentLifeBeing.doExplode();
//                    break;
//                case EXPLORE:
//                    this.currentLifeBeing.doExplore();
//                    break;
//                case PLAY_GUITAR:
//                    this.currentLifeBeing.doPlay_guitar();
//                    break;
//                case SPIT_FIRE:
//                    this.currentLifeBeing.doSpit_fire();
//                    break;
//                case STUDY:
//                    this.currentLifeBeing.doStudy();
//                    break;
//                case CODE:
//                    this.currentLifeBeing.doCode();
//                    break;
//                case BURN:
//                    this.currentLifeBeing.doBurn();
//                    break;
//                default:
//                    this.status.setCurrentPoints(this.status.getCurrentPoints());
//                    break;
//            }
//        }
    }

    /*
     * Reinicio lifeBeing, nueva accion.
     * Aquí tenemos que reiniciar el juego, es decir poner a 0 el marcador de puntos y el de nivel del troll
     *
     * Si debemos reiniciar el juego completo, ¿tenemos que reiniciar cada uno de los trolls?
     *
     * Los valores de este método deberíamos añadirlos a alguna lista
     * */
    public void resetLifeBeing() {
        // status.setCurrentLevel(1);
        // status.setCurrentPoints(0);
    }

    // Devuelve renderizado del LifeBeing
    public void render() {

    }

    // Devuelve el status del LifeBeing
    public void getStatus() {
//        this.status.setFinalLevel(status.getCurrentLevel());
//        this.status.setFinalScore(status.getCurrentPoints());
//        UserAction.finalStatus.add(this.status); // Recogemos el nivel y los puntos finales para mostrarlos al usuario.
    }

    /* Mostrará solo las acciones que cada tipo de punkytroll puede hacer, ya que algunas son exclusivas de cada uno.
     * Otra opción sería que se muestren por pantalla solo tres opciones de todas las acciones del enum y que en cada
     * jugada, es decir después de cada acción del uysuario, se muestren otras tres opciones.
     * */
    /**
     * Método que coge tres valores aleatorios de las acciones del enum Action y los añade a un array de acciones.
     * @return devuelde un array de acciones de longitud 3.
     */
    public Action[] getActions() {
        Action[] actionsPermited = new Action[3];
        for (int i = 0; i < actionsPermited.length; i++) {
            actionsPermited[i] = Action.values()[new Random().nextInt(Action.values().length)];
        }
        return actionsPermited;
    }
    /* A nes nene li agraden les llistes. Com que la longitud de l'array és només de 3, no hi hauria massa diferència
     * en usar un sistema o s'altre, cert?
     */
    public List<Action> getActionsList() {
        List<Action> actionsPermited = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            actionsPermited.add(Action.values()[new Random().nextInt(Action.values().length)]);
        }
        return actionsPermited;
    }

    // Listado de los cambios
    public void getUserActions() {
        // Devolver acción realizada y puntuación obtenida tras esa acción.
    }

    public static List<LifeBeing> getLifeBeingList() {
        return lifeBeingList;
    }

    public static LifeBeing getLifeBeing(String trollName) {
        return getLifeBeingList()
                .stream()
                .filter(lifeBeing -> lifeBeing.getToyName().equals(trollName))
                .findFirst()
                .get();
    }

    public void setCurrentLifeBeing(LifeBeing currentLifeBeing) {
        // this.currentLifeBeing = currentLifeBeing;
    }
}