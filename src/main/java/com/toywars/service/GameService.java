package com.toywars.service;

import com.toywars.data.Action;
import com.toywars.data.LifeBeing;
import com.toywars.data.Status;
import com.toywars.data.UserAction;
import com.toywars.data.punkytrolls.BluePunkyTroll;
import com.toywars.data.punkytrolls.RedPunkyTroll;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {

    private Integer maxPoints; // Puntución máxima total del juego.
    private LifeBeing currentLifeBeing; // TODO ¿Estoooo qué? ¿Es correcto?

    // Trolls
    private LifeBeing redPunkyTroll; // ¿Debe o puede ser static? ¿Debe declararse como variable global o local?
    private LifeBeing bluePunkyTroll;
    private LifeBeing brownPunkyTroll;
    private LifeBeing greenPunkyTroll;

    /**
     * Utilizaremos status para ir modificando los puntos y niveles en función de la acción realizada por el usuario.
     * Nos sirve para el método doAction, en el cual se recogerá la acción del usuario y se cambiará el status
     * (nivel y puntos) en función de esa acción y el tipo de Troll.
     * ¿Es interesante declararla como global o la declaramos dentro de doAction?
     */
    private Status status = new Status();

    /*En función del personaje(Troll) y en función de la acción ejecutada por el usuario se realizará un
     * cambio en el Status.
     * Por ejemplo; el Troll rojo es el corredor, por lo tanto si la acción seleccionada por el
     * ususario es la de correr se le sumarán x puntos, en cambio si es la de caminar se le restarán
     * Hay un conjunto de acciones genéricas para todos los Trolls y unas acciones específicas de cada Troll,
     * ¿como reflejamos eso? ¿implementando los métodos de las acciones en la clase del Troll?
     * Si esto es muy complicado, se dejan todas las acciones como genéricas y per avall.
     * */
    public void doAction(Action action) {
        // Hacer un if para cada uno de los punkytrolls, ya que la puntuación no es la misma en cada caso.
        if (userPunky == this.redPunkyTroll) {
            switch (action) {
                case RUN:
                    this.status.setCurrentPoints(status.getCurrentPoints() + 50); // ¿Así sumamos 50 puntos a los actuales?
                    this.status.setCurrentLevel(status.getCurrentLevel() + 6);
                    break;
                case PEE:
                    this.status.setCurrentPoints(status.getCurrentPoints() + 3);
                    this.status.setCurrentLevel(status.getCurrentLevel() + 1);
                    break;
                case SLEEP:
                    this.status.setCurrentPoints(status.getCurrentPoints() + 25);
                    this.status.setCurrentLevel(status.getCurrentLevel() + 3);
                    break;
                case BURN:
                    this.status.setCurrentPoints(status.getCurrentPoints() + -100);
                    this.status.setCurrentLevel(status.getCurrentLevel());
                    break;
                default:
                    this.status.setCurrentPoints(status.getCurrentLevel());
                    break;
            }
        }
    }

    /*
     * Reinicio lifeBeing, nueva accion.
     * Aquí tenemos que reiniciar el juego, es decir poner a 0 el marcador de puntos y el de nivel del troll
     *
     * Si debemos reiniciar el juego completo, ¿tenemos que reiniciar cada uno de los trolls?
     *
     * Los valores de este método deberíamos añadirlos a algunba lista
     * */
    public void resetLifeBeing() {
        redPunkyTroll = new RedPunkyTroll(this.status, "Miquel", 9999, 78, 34, 89, 14); // Runner
        bluePunkyTroll = new BluePunkyTroll(this.status, "Marta", 1457, 32, 98, 33, 76); // Student
        brownPunkyTroll = new BluePunkyTroll(this.status, "Bernat", 4587, 48, 56, 3, 23); // Cook
        greenPunkyTroll = new BluePunkyTroll(this.status, "Carme", 6547, 25, 43, 62, 99); // Guitar player
        this.status.getInitialLevel();
        this.status.getInitialPoints();
    }

    /*Devuelve renderizado del LifeBeing*/
    public void render() {

    }

    /*Devuelve el status del LifeBeing*/
    public void getStatus() {
        this.status.getFinalLevel();
        this.status.getFinalScore();
        UserAction.finalStatus.add(status); // Recogemos el nivel y los puntos finales para mostrarlos al usuario.
    }

    /*Mostrará solo las acciones que cada tipo de punkytroll puede hacer, ya que algunas son exclusivas de cada uno.
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

    /*Listado de los cambios*/
    public void getUserActions() {

    }
}