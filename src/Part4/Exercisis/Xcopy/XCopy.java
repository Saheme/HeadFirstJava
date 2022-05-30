package Part4.Exercisis.Xcopy;

public class XCopy {
    int orig = 42;

    public static void main(String[] args) {
        XCopy x = new XCopy();
        int y = x.go(x.orig);
        System.out.println(x.orig + " " + y);
    }

    int go( int arg){
        arg = arg * 2;
        return arg;
    }





}
