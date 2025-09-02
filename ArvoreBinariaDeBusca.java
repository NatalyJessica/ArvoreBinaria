public class ArvoreBinariaDeBusca<X extends Comparable<X>> {
    private class No {
        private No esq;
        private X info;
        private No dir;

        public No(No e, X i, No d) {
            this.esq = e;
            this.info = i;
            this.dir = d;
        }

        public No(X i) {
            this.esq = null;
            this.info = i;
            this.dir = null;
        }

        public No getEsq() {
            return this.esq;
        }

        public X getInfo() {
            return this.info;
        }

        public No getDir() {
            return this.dir;
        }

        public void setEsq(No e) {
            this.esq = e;
        }

        public void setInfo(X i) {
            this.info = i;
        }

        public void setDir(No d) {
            this.dir = d;
        }
    } // fim da classe No

    private No raiz;

    public void guardeUmItem(X i) throws Exception {
        if (i == null)
            throw new Exception("Informacao ausente");

        if (this.raiz == null) {
            this.raiz = new No(i);
            return;
        }

        No atual = this.raiz;
        for (;;) // forever
        {
            int comparacao = i.compareTo(atual.getInfo());

            if (comparacao == 0)
                throw new Exception("Elemento repetido");

            if (comparacao < 0) {
                if (atual.getEsq() == null) {
                    atual.setEsq(new No(i));
                    return;
                } else
                    atual = atual.getEsq();
            } else // comparacao>0
            {
                if (atual.getDir() == null) {
                    atual.setDir(new No(i));
                    return;
                } else
                    atual = atual.getDir();
            }
        }
    }

    // metodo não recursivo
    public boolean temOItem(X i) throws Exception {
        if (i == null)
            throw new Exception("Informacao ausente");

        No atual = this.raiz;

        for (;;) {
            if (atual == null)
                return false;

            int comparacao = i.compareTo(atual.getInfo());

            if (comparacao == 0)
                return true;

            else if (comparacao < 0)
                atual = atual.getEsq();
            else
                atual = atual.getDir();
        }
    }

    // metodo recursivo
    public boolean temOItemRecursivo(X i) throws Exception {

        if (i == null)
            throw new Exception("Informacao ausente");

        return this.temOItemRecursao(this.raiz, i);
    }

    private boolean temOItemRecursao(No atual, X i) {

        if (atual == null)
            return false;

        int comparacao = i.compareTo(atual.getInfo());

        if (comparacao == 0)
            return true;

        else if (comparacao < 0)
            return temOItemRecursao(atual.getEsq(), i);

        else
            return temOItemRecursao(atual.getDir(), i);
    }

    private int getAltura(No r) {
        if (r == null)
            return 0;

        int alturaDaSubArvoreEsquerda = this.getAltura(r.getEsq()),
                alturaDaSubArvoreDireita = this.getAltura(r.getDir());

        // o ? no codigo significa "então" e o : "senão"
        return alturaDaSubArvoreEsquerda > alturaDaSubArvoreDireita
                ? alturaDaSubArvoreEsquerda + 1
                : alturaDaSubArvoreDireita + 1;
    }

    public int getAltura() {
        return this.getAltura(this.raiz);
    }

    // metodo remover
    // verificar se o item removido foi passado
    // verificar se a raiz não é nula
    // verificar se o item existe
    public void removeItem(X i) throws Exception {
        System.out.println("iniciou");
        if (i == null)
            throw new Exception("informação ausente");
        if (this.raiz == null)
            throw new Exception("Arvore vazia ");
        if (!temOItem(i))
            throw new Exception("Informação a ser removida não existe");

        No atual = this.raiz;
        for (;;) {

            int comparacao = i.compareTo(atual.getInfo());
            No pai = null;
        
            if (comparacao == 0) {
                break;
            }

            pai = atual;
            //caso folha sem filho
            if(comparacao == 0){
                if(atual.getDir() == null && atual.getEsq() == null )
                    this.raiz = null;                
              return;      
                
            }

     

        }
    }

    //exercicios isEspelho() faça um metodo para retornar true ou false caso uma arvore seja o espelho da outra
    //fazer metodos obrigatorios da arvore

    

} // fim da classe ArvoreBinariaDeBusca
