import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list, ArrayList<Integer> lista) {
        int a = lista.get(0);
        int b = lista.get(1);
        int c = lista.get(2);
        int d = lista.get(3);
        if (a > b){
            if(a > c){
                if(a > d){
                    return a;
                }
                else if (d > a){
                    if (d > b){
                        if (d > c){
                            return d;
                        }
                    }
                }
            }
            else if(c > a){
                if (c > d){
                    if (c > b){
                        return c;
                    }
            }
            
        }
        else if (b > a){
            if(b > c){
                if (b > d){
                    return b;
                }
                else if (d > a){
                    if (d > b){
                        if (d > c){
                            return d;
                        }
                    }
                }
            else if(c > a){
                if (c > d){
                    if (c > b){
                        return c;
                    }
                }
            }
        

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}