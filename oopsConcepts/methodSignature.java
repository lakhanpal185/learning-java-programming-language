class methodSignature{
    public void printdetails(int age,String name){ //name and arguments--> signature
        System.out.println("age : "+age+" name: "+name);
    }
    public static void main(String []args){
        methodSignature ms = new methodSignature();
        ms.printdetails(22,"lakhan");
    }

}