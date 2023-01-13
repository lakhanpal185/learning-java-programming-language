class myarray{
    public static void main(String args[]){
        int[] a = new int[7];
        for(int i  = 0; i < 7; i++)
        System.out.println(a[i]);
        
        int i = 4;
        int c[] = new int[0];
        while(i-- != 0){
        a[i]=i;
        System.out.println(a[i]);
        }

     //2D array creation not a matric like c/c++ it is a arr of arrays
        int[] arr2dnormal1 = new int[0];
        int  [][]arr2dnoral2 = new int[3][3];
        int[] arr2dnoral3[] = new int[3][3];
        int arr2dnoral4[][] = new int[3][3];
        int[] []arr2dnoral5 = new int[2][2];
        int []arr2dnoral6[] = new int[8][3];

        
       // int []arr2dnoral6[] = new int[][3]; not valid
      // max form 2d array
      int arr[][] = {
        {1, 100, 5},
        {2, 9, 208},
        {34, 89, 90}
      };
      
      int maxval = arr[0][0];
      for( i= 0; i < 3 ; i++)
      {
        
        for(int j = 0; j < 3; j++){
            if(arr[i][j] > maxval)
                maxval = arr[i][j];
          
        }
      }
    System.out.print("max : "+maxval);
    System.out.print(" length : "+arr[0].length * arr.length);

    // annonymous arrays
    // new int[]{73,434,56,32}
    
    }
}