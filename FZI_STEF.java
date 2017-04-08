package eleader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FZI_STEF
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int rows = Integer.parseInt(reader.readLine());
            int[] cities = new int[rows];
            for (int i = 0; i < rows; ++i)
            {
                cities[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println(findSalary(cities));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private static int findSalary(int[] tab)
    {
        int value = 0;
        int tmp = tab[0] > 0? tab[0] : 0;
        int last = 0;
        for (int i = 1; i < tab.length; ++i)
        {
            if (tmp + tab[i] >= last)
            {
                tmp = tmp + tab[i];
                last = tmp;
            }
            else tmp = 0;
            
        }
        return tmp > last? tmp : last;
    }
}
