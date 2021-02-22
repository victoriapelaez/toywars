package com.toywars.data.punkytrolls;

import com.toywars.data.LifeBeing;
import com.toywars.data.Status;

/**
 * Student
 * Éste PunkyTroll tiene el rol de student e implementa las acciones correspondientes a su rol además de algunas de
 * las acciones generales del LifeBeing.
 * Cada una de las acciones realiza un cambio en el status. Este cambio depende del rol del PunkyTroll.
 */
public class BluePunkyTroll extends LifeBeing {
    public BluePunkyTroll(String toyName) {
        super(new Status(), toyName, 1457, 32, 98, 33, 76);
    }

    @Override
    public void doPlay() {
        super.doPlay();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 20);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 3);
    }

    @Override
    public void doEat() {
        super.doEat();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 30);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 6);
    }

    @Override
    public void doRest() {
        super.doRest();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 15);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 2);
    }

    @Override
    public void doWalk() {
        super.doWalk();
        this.doRest();
    }

    @Override
    public void doDie() {
        super.doDie();
        super.getStatus().setCurrentPoints(0);
        super.getStatus().setCurrentLevel(1);
    }

    @Override
    public void doPee() {
        super.doPee();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 3);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel());
    }

    @Override
    public void doFight() {
        super.doFight();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() - 25);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel());
    }

    @Override
    public void doSing() {
        super.doSing();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 50);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 10);
    }

    @Override
    public void doExplore() {
        super.doExplore();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 50);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 10);
    }

    @Override
    public void doSpit_fire() {
        super.doSpit_fire();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() - 5);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel());
    }

    @Override
    public void doStudy() {
        super.doStudy();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 200);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 30);
    }

    @Override
    public void doCode() {
        super.doCode();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 40);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 2);
    }

    @Override
    public void doBurn() {
        super.doBurn();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() - 50);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel());
    }
}
