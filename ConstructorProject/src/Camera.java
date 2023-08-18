class Camera {
String color;
String brand;
int cost;
void captureImage()
{
	System.out.println("image captured...");
}
void displayImage()
{
	System.out.println("image displayed..");
}
//constructor
public Camera(String x, String y, int z)
{
  color=x;
  brand=y;
  cost=z;
}
}
