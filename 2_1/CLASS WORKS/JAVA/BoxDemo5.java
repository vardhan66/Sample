//using parametarized method

class Box {
double width;
double height;
double depth;

double volume () {
return width * height * depth;
}
void setDim(double w, double h, double d){
width = w;
height = h;
depth = d;
}
}
class BoxDemo5 {
public static void main (String args[]) {
Box mybox1 = new Box();
Box mybox2 = new Box();
double vol;

mybox1.setDim(10, 20, 30);

mybox2.setDim(40, 60, 40);

vol = mybox1.volume();
System.out.println("volume of box 1 is: " + vol);

vol = mybox2.volume();
System.out.println("volume of box 2 is: " + vol);
}
}