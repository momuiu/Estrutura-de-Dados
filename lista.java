
    import java.util.ArrayList;
    import java.util.List;

    public class Main  {
    
        public static void main(String[] args ) {
            List<String> compraList = new ArrayList<>();

            compraList.add("Macarrão");
            compraList.add("Requeijão");
            compraList.add("Linguiça");
            compraList.add("Mussarela");

            System.out.println("Já foi comprado:" + compraList.get(2));

        }
    }
