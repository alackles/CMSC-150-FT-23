import java.awt.Point;
import java.awt.Rectangle;

public class BookTest {

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width /2;
        int y = box.y + box.height/2;
        return new Point(x, y);
    }   

    public static void main(String[] args) {
    
        Rectangle myRectangle = new Rectangle(2, 4, 6, 2);
        Point newCenter = findCenter(myRectangle);
        System.out.println(newCenter);
    }
}