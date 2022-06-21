class Fair_Rations {

    /*
     * Complete the 'fairRations' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static String fairRations(List<Integer> B) {
    // Write your code here
        int sum=0;
        int count=0;
        String str="";
        for(int i=0;i<B.size();i++)
        {
            sum=sum+B.get(i);
        }
        if(sum%2==1)
        {
            return "NO";
        }
        else
        {
            for(int i=0;i<B.size();i++)
            {
                if(B.get(i)%2==1)
                {
                    B.set(i,B.get(i)+1);
                    B.set(i+1,B.get(i+1)+1);
                    count=count+2;
                }
            }
        }
        str=Integer.toString(count);
        //System.out.println(count);
        return str;
    }
}
