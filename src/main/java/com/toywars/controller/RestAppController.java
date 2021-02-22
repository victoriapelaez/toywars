package com.toywars.controller;

import com.toywars.data.*;
import com.toywars.data.punkytrolls.BluePunkyTroll;
import com.toywars.data.punkytrolls.BrownPunkyTroll;
import com.toywars.data.punkytrolls.GreenPunkyTroll;
import com.toywars.data.punkytrolls.RedPunkyTroll;
import com.toywars.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class RestAppController {

    /**
     * A method that shows the actions permitted to the user. There ara some other actions, but the method just shows
     * three of them, chosen randomly.
     *
     * Also it calls the doAction method from the GameService class, which, depending on the Troll type and the
     * action done by the user, it add some levels and add or subtract some points from the Status attributes
     * currentPoints and currentLevel.
     *
     * @return Returns a list of actions of length 3.
     */
    /*No hauria de demanar el color, un cop triat el troll al inici de la partida (mètode newGame) el triatge de les
     * respostes a les accions hauria de ser automàtic, però això no se com implementar-ho*/
    @RequestMapping(value = "/rest/do/Action") //Devuelve mensaje JSON
    public List<Action> doAction(@RequestParam String color,
                                 @RequestParam Action action) {
        GameService gameService = new GameService();
        gameService.doAction(color, action);
        return gameService.getActionsList();
    }

    @RequestMapping(value = "/rest/getCurrentStatus") //Devulve mensaje Status en JSON
    public List<Status> getCurrentStatus() {
        return LifeBeing ;
    }

    /**
     * This method calls the getStatus method from GameService to set the current score at the final game as the final
     * score and returns a list of the final scores (points and levels) reached by the user during all the games played.
     *
     * @return Returns a list of status.
     */
    @RequestMapping(value = "/rest/getStats") //Devuelve mensaje Stats
    public List<Status> getStats() {
        GameService gameService = new GameService();
        gameService.getStatus();
        return UserAction.getFinalStatus();
    }

    @RequestMapping(value = "/rest/render/RenderType") //Devuelve String como body
    public List<RenderType> render() {
        return null;
    }

    /**
     * Method that calls GameService's resetLifeBeing method to restart the game.
     * Restart the game means set points to 0 and level to 1.
     *
     * This method also put all the Trolls into an array to get them to the user.
     * Then the user has to chose a Troll and put it a name.
     *
     * @return Returns the list of Trolls.
     */
    @RequestMapping(value = "/rest/new")//Devolver LifeBeing
    public LifeBeing newGame(@RequestParam String colour,
                             @RequestParam String toyName) {

        /*Si en cridat al new Troll ja feim un new Status, si posam que el constructor de Status inicialitzi
        * els punts i el nivell a o i 1 respectivament, ¿podem eliminar el mètode resetLifeBeing de gameService?
        * Seria interesant potser mostrar a l'usuari una llista amb els quatre Trolls i els seus
        * stats (vida, força, ...) i que ell en trii un dels quatre i s'inicii la partida. D'aquesta manera seria
        * útil el mètode resetLifeBeing.*/
        GameService gameService = new GameService();
        gameService.resetLifeBeing();

        LifeBeing redPunkyTroll = new RedPunkyTroll(new Status(), toyName);
        if (colour.equalsIgnoreCase("red")) {
            return redPunkyTroll;
        } else if (colour.equalsIgnoreCase("blue")) {
            return new BluePunkyTroll(new Status(), toyName);
        } else if (colour.equalsIgnoreCase("brown")) {
            return new BrownPunkyTroll(new Status(), toyName);
        } else if (colour.equalsIgnoreCase("green")) {
            return new GreenPunkyTroll(new Status(), toyName);
        }
        return null;

        gameService.setCurrentLifeBeing(redPunkyTroll);
    }

    /**
     *
     * @return
     */
    /*El mètode ha d'enregistrar les diferents accions realitzades per l'usuari*/
    @RequestMapping(value = "/rest/getActions")//Devolver listado IActions
    public List<Action> getActions() {
        UserAction.userActionsDoneList.add(caca);
        return null;
    }

    /**
     * Check it works perfectly
     *
     * @param uuid
     * @return
     */

    // TODO ¿Qué hay que poner en lugar de uuid?
    @RequestMapping(value = "/get/{uuid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RegisterItem>> getRegisterById(@PathVariable UUID uuid) {
        try {
            return new ResponseEntity<>(analysisService.getDataRegisterById(uuid), HttpStatus.OK);
        } catch (Exception e) {
            log.error("register:get/", e);
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}