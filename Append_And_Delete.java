class Append_And_Delete {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
    int p1=0,p2=0,check=0,totalLength=s.length()+t.length();
    if(k>=totalLength)
    return "Yes";
    while(p1<s.length()&&p2<t.length())
    {
        if(s.charAt(p1)!=(t.charAt(p2)))
        {
            break;
        }
        else
        {
            p1++;
            p2++;
        }
    }
    check=s.length()+t.length()-p1-p2;
    if(k>=check && Math.abs(check-k)%2==0)
    return "Yes";
    return "No";
    }
}
