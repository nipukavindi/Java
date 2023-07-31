package practical5q4;
public class circle extends Practical5q4
{ 
 private double height,radius;
 public circle(double a,double b)
 {
       height=a;
     radius=b; 
 }
 
 public double  CalculateArea()
 {
     return 3.14159*radius*radius;
 }
}
