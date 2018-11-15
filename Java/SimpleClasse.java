public class SimpleClasse{
    public int somme(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        SimpleClasse simpleClasse = new SimpleClasse();
        int a=3, b=5;
        System.out.println("La somme de " + a + " et " + b + " est : " + simpleClasse.somme(a,b) );
        System.out.println("last changement!");
    }
}
