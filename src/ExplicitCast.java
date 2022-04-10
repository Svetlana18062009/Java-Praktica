public class ExplicitCast {
    public static void main(String[] args) {
        long l=10;
        double d = l;//неявное приведение(long B double)
        l=(long) d;//явное приведение(double B long)
        System.out.println( l + " " + d);
    }
}
