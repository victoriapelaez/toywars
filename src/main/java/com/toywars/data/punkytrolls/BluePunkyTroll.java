package com.toywars.data.punkytrolls;

import com.toywars.data.Action;
import com.toywars.data.LifeBeing;
import com.toywars.data.RenderType;
import com.toywars.data.Status;

import java.util.List;

/**
 * Student
 */
public class BluePunkyTroll extends LifeBeing {

    public BluePunkyTroll() {
    }

    public BluePunkyTroll(Status status, String toyName) {
        super(status, toyName, 1457, 32, 98, 33, 76);
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

    // TODO ¿Aquí hay que implementar este método?
    @Override
    public String doRender(RenderType renderType) {
        return super.doRender(renderType);
    }
}
