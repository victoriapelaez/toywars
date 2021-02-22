package com.toywars.data;

import java.util.ArrayList;
import java.util.List;

/**
 * LifeBeing implementa la interfaz IAction de manera que las acciones (métodos) se deberán implementar en la clase
 * abstracta. De esta forma, cada juguete podrá heredar las acciones que le interesen,
 * implementadas en la clase abstracta. Si implementásemos la interfaz diréctamente a la clase del juguete
 * (por ejemplo RedPunkyTroll), éste debería implementar todos los métodos. Al heredarlos de la clase abstracta, solo
 * implementará los que sean necesarios.
 */
public abstract class LifeBeing implements IAction, IRender {

    /**
     * Atributo que registra el estado (puntos y nivel) del juguete durante la partida.
     */
    private Status status;

    /**
     * Lista de las acciones que se van realizando durante la partida.
     */
    private List<Action> actionsList;

    /**
     * Atributos que puede definir el usuario. Nombre que el usuario puede darle al juguete
     */
    private String toyName;

    /**
     * Atributos fijos para cada juguete. Representan las características del juguete.
     */
    private Integer healthPoints;
    private Integer strength;
    private Integer intelligence;
    private Integer agility;
    private Integer charm;

    public LifeBeing(Status status, String toyName, Integer healthPoints, Integer strength, Integer intelligence, Integer agility, Integer charm) {
        this.status = status;
        this.toyName = toyName;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.charm = charm;
        this.actionsList = new ArrayList<>();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public List<Action> getActionsList() {
        return actionsList;
    }

    public void setActionsList(List<Action> actionsList) {
        this.actionsList = actionsList;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getCharm() {
        return charm;
    }

    public void setCharm(Integer charm) {
        this.charm = charm;
    }

    @Override
    public void doRun() {

    }

    @Override
    public void doPlay() {

    }

    @Override
    public void doEat() {

    }

    @Override
    public void doSleep() {

    }

    @Override
    public void doRest() {

    }

    @Override
    public void doWalk() {

    }

    @Override
    public void doDie() {

    }

    @Override
    public void doPee() {

    }

    @Override
    public void doFight() {

    }

    @Override
    public void doSing() {

    }

    @Override
    public void doExplode() {

    }

    @Override
    public void doExplore() {

    }

    @Override
    public void doSpit_fire() {

    }

    @Override
    public void doPlay_guitar() {

    }

    @Override
    public void doStudy() {

    }

    @Override
    public void doCode() {

    }

    @Override
    public void doBurn() {

    }

    @Override
    public String doRender(RenderType renderType) {
        return "";
    }
}
