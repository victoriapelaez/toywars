package com.toywars.data;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.List;

/**
 * En este método añadimos todas las acciones, es decir, los métodos que representan esas acciones.
 * Al tratarse de una clase de tipo enum, declaramos los métodos vacíos.
 */
public interface IAction {

    public List<Action> getCurrentAction();

    /* TODO Y esto pa qué!?
    * Estos métodos están declarados como void ¿Es correcto o deben devolver algo?
    * */
    public void doRun();
    public void doPlay();
    public void doEat();
    public void doSleep();
    public void doRest();
    public void doWalk();
    public void doDie();
    public void doPee();
    public void doFight();
    public void doSing();
    public void doExplode();
    public void doExplore();
    public void doSpit_fire();
    public void doPlay_guitar();
    public void doStudy();
    public void doCode();
    public void doBurn();
}
