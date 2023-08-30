package package_1.System_method;

public class Math {

    public long add (int ...n)
    {
        long sum =0;
        for(int m : n)
        {
            sum += m;
        }
        return sum;
    }

    public int max (int ...n)
    {
        int max =0;
        for(int m : n)
        {
            if(max < m)
                max = m;
        }
        return max;
    }

    public int min (int ...n)
    {
        int min =0;
        for(int m : n)
        {
            if(min > m)
                min = m;
        }
        return min;
    }

    public int mul (int ...n)
    {
        int min =0;
        for(int m : n)
        {
            min *= m;
        }
        return min;
    }

}
