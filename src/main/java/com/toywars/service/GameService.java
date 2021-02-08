package com.toywars.service;

import com.toywars.data.LifeBeing;
import com.toywars.data.UserAction;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private UserAction userAction;
    private Integer maxPoints; // Puntución máxima total del juego.
    private LifeBeing currentLifeBeing; // TODO ¿Estoooo qué? ¿Es correcto?

}