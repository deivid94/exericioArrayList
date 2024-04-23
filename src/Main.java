import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<>();
        var nome1 = nomes.add("Deivid");
        var nome2 = nomes.add("Barbara");
        var nome3 = nomes.add("Maria");
        var nome4 = nomes.add("Monique");

        for (String nome : nomes){
            System.out.println(nome);
        }

        //-----------------------------------------//

        Produto novoProduto = new Produto("Vassoura", 25.50);
        var novoProduto1 = new Produto("Sabao", 5.35);
        var novoProduto2 = new Produto("Esponja", 2.25);

        ArrayList<Produto> produtos =  new ArrayList<>();
        produtos.add(novoProduto1);
        produtos.add(novoProduto2);
        produtos.add(novoProduto);


      produtos.forEach(System.out::println);
    }





}