
class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long x[]={-1};
        if(a.length==0)
        return x;
        Arrays.sort(a);
        long first = Integer.MAX_VALUE;
        long second = Integer.MAX_VALUE;
    
        for(int i=0;i<a.length;i++){
            if(a[i]<first)
            first=a[i];
        }
        for(int i=0;i<a.length; i++){
            if(a[i]>first){
            second=a[i];
            break;
                
            }
    }
    return new long[]{first, second}; 
}
}