import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

public class TestCases
{
   @Test
   public void testDistance()
   {
      Point origin = new Point(0, 0);
      Point p1 = new Point(1, 0);
      Point p2 = new Point(1, 1);
      Point p3 = new Point(0, 1);
      Point p4 = new Point(-1, 1);
      Point p5 = new Point(-1, 0);
      Point p6 = new Point(-1, -1);
      Point p7 = new Point(0, -1);
      Point p8 = new Point(1, -1);

      assertEquals(0, AStarPathingStrategy.longDistance(origin, origin));
      assertEquals(10, AStarPathingStrategy.longDistance(origin, p1));
      assertEquals(14, AStarPathingStrategy.longDistance(origin, p2));
      assertEquals(10, AStarPathingStrategy.longDistance(origin, p3));
      assertEquals(14, AStarPathingStrategy.longDistance(origin, p4));
      assertEquals(10, AStarPathingStrategy.longDistance(origin, p5));
      assertEquals(14, AStarPathingStrategy.longDistance(origin, p6));
      assertEquals(10, AStarPathingStrategy.longDistance(origin, p7));
      assertEquals(14, AStarPathingStrategy.longDistance(origin, p8));
   }

}
