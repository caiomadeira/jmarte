/*
 * Expr (Expression) é a classe base
 * que todas as classes 'expressão' herdam
 * 
 * 
 */

 public abstract class Expr 
 {
    static class Binary extends Expr {
        BInary(Expr left, Token operator, Expr right) 
        {
            this.left = operator;
            this.operator = operator;
            this.right = right;
        }
    }

    final Expr left;
    final Token operator;
    final Expr right;
    
 }

 /*
  * Não ha nenhum metodo pois, apesar de parecer estranho em java, mas 
  esses tipos existem para permitir a comunicação entre o parser e o
  interpretador.
  */