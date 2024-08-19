import java.util.Stack;

public class pilha {
    public static void main(String[] args ) {
        Stack<String> Pizzas = new Stack<>();

        Pizzas.add("Calabresa");
        Pizzas.add("Portuguesa");
        Pizzas.add("Frango com Catupiry");
        Pizzas.add("Havaiana");
        Pizzas.add("Carne de Sol");

        System.out.println("A pizza retirada foi:" + Pizzas.pop()) ;
    }
    
}
