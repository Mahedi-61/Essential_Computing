class Box_Shape{
    //instance variable
    double width;
    double height;
    double depth;

    //constructor
    Box_Shape(){
        width = 1;
        height = 1;
        depth = 1;
    }

    Box_Shape(double a, double b, double c){
        width = a;
        height = b;
        depth = c;
    }

    Box_Shape(double len){
        width = height = depth = len;
    }

    Box_Shape(Box_Shape ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    double get_volume(){
        return width * depth * height;
    }
}

class Box extends Box_Shape{
    double weight;

    Box(double wh, double wd){
        super();
        weight = wh;
    }

    void show(){
        System.out.println("wh, wd, h, d" + " " +
                                 weight+ " , " + width + " , " + 
                                 height + " , " + depth);
    }
} 


//sub class
public class Inheritence_3{
    public static void main(String[] args){
        Box b = new Box(1, 2);
        b.show();
    }
}


