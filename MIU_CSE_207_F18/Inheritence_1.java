//example of java inheritence

class A{
    int i = 1, j = 2;

    void show_ij(){
        System.out.println("i and j: " + i + " : " + j);
    }
}



class B extends A{
    int k;

    void show_k(){
        System.out.println("k: " + k);
    }

    void sum(){
        int s = i + j + k;
        System.out.println("sum: " + s);
    }
}

public class Inheritence_1{
    public static void main (String[] args){
        B b_obj = new B();
        b_obj.k = 5;
        b_obj.sum();
    }
}

