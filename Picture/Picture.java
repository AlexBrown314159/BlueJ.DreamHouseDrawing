
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square land;
    private Square sky;
    private Square door1;
    private Square door2;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        land = new Square();
        land.changeSize(500);
        land.moveVertical(120);
        land.moveHorizontal(-100);
        land.changeColor("tan");
        land.makeVisible();
        
        sky = new Square();
        sky.changeSize(500);
        sky.changeColor("blue");
        sky.moveHorizontal(-100);
        sky.moveVertical(-350);
        sky.makeVisible();
        
        
        wall = new Square();
        wall.changeColor("green");
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
        door1 = new Square();
        door1.moveVertical(150);
        door1.moveHorizontal(60);
        door1.changeColor("blue");
        door1.makeVisible();
        
        door2 = new Square();
        door2.moveVertical(120);
        door2.moveHorizontal(60);
        door2.changeColor("blue");
        door2.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("white");
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
