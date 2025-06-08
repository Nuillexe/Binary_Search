import java.util.Arrays;
import java.util.Scanner;
/*
Solicitar 20 nomes quaisquer que serão armazenados em uma matriz do tipo vetor. Ordene
este vetor em ordem alfabética. Exiba na tela os 20 nomes na ordem. Em seguida solicite um
nome para pesquisa. Caso o nome fornecido exista no vetor, informar a sua localização (seu
índice).
*/

public class Main {
    public static int searchPositionName(String[]array,String name, int left, int right){
        int mid;
        mid=(right+left)/2;
        //System.out.printf("L:%d\tR:%d\tmid:%d\n",left,right,mid);
        // This print statement displays the values of the variables left, right, and mid, which are essential for
        // understanding the algorithm's behavior.

        int comparision=array[mid].compareToIgnoreCase(name);
        if(left>right){//When 'left' become greater than 'right', the seached name does not exist in the array
            return -1;
        }
        if(comparision==0){
            return mid;
        }else if( comparision<0){
            left=mid+1;
            return searchPositionName(array,name,left,right);
        }else{
            right = mid - 1;
            return searchPositionName(array, name, left, right);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] names= new String[20];
        String searchName;

        System.out.println("Enter names for will be storage in memory");
        for(int i=0; i<20; i++){
            names[i]= sc.nextLine();
        }
        //Sort the array names in alphabetic order
        Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);

        System.out.println("Search name to be research in array");
        searchName=sc.nextLine();
        int findNameIndex=searchPositionName(names,searchName,0,names.length-1);
        if(findNameIndex!=-1){
            System.out.println("This name was find");
            System.out.printf("Name: %s\t Index: %d", searchName,findNameIndex);
        }else{
            System.out.println("This name wasn't find");
        }
    }
}
