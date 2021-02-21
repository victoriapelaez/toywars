package com.toywars.data.punkytrolls;

import com.toywars.data.Action;
import com.toywars.data.LifeBeing;
import com.toywars.data.RenderType;
import com.toywars.data.Status;

import java.util.List;

/**
 * Guitar player
 */
public class GreenPunkyTroll extends LifeBeing {

    public GreenPunkyTroll() {
    }

    public GreenPunkyTroll(Status status, String toyName) {
        super(status, toyName, 6547, 25, 43, 62, 99);
    }

    @Override
    public List<Action> getCurrentAction() {
        return super.getCurrentAction();
    }

    @Override
    public Status getStatus() {
        return super.getStatus();
    }

    @Override
    public void setStatus(Status status) {
        super.setStatus(status);
    }

    @Override
    public String getToyName() {
        return super.getToyName();
    }

    @Override
    public void setToyName(String toyName) {
        super.setToyName(toyName);
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
    }

    @Override
    public void doPlay_guitar() {
        super.doPlay_guitar();
        super.getStatus().setCurrentPoints(super.getStatus().getCurrentPoints() + 200);
        super.getStatus().setCurrentLevel(super.getStatus().getCurrentLevel() + 30);
    }

    @Override
    public void doStudy() {
        super.doStudy();
    }

    // TODO ¿Aquí hay que implementar este método?
    @Override
    public String doRender(RenderType renderType) {
        return super.doRender(renderType);
    }
}
