import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] name= new String[20];
        String searchName;
        boolean findName=false;
        int findNameIndex=0;

        System.out.println("Enter names for will be storage in memory");
        for(int i=0; i<20; i++){
            name[i]= sc.nextLine();
        }
        String sketch;

        for(int i=0; i<20; i++){
            for(int j=0; j<20; j++){
                if(name[i].codePointAt(0)< name[j].codePointAt(0)){
                    sketch=name[j];
                    name[j]=name[i];
                    name[i]=sketch;
                }
            }
        }
        System.out.println("Search name to be research in array");
        searchName=sc.nextLine();
        for(int i=0; i<20; i++){
            if(name[i].equals(searchName)){
                findName=true;
                findNameIndex=i;
            }
        }
        if(findName){
            System.out.println("This name wasn find");
            System.out.printf("Name: %s\t Index: %d", searchName,findNameIndex);
        }else{
            System.out.println("This name wasn't find");
        }
    }
}