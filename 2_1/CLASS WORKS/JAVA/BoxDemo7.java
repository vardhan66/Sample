//using parametarized constructors method

class Box {
double width;
double height;
double depth;

Box(double w, double h, double d){
width = w;
height = h;
depth = d;
}
double volume () {
return width * height * depth;
}
}
class BoxDemo7 {
public static void main (String args[]) {
Box mybox1 = new Box(10, 20, 30);
Box mybox2 = new Box(40, 60, 40);
double vol;

vol = mybox1.volume();
System.out.println("volume of box 1 is: " + vol);

vol = mybox2.volume();
System.out.println("volume of box 2 is: " + vol);
}
}