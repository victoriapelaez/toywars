package com.toywars.controller;

import com.toywars.data.*;
import com.toywars.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class RestAppController {

    private static GameService gameService = null;

    /**
     * Instanciamos la clase GameService.
     *
     * @return Devuelve un objeto de tipo GameService.
     */
    private GameService getGameService() {
        return gameService == null ? new GameService() : gameService;
    }

    /**
     * Método para resetear el juego.
     *
     * @param input Un string que representará el color (o tipo) del PunkyTroll introducido por el esuario.
     * @return Devuelve un objeto LifeBeing correspondiente al PunkyTroll que ha seleccionado el usuario.
     */
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

    /**
     * Método para mostrar las acciones permitidas por el usuario en un determinado momento. Se seleccionan tres
     * acciones posibles de todas las que hay en el enum Action.
     *
     * @return Devuelve una lista de acciones Action.
     */
    @GetMapping(value = "/rest/getActions")
    public List<Action> getActions() {
        List<Action> actionsPermitted = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            actionsPermitted.add(Action.values()[new Random().nextInt(Action.values().length - 1)]);
        }
        return actionsPermitted;
    }

    /**
     * Método que permitirá mostrar el status del troll con un determinado nombre. Dado un string que se corresponde
     * con el nombre del PunkyTroll introducido por el usuario, nos devolverá su correspondiente objeto LifeBeing.
     *
     * @param input Un string con el nombre añadido por el usuario.
     * @return Devuelve un objeto de tipo LifeBeing correspondiente al PunkyTroll con el nombre introducido.
     */
    @PostMapping(value = "/rest/getStatus")
    public LifeBeing getStatus(@RequestBody Map<String, ?> input) {
        GameService gameService = getGameService();

        String trollName = input.get("trollName").toString();
        return GameService.getLifeBeing(trollName);
    }

    @GetMapping(value = "/rest/do/{action}") //Devuelve mensaje JSON
    public List<Action> doAction() {
        return null;
    }

    /**
     * Método que debe devolver una lista de objetos Status para representar el avance del usuario en el juego y
     * su puntuación obtenida.
     *
     * @return Devuelve una lista de objetos Status.
     */
    @RequestMapping(value = "/rest/getCurrentStatus") //Devulve mensaje Status en JSON
    public List<Status> getCurrentStatus() {
        return Collections.emptyList();
    }

    @RequestMapping(value = "/rest/getStats") //Devuelve mensaje Stats
    public List<Status> getStats() {
        return null;
    }

    /**
     * Método de debe mostrar el tipo de rendecizado que posteriormente elegirá el usuario.
     *
     * @return null.
     */
    @RequestMapping(value = "/rest/render/RenderType") //Devuelve String como body
    public List<RenderType> render() {
        return null;
    }



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