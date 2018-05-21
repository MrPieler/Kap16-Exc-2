package Exc2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Exc2
{
    public static void main(String[] args) throws NoSuchElementException
    {
        List<Integer> list = new LinkedList<>();

        System.out.println(max(list));
    }

    private static Integer max (List<Integer> list)
    {
        if (list.isEmpty())
        {
            throw new NoSuchElementException ("fejl");
        }
        Integer max = 0;
        for (Integer i:list)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;
    }
}
