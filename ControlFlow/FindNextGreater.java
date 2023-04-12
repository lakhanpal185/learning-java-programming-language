class FindNextGreater{
    public static void main(String[] args){
        int []a={20,7,3,4,334,4,34,35,45,4,232,3,292,498,89,546,67,3000,43};
        final int len = a.length;
        int []result= new int[len];

        int max = a[0], j = 0;
        result[0] = max;
        for(int i = 1; i < a.length; ++i){
            if(max < a[i])
                result[++j] = a[i];
        }       

        for(int i = 0; i <result.length;++i){
            if(result[i] != 0)
            System.out.print(result[i]+" ");
        }
    }
}