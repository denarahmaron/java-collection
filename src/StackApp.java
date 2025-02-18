import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Denar");
        stack.push("Ahmaron");
        stack.push("Surya");

        for(var name = stack.pop(); name != null ; name = stack.pop()){
            System.out.println(name);
        }
    }
}
