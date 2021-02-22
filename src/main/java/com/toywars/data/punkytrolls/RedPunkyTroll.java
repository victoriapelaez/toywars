package com.toywars.data.punkytrolls;

import com.toywars.data.LifeBeing;
import com.toywars.data.Status;

import java.util.List;

/**
 * Runner
 */
public class RedPunkyTroll extends LifeBeing {

    /*
     * Cada uno de los trolls tendrá sus propios Status que definiremos en el constructor.
     * */
    public RedPunkyTroll() {
    }

    public RedPunkyTroll(Status status, String toyName) {
        super(status, toyName, 9999, 78, 34, 89, 14);
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
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 3);
    }

    @Override
    public void doEat() {
        super.doEat();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 30);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 4);
    }

    @Override
    public void doSleep() {
        super.doSleep();
        this.doEat(); // És correcte????
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
        this.doRest(); // ???????
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
    public void doExplode() {
        super.doExplode();
    }

    @Override
    public void doExplore() {
        super.doExplore();
    }

    @Override
    public void doSpit_fire() {
        super.doSpit_fire();
    }

    @Override
    public void doPlay_guitar() {
        super.doPlay_guitar();
    }

    @Override
    public void doStudy() {
        super.doStudy();
    }

    @Override
    public void doCode() {
        super.doCode();
    }

    @Override
    public void doBurn() {
        super.doBurn();
    }
}
