package ts;

public class SwitchTest 
{  
    public static void main(String[] args) 
    {
        System.out.println("value =" + switchIt(4)); 
    } 
    public static int switchIt(int x) 
    {
        int j = 1;  
        switch (x) 
        { 
            case l: j++; 
            case 2: j++;  
            case 3: j++; 
            case 4: j++; 
            case 5: j++; 
            default: j++; 
            } 
        return j + x;  
    } 
}
/*
int I = 0;
outer:
while (true) 
{
    I++;
    inner:
    for (int j = 0; j < 10; j++) 
    {
        I += j;
        if (j == 3)
            continue inner;
        break outer;
    }
    continue outer;
}
System.out.println(I);

}
}*/