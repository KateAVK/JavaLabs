package ru.kate;

public class UFO extends SpaceObject implements IShinable{

    @Override
    public void shine() {
        System.out.println("UFO shines for you!  ");
    }
}
