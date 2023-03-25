package ru.kate;

public class BlackHole extends SpaceObject implements IAttractable{
    @Override
    public void attract()
    {
        System.out.println("BlackHole attracts you!  ");
    }
}
