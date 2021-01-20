public class Interest {
    private int principal;
    private int time;
    private int rate;
    
     Interest(int p,int r,int t){
        principal = p;
        rate = r;
        time = t;}
        
    public void setPrincipal(int p)
        {principal = p;}
    
    public void setTime (int t)
    {time = t;}
    
    public void setRate (int t)
    {rate = t;}
      
    public int getTime ()
    {return time;}
    public int getRate ()
    {return rate;}
    public int getPrincipal ()
    {return principal;}
    int interest(){
        return principal*rate*time/100;
    }
    public static void main (String [] args){
        Interest i = new Interest(10000,5,10);
        System.out.println(i.getPrincipal());
        System.out.println(i.getTime());
        System.out.println(i.getRate());
        System.out.println(i.interest());
    }
}
        