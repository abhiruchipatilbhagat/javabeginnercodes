public class Rectangle {
    int l, b;
    public int area(int le, int br){
        l = le;
        b = br;
        return (l*b);
    }
    public int perimeter(int le, int br){
        l = le;
        b = br;
        return (2*(l+b));
    }
    public static void main(String[] args){
        Rectangle sq = new Rectangle();
        int ar = sq.area(4, 5);
        int pr = sq.perimeter(5, 6);
        System.out.printf("area is %d and perimeter is %d", ar, pr);
    }
}
