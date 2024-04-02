class Shapes
{
int x,y;
double z;
void cal(int l){
x=l;
System.out.println("Area of square:"+x*x);
}
void cal(int l,int b){
x=l;
y=b;
System.out.println("Area of triangle:"+0.5*x*y);
}
void cal(double r)
{
z=r;
System.out.println("Area of circle:"+3.14*z*z);
}
}
class ShapesDemo{
public static void main(String args[]){
Shapes s=new Shapes();
s.cal(5);
s.cal(2,4);
s.cal(2.5);
}
}
