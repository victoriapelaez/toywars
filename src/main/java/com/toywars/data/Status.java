package com.toywars.data;

/**
 * La clase Status representará el nivel y los puntos obtenidos durante la partida.
 * El nivel solo podrá aumentar, de forma que cada cambio de estado sumará de 0 a n niveles al actual.
 * Los puntos podrán sumarse o restarse en función de la acción realizada.
 */
public class Status {

    // TODO ¿Éstos dónde deberían ir?
    // private final Date actionTime;
    // private PunkyTroll toy;

    // Nivel del monstruito
    private Integer currentLevel;
    private Integer finalLevel;

    // Puntos del jugador
    private Integer currentPoints;
    private Integer finalScore;

    // Acciones
    private Action currentAction;

    // Contructor vacío. Inicializa puntos y nivel iniciales.
    public Status() {
    }

    // Contructor. Inicializa puntos y nivel iniciales.
    public Status(Integer currentLevel, Integer finalLevel, Integer finalScore, Integer currentPoints, Action currentAction) {
        this.currentLevel = currentLevel;
        this.finalLevel = finalLevel;
        this.finalScore = finalScore;
        this.currentPoints = currentPoints;
        this.currentAction = currentAction;
    }

    public Integer getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Integer getFinalLevel() {
        return finalLevel;
    }

    public void setFinalLevel(Integer finalLevel) {
        this.finalLevel = finalLevel;
    }

    public Integer getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Integer finalScore) {
        this.finalScore = finalScore;
    }

    public Integer getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(Integer currentPoints) {
        this.currentPoints = currentPoints;
    }

    public Action getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(Action currentAction) {
        this.currentAction = currentAction;
    }
}
