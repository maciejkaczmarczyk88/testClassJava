package task.Zada3;

public class Sortable {
    public static void main(String[] args) {

        int[] tab = {5,4,3,8,9,10,11,2,1,0,12,7};
        int temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }
}
