/**
 * Demonstrates the Sphere class: surface area, volume and collisions.
 */

public class Main {
    public static void main(String[] args) {
        // create a sphere called sun
        Sphere sun = new Sphere(0.0, 0.0, 0.0, 10.545);
        // create a sphere called earth
        Sphere earth = new Sphere(21.0, 21.0, 21.0, 24.2);
        // create a sphere called moon
        Sphere moon = new Sphere(-2.0, -3.1, -15.0, .001);
        // create a sphere called mySphere1
        Sphere mySphere1 = new Sphere(2.0,3.0,5.0,6.0);
        // create a sphere called mySphere2
        Sphere mySphere2 = new Sphere(10.0,8.0,10.0,2.0);
        // create a empty sphere
        Sphere mySphereEmpty = new Sphere();



        
        // output the surface area of the sphere objects
        System.out.println("The surface area of the sun is " + sun.calculateSurfaceArea());
        System.out.println("The surface area of the earth is " + earth.calculateSurfaceArea());
        System.out.println("The surface area of the moon is " + moon.calculateSurfaceArea());

        System.out.println("");

        //Volume demo
        System.out.println("The Volume of the sun is " + sun.calculateVolume());
        System.out.println("The Volume of the earth is " + earth.calculateVolume());
        System.out.println("The Volume of the moon is " + moon.calculateVolume());
        
        System.out.println("");

        //toString demo
        System.out.println("mySphere1 is at:\n" +mySphere1);
        System.out.println("mySphere2 is at:\n" +mySphere2);
        System.out.println("mySphereEmpty is at:\n" +mySphereEmpty);


        System.out.println("");

        //colides with false demo
        if(mySphere1.collidesWith(mySphere2) == true)
        {
            System.out.println("mySphere1 and mySphere2 collide");
        }
        else
        {
            System.out.println("mySphere1 and mySphere2 DONT collide");

        }

        //radius mutator demo
        mySphere1.setRadius(100);

        //colides with true demo
        if(mySphere1.collidesWith(mySphere2) == true)
        {
            System.out.println("mySphere1 and mySphere2 collide");
        }
        else
        {
            System.out.println("mySphere1 and mySphere2 DONT collide");

        }

    }
}
