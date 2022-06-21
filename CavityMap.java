class CavityMap {

    /*
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static List<String> cavityMap(List<String> grid) {
    // Write your code here
    List al=new ArrayList();
    char ch[][]=new char[grid.size()][grid.size()];
    for(int i=0;i<grid.size();i++)
    {
        for(int j=0;j<grid.size();j++)
        {
           ch[i][j]=grid.get(i).charAt(j);
        }
    }
    for(int i=1;i<grid.size()-1;i++)
    {
        for(int j=1;j<grid.size()-1;j++)
        {
            int top_down=ch[i-1][j]>ch[i+1][j]?ch[i-1][j]:ch[i+1][j];
            int right_left=ch[i][j-1]>ch[i][j+1]?ch[i][j-1]:ch[i][j+1];
            int temp=top_down>right_left?top_down:right_left;
            if(ch[i][j]>temp)
            {
                ch[i][j]='X';
            }
        }
    }
    for(int i=0;i<grid.size();i++)
    {
        String str="";
        for(int j=0;j<grid.size();j++)
        {
            str=str+ch[i][j];
        }
        al.add(i,str);
    }
    return al;
    }

}