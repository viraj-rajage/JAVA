class Box{ 
    int a; String name;
    Box(){
        a=436; 
        name="NOOB";
    } 
    void show(){
        System.out.println(a+" "+name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Box b = new Box(); 
        b.show();
    }
}
