package ru.kate;

public class Star extends SpaceObject implements IShinable, IAttractable
{

    @Override
    public void attract()
    {
        System.out.println("Star attracts you!  ");
    }

    @Override
    public void shine()
    {
        System.out.println("Star shine for you!  ");
    }
}
