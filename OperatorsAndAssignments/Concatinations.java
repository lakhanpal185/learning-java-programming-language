class Concatinations{
    public static void main(String[] agrs){
        String str1 = "hello ";
        String str2 = "day light is good for health";

        String str3 = str1 + str2;
        System.out.print(str3);
        int x = 10;

        System.out.println(str3+x);//hello day light is good for healthhello day light is good for health10
        System.out.print(x+str3+x);//10hello day light is good for healthhello day light is good for health10
        
        int a = 10,b=3;
        str1 = a + str2; // valid
        // str1 = a + b not valid
        // a = str1 + str2 not valid
        
    }
}