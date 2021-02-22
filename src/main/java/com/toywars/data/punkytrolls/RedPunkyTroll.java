package com.toywars.data.punkytrolls;

import com.toywars.data.LifeBeing;
import com.toywars.data.Status;

/**
 * Runner
 */
public class RedPunkyTroll extends LifeBeing {
    public RedPunkyTroll(String toyName) {
        super(new Status(), toyName, 9999, 78, 34, 89, 14);
    }

    @Override
    public void doRun() {
        super.doRun();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 200);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 30);
    }

    @Override
    public void doPlay() {
        super.doPlay();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 20);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 4);
    }

    @Override
    public void doEat() {
        super.doEat();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 30);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 6);
    }

    @Override
    public void doSleep() {
        super.doSleep();
        this.doEat(); // TODO És correcte????
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
        this.doRest(); // TODO ???????
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
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 5);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 1);
    }

    @Override
    public void doExplore() {
        super.doExplore();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 25);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 5);
    }

    @Override
    public void doStudy() {
        super.doStudy();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 25);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 5);
    }

    @Override
    public void doBurn() {
        super.doBurn();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() - 100);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel());
    }
}
