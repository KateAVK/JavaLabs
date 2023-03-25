package ru.kate;

public class Inheritance
{
    public static void main(String[] args)
    {


      SpaceObject[] list = new SpaceObject[3];
      SpaceObject bholl =  new BlackHole();
      SpaceObject st = new Star();
      SpaceObject nlo = new UFO();
      list[0] = bholl;
      list[1] = st;
      list[2] = nlo;
      for (SpaceObject object: list)
      {
          if (object instanceof IAttractable)
          {
              ((IAttractable)object).attract();
          }
          if (object instanceof IShinable)
          {
              ((IShinable)object).shine();
          }
      }

    }
}
