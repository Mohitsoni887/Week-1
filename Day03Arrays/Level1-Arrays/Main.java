// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declare array
        int a[][][] = new int[2][3][2];
        
        // Take Input
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int z=0;z<a[i][j].length;z++){
                    a[i][j][z] = input.nextInt();
                }
            }
        }
        
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int z=0;z<a[i][j].length;z++){
                    System.out.println(a[i][j][z] + " ");
                    sum+=a[i][j][z];
                }
                System.out.println();
            }
            System.out.println(); // Separate planes
        }
        System.out.println(sum);
    }
}