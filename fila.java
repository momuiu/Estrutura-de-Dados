import java.util.LinkedList;
import java.util.Queue;


public class fila {

    public static void main(String[] args) {

        Queue<String> Crianças = new LinkedList<>();

         Crianças.add("Mariana");
         Crianças.add("Julio");
         Crianças.add("Enzo");
         Crianças.add("Natalia");
         Crianças.add("Viktor");

         System.out.println("o item removido foi:" + Crianças.remove());


    }
}