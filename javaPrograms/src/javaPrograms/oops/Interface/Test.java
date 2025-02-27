package javaPrograms.oops.Interface;




interface Square {
    int calculate(int x);
}
interface Cube{
	int volume(int y);
}
 
class Test {
    public static void main(String args[])
    {
        int a = 5;
 
        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;
 
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
        Cube c=(int y)-> y*y*y;
        int resvol=c.volume(a);
        System.out.println("-------------second use of  lambda Expression-------");
        System.out.println(resvol);
        
    }
}
