package eleader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PA05_POT 
{ 
    public static void main(String[] args)
    {
        try 
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int rows = Integer.parseInt(reader.readLine());
            int[] result = new int[rows];
            for (int i = 0; i < rows; ++i)
            {
                String[] str = reader.readLine().split(" ");
                result[i] = findLastDigit(Long.parseLong(str[0]), Long.parseLong(str[1]));
            }

            for (int r : result)
                System.out.println(r);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public static int findLastDigit(long base, long power)
    {   
        List<Integer> last = new ArrayList<>(4);
        int i = 1;
        while (!last.contains((int)Math.pow(base % 10, i) % 10))
        {
            last.add((int)Math.pow(base % 10, i++) % 10);
        }
        
        return last.get((int)((power % last.size()) + last.size() - 1) % last.size());
   }
}
