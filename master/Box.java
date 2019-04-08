class Box_Shape{
    double width;
    double height;
    double depth;

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

public class Box{
    public static void main (String[] args){
        Box_Shape b1 = new Box_Shape(1, 2, 3);
        Box_Shape b = new Box_Shape(b1);

        double volume = b.get_volume();
        System.out.println("volume: " + volume);
    }
}
