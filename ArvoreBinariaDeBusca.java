public class ArvoreBinariaDeBusca <X extends Comparable<X>>
{
    private class No
    {
        private No esq;
        private X  info;
        private No dir;

        public No (No e, X i, No d)
        {
            this.esq  = e;
            this.info = i;
            this.dir  = d;
        }

        public No (X i)
        {
            this.esq  = null;
            this.info = i;
            this.dir  = null;
        }

        public No getEsq ()
        {
            return this.esq;
        }

        public X getInfo ()
        {
            return this.info;
        }

        public No getDir ()
        {
            return this.dir;
        }

        public void setEsq (No e)
        {
            this.esq = e;
        }
        
        public void setInfo (X i)
        {
            this.info = i;
        }

        public void setDir (No d)
        {
            this.dir = d;
        }
    } //fim da classe No

    private No raiz;
    
    public void guardeUmItem (X i) throws Exception
    {
        if (i==null) throw new Exception ("Informacao ausente");
        
        if (this.raiz==null)
        {
            this.raiz = new No (i);
            return;
        }
        
        No atual=this.raiz;
        for(;;) // forever
        {
            int comparacao=i.compareTo(atual.getInfo());
            
            if (comparacao==0) throw new Exception ("Elemento repetido");
            
            if (comparacao<0)
            {
                if (atual.getEsq()==null)
                {
                    atual.setEsq (new No (i));
                    return;
                }
                else
                    atual=atual.getEsq();
            }
            else // comparacao>0
            {
                if (atual.getDir()==null)
                {
                    atual.setDir (new No (i));
                    return;
                }
                else
                    atual=atual.getDir();
            }
        }
    }
    
    public boolean temOItem (X i) throws Exception
    {
        if (i == null)
            throw new Exception("Informacao ausente");
    
        No atual = this.raiz;
    
        for (;;)
        {
            if (atual == null)return false;
    
            int comparacao = i.compareTo(atual.getInfo());
    
            if (comparacao == 0)return true;

            else if (comparacao < 0)
                atual = atual.getEsq();
            else
                atual = atual.getDir();
        }
    }

    public boolean temOItemRecursivo(X i) throws Exception {

        if (i == null)throw new Exception("Informacao ausente");
    
        return this.temOItemRecursao(this.raiz, i);
    }
    
    private boolean temOItemRecursao(No atual, X i) {

        if (atual == null)return false;
    
        int comparacao = i.compareTo(atual.getInfo());
    
        if (comparacao == 0)return true;

        else if (comparacao < 0)
            return temOItemRecursao(atual.getEsq(), i);

        else
            return temOItemRecursao(atual.getDir(), i);
    }
    
} // fim da classe ArvoreBinariaDeBusca
