package com.toywars.controller;

import com.toywars.data.*;
import com.toywars.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class RestAppController {

    private static GameService gameService = null;

    private GameService getGameService() {
        return gameService == null ? new GameService() : gameService;
    }

    @PostMapping(value = "/rest/new")
    public LifeBeing newGame(@RequestBody Map<String, ?> input) {
        GameService gameService = getGameService();

        String trollColor = input.get("trollType").toString();
        String trollName = input.get("trollName").toString();

        try {
            return gameService.createTroll(trollColor, trollName);
        } catch (Exception exp) {
            return null;
        }
    }

    @GetMapping(value = "/rest/getActions")
    public List<Action> getActions() {
        List<Action> actionsPermitted = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            actionsPermitted.add(Action.values()[new Random().nextInt(Action.values().length - 1)]);
        }

        return actionsPermitted;
    }

    @PostMapping(value = "/rest/getStatus")
    public LifeBeing getStatus(@RequestBody Map<String, ?> input) {
        GameService gameService = getGameService();

        String trollName = input.get("trollName").toString();
        return GameService.getLifeBeing(trollName);
    }

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
    @GetMapping(value = "/rest/do/{action}") //Devuelve mensaje JSON
    public List<Action> doAction(@RequestParam String color, @RequestParam Action action) {
        GameService gameService = new GameService();
        gameService.doAction(color, action);
        return gameService.getActionsList();
    }

    @RequestMapping(value = "/rest/getCurrentStatus") //Devulve mensaje Status en JSON
    public List<Status> getCurrentStatus() {
        return Collections.emptyList();
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
     * Check it works perfectly
     *
     * @param uuid
     * @return
     */

//    @RequestMapping(value = "/get/{uuid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<RegisterItem>> getRegisterById(@PathVariable UUID uuid) {
//        try {
//            return new ResponseEntity<>(analysisService.getDataRegisterById(uuid), HttpStatus.OK);
//        } catch (Exception e) {
//            log.error("register:get/", e);
//            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}