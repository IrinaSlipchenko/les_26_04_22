public class Main {
    public static String maskify(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();
        if (n <= 4){
            return str;
        }else if (n > 4){
            result.append("#".repeat(n - 4));
            result.append(str.substring(n - 4, n));
            return result.toString();
        }else{
            throw new UnsupportedOperationException("Unimplemented");
        }
    }


    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }
}
