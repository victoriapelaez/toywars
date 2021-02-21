package com.toywars.data.punkytrolls;

import com.toywars.data.Action;
import com.toywars.data.LifeBeing;
import com.toywars.data.RenderType;
import com.toywars.data.Status;

import java.util.List;

/**
 * Cook
 */
public class BrownPunkyTroll extends LifeBeing {

    public BrownPunkyTroll() {
    }

    public BrownPunkyTroll(Status status, String toyName) {
        super(status, toyName, 4587, 48, 56, 3, 23);
    }

    @Override
    public void doPlay() {
        super.doPlay();
    }

    @Override
    public void doEat() {
        super.doEat();
    }

    @Override
    public void doSleep() {
        super.doSleep();
    }

    @Override
    public void doRest() {
        super.doRest();
    }

    @Override
    public void doWalk() {
        super.doWalk();
    }

    @Override
    public void doDie() {
        super.doDie();
    }

    @Override
    public void doPee() {
        super.doPee();
    }

    @Override
    public void doFight() {
        super.doFight();
    }

    @Override
    public void doSing() {
        super.doSing();
    }

    @Override
    public void doExplode() {
        super.doExplode();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() - 100);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel());
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
    public void doBurn() {
        super.doBurn();
    }

    // TODO ¿Aquí hay que implementar este método?
    @Override
    public String doRender(RenderType renderType) {
        return super.doRender(renderType);
    }
}
