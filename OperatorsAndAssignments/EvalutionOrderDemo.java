class EvalutionOrderDemo{
    public static void main(String[] agrs){
        System.out.println(m1(1)+m1(2)*m1(3)+m1(4)*m1(5)/m1(6));
        
        int x = 0;
        x = ++x + x++ + x++;
        System.out.print("\n"+x);

        x = 0;
        x = ++x + x++ + x++ + ++x; //x = 8
        System.out.print("\n"+x);
    }
    public static int m1(int i){
        System.out.println(i);
        return i;
    }
}