
/**
* Sphere class to define sphere objects
* CS 212 - Lab <4>
* Cooper & Colten
* Version 1, 2-10-26
*/

public class Sphere
{
    //private variables
    private double xCoordinate =0;
    private double yCoordinate = 0;
    private double zCoordinate = 0;
    private double radius = 0;

    /**
    * constructor for sphere with no
    *
    * @param none
    * @return none (constructs a sphere)
    */     public Sphere()
    {
        xCoordinate = 0;
        yCoordinate = 0;
        zCoordinate = 0;
        radius=0;
    }

    /**
    * constructor for sphere with all parameters
    *
    * @param  x (x coordinate)
    * @param  y (y coordinate)
    * @param  z (z coordinate)
    * @param  r (radius coordinate)
    * @return none (constructs a sphere)
    */ 
    public Sphere(double x, double y, double z, double r)
    {
        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
        radius = r;
    }

/**
* acessor for the radius
*
* @param  none
* @return      double (The radius)
*/ 
   public double getRadius()
    {
        return radius;
    }
    /**
    * acessor for the x coordinate
    *
    * @param  none
    * @return      double (the x coordinate)
    */ 
    public double getXCoordinate()
    {
        return xCoordinate;
    }
    /**
    * acessor for the y coordinate
    *
    * @param  none
    * @return      double (the y coordinate)
    */ 
    public double getYCoordinate()
    {
        return yCoordinate;
    }
    /**
    * acessor for the z coordinate
    *
    * @param  none
    * @return      double (the z coordinate)
    */ 
    public double getZCoordinate()
    {
        return zCoordinate;
    }

/**
* mutator method to change the radius of the sphere
*
* @param  r <input of radius to re-adjust the radius to
* @return      none: instead changes the spheres radius
*/
    public void setRadius(double r)
    {
        radius = r;
    }

/**
* toString method to change how outputing the string is formatted
*
* @param  none
* @return      string formated as(//Position: (x,y,z)
*                                //Radius: radius units)
*/
    @Override
    public String toString()
    {
        //Position: (x,y,z)
        //Radius: radius units
        return "Position: (" + xCoordinate + ", " + yCoordinate + ", " + zCoordinate + ") \nRadius: " + radius + " units";
    }

/**
* return the surface area of the sphere.
*
* @param  none
* @return      <double containing the surface are (4*Pi*radius^2)>
*/    
    public double calculateSurfaceArea()
    {
        return 4 * Math.PI *radius*radius;
    }

/**
* Boolean method that returns if the distance between the 2 centers is less that the sum of the radi
*
* @param  s2  <define the values of the sphere being compared to the current>
* @return      <boolean of wether the spheres collide or not>
*/
    public boolean collidesWith(Sphere s2)
    {
        //calculate the total difference in location (distance) between the two spheres
        double xdifference = Math.abs(this.getXCoordinate() -s2.getXCoordinate());
        double ydifference = Math.abs(this.getYCoordinate() -s2.getYCoordinate());
        double zdifference = Math.abs(this.getZCoordinate() -s2.getZCoordinate());
        double centerTotalDistance = xdifference+ydifference+zdifference;
        
        //compare the difference to the radius to check for collision
        if(centerTotalDistance < (this.getRadius() + s2.getRadius()))
        {
            return true;
        }

        //return false if they dont collide
        return false;
    }

    /**
    * Calculate and return the volume of the sphere
    *
    * @param none
    * @return      a double containing the volume (4/3)*Pi*radius^3
    */   
    public double calculateVolume()
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius,3);
    }





}
