public class Data  
{  
public static final int MAX = 100;  


private int[][] grid;  

public Data(int[][] s)
{
    grid= s;
}

public void getdata(){

    for(int x = 0; x<grid.length; x++)
    {
        for(int y = 0; y<grid[0].length; y++)
           {
            System.out.print(" "+grid[x][y]);
           }
           System.out.println();
    }

    }

/** Fills all elements of grid with randomly generated values, as described in part (a) * Precondition: grid is not null. 
* grid has at least one element. 
*/ 
public void repopulate() 
{ 
    int temp = 0;
    for(int x = 0; x<grid.length; x++)
    {
        for(int y = 0; y<grid[0].length; y++)
        {
            temp=1;
        while(temp%100==0 || temp%10!=0)temp =(int)(Math.random()* MAX)+1;  
            grid[x][y] = temp;



    }
        

    }
       
    }

/** Returns the number of columns in grid that are in increasing order, as described * in part (b) 
* Precondition: grid is not null. 
* grid has at least one element. 
*/ 
public int countIncreasingCols()  
{ 
    int count = 0;
    int checker = 0;
    for(int y = 0; y<grid[0].length; y++)
    {
        for(int x = 1; x<grid.length; x++)
        {
            if(grid[x-1][y]>grid[x][y]) checker++;
            


        }
        if(checker==0) count++;
        checker=0;
    }
    System.out.println(count);
    return count;
}  
// There may be instance variables, constructors, and methods that are not shown. 
}  
