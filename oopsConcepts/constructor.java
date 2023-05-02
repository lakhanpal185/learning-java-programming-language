class Student{
    String name;
    int rollNo;

    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String []args){
        Student st1 = new Student("hitesh",21);
        Student st2 = new Student("aman",34);
    }
}
// we can to replece constructo with instance block becoz constructor can initialize object with arguments
 