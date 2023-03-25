package ru.kate;

public class InheritancWay2 {
    public static void main(String[] args) {
        BlackHole bholl =  new BlackHole();
        Star st = new Star();
        UFO nlo = new UFO();
        bholl.attract();
        st.attract();
        st.shine();
        nlo.shine();
    }
}
