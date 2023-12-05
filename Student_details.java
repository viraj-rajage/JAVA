class Student{
    int Roll_no; 
    String name; 
    void insertSdetail(int r, String n){
        Roll_no=r; 
        name=n;
    } 
    void display_detail(){System.out.println(Roll_no+""+name);}
}
public class Student_details {
    public static void main(String[] args) {
        Student s1 =new Student();
        Student s2 = new Student(); 
        s1.insertSdetail(34, " ravi");
        s2.insertSdetail(11, " noob"); 
        s1.display_detail(); 
        s2.display_detail();
    }
}
