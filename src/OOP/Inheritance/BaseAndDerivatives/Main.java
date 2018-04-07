package OOP.Inheritance.BaseAndDerivatives;

public class Main {

    public static void main(String arg[]) {
        Base b = new Base();
        Base p = b; 
        
        Function1 f1 = new Function1();
        p.f();
        p.g();
        p = f1;
        
        
        Function2 f2 = new Function2();
        p.f();
        p.g();
        p = f2;
       
        p.f();
        p.g();
        

    }
}
