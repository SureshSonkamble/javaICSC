package DS;
class exam{
	
public static String fun(int n) {
    if (n <= 0) {
        return "-";
    }else {
    return fun(n - 3) + n + fun(n - 2) + n;
    }
}

public static void main(String[] args) {
    String result = fun(5);
    System.out.println(result); 
    // Output: "-5-5"
}
}