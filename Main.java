public class Main {
    public static void main(String[] args) {
        try{
            ArvoreBinariaDeBusca<Integer> a =
			new ArvoreBinariaDeBusca<Integer> ();

            a.guardeUmItem(50);
            a.guardeUmItem(45);
            a.guardeUmItem(60);
            a.guardeUmItem(42);
            a.guardeUmItem(49);
            a.guardeUmItem(55);
            a.guardeUmItem(63);
            a.guardeUmItem(30);
            a.guardeUmItem(65);
            //a.guardeUmItem(61);
            //a.guardeUmItem(64);

            //int tamanho = a.getAltura();
            //System.out.println(tamanho);
            
            
           //a.removaUmItem(20);
           //a.removaUmItem(10); 
           boolean balanceada = a.isBalanceada();
           System.out.println(balanceada);

        }

        catch (Exception erro){
        System.err.println(erro.getMessage());
    }
    }
    
}

/*
            System.out.println(a.temOItem(10));
            System.out.println(a.temOItem(6));
            System.out.println(a.temOItem(15));
            System.out.println(a.temOItem(3));
            System.out.println(a.temOItem(8));
            System.out.println(a.temOItem(12));
            System.out.println(a.temOItem(17));
            System.out.println(a.temOItemRecursivo(2));
            System.out.println(a.temOItemRecursivo(4));
            System.out.println(a.temOItemRecursivo(7));
            System.out.println(a.temOItemRecursivo(9));
            System.out.println(a.temOItemRecursivo(11));
            System.out.println(a.temOItemRecursivo(13));
            System.out.println(a.temOItemRecursivo(18));
 */
