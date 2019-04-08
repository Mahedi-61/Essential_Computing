//superclass
class A {
    int i;
    protected int j;

    void set_ij(int a, int b){
        i = a;
        j = b;
    }

    void get_ij(){
        System.out.println("i and j: " + i + " , " + j);
    }
}

//subclass
class B extends A{
    int total;
    int i, j;
    void sum(){
        total = i + j;
    }
}

public class Inheritence_2{
    public static void main(String[] args){
       B b = new B();
       b.set_ij(10, 13);
       b.get_ij();
    }
}