class annonymousArr{
    public static void main(String []args){
        sum(new int[]{10,45,80,20});
    }
    
    public static void sum (int[] x){
        int total = 0;
        for(int i = 0; i < x.length; i++)
        total += x[i];

      System.out.println("total is : "+total);
    } 
}
