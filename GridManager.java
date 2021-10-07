public class GridManager 
{
    int size=5;
    int[][] Grid_vaccancy;
    String[][] Grid_Players;

    GridManager()
    {
        Grid_vaccancy=new int[size][size];
        Grid_Players=new String[size][size];
    }
    public void put_Grid_vaccancy(String name,int i,int j)
    {
        int temp=1;
        Grid_vaccancy[i][j]=temp;
    }
    public void put_Grid_Player(String name,int i,int j)
    {
        Grid_Players[i][j]=name;
        put_Grid_vaccancy(name,i,j);
    }
    public void putChar(String name,int i,int j)
    {

    }
    public boolean checkMove()
    {
        return true;
    }
    public int getSize()
    {
        return size;
    }
    void updateGrid(String name,int i,int j)
    {
        put_Grid_Player(name,i,j);
    }
    
}
