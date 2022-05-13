public class Quest3BM{
public static void main(String[] args){
   double iv1=2.95;
   double iv2=3.50;
   System.out.println("item 1 custa: "+iv1+"item 2 custa: "+iv2);
   double soma = iv1 + iv2;
   System.out.println("A som eh: "+soma);
   final double taxa = (8.25/100);
   double taxaCalculada = soma + (soma*taxa);
   System.out.println("Taxa Calculada: "+taxaCalculada);
   iv1 = iv1 + (iv1*taxa);
   iv2 = iv2 + (iv2*taxa);
   double novoCusto = iv1 + iv2;
   Boolean muitoCaro= (novoCusto>10?true:false);
   System.out.println("eh muito caro? :"+muitoCaro);
  }
}
