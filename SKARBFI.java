package eleader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SKARBFI
{
    public static void main(String[] args)
    {
       try
       {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int rows = Integer.parseInt(reader.readLine());
           for (int i = 0; i < rows; ++i)
           {
               int count = Integer.parseInt(reader.readLine());
               int map[][] = new int[count][2];
               for (int j = 0; j < count; ++j)
               {
                   String[] str = reader.readLine().split(" ");
                   map[j][0] = Integer.parseInt(str[0]);
                   map[j][1] = Integer.parseInt(str[1]);
               }
               showMap(map);
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
    private static void showMap(int[][] map)
    {
        int x = 0;
        int y = 0;
        for (int i = 0; i < map.length; ++i)
        {
            switch(map[i][0])
            {
                case 0: x += map[i][1]; break;
                case 1: x -= map[i][1]; break;
                case 2: y += map[i][1]; break;
                case 3: y -= map[i][1]; break;
            }
        }
        if (x == 0 && y == 0)
            System.out.println("studnia");
        else
        {
            if (x == 0 && y != 0)
            {
                System.out.println(y > 0? "2 " + y : "3 " + (-y));
            }
            else if (x != 0 && y == 0)
            {
                System.out.println(x > 0? "0 " + x : "1 " + (-x));
            }
            else if (x != 0 && y != 0)
            {
                System.out.println(x > 0? "0 " + x : "1 " + (-x));
                System.out.println(y > 0? "2 " + y : "3 " + (-y));
            }
        }
    }
}
