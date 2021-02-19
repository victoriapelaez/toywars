package com.toywars.data;

import java.util.List;

/**
 * LifeBeing implementa la interfaz IAction de manera que las acciones (métodos) se deberán implementar en la clase
 * abstracta. De esta forma, cada juguete podrá heredar las acciones que le interesen,
 * implementadas en la clase abstracta. Si implementásemos la interfaz diréctamente a la clase del juguete
 * (por ejemplo RedPunkyTroll), éste debería implementar todos los métodos. Al heredarlos de la clase abstracta, solo
 * implementará los que sean necesarios.
 */
public abstract class LifeBeing implements IAction, IRender {

    private Status status;

    // Atributos que puede definir el usuario. Nombre que el usuario puede darle al juguete
    private String toyName;

    // Atributos fijos del juguete
    private Integer healthPoints;
    private Integer strength;
    private Integer intelligence;
    private Integer agility;
    private Integer charm;

    public LifeBeing() {
    }

    public LifeBeing(Status status, String toyName, Integer healthPoints, Integer strength, Integer intelligence, Integer agility, Integer charm) {
        this.status = status;
        this.toyName = toyName;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.charm = charm;
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
    public List<Action> getCurrentAction() {
        return null;
    }

    /*Para utilizar estos métodos (acciones) no es necesario que cada uno de los "Trolls" herede esos métodos,
    * bastaría con instanciar la clase LifeBeing inicializando la clase del Troll que nos interesa.
    * E.g.: LifeBeing bluePunkyTroll = new BluePunkyTroll();*/
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
