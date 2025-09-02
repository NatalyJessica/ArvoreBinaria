public class Main {
    public static void main(String[] args) {
        try{
            ArvoreBinariaDeBusca<Integer> a =
			new ArvoreBinariaDeBusca<Integer> ();

            a.guardeUmItem(10);
            a.guardeUmItem(15);
            a.guardeUmItem(20);
            //a.guardeUmItem(3);
            //a.guardeUmItem(6);
            //a.guardeUmItem(9);
            int tamanho = a.getAltura();
            System.out.println(tamanho);
            
            
           //a.removeItem(10);
           //a.removeItem(11); 
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
