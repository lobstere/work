package ac_nowcoder;

import java.util.*;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            int[] t = new int[a];
            int x = t[0];
            for(int i=0;i<t.length;i++){
                t[i]=sc.nextInt();
            }
            for (int i : t) {
//                for(int k=t.length-1;j>0;k--){
//                    System.out.println(t[k]);
//                }
                if (i > x) {
                    System.out.println(i);
                }
            }
            break;
        }
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()){
//            int a = in.nextInt();
//            int[] b = new int[a];
//            for(int i=0;i<a;i++){
//                b[i]=in.nextInt();
//            }
//            int temp=0;
//            for(int j=0;j<a-1;j++){
//                for(int i=0;i<a-1;i++){
//                    if(b[i]>b[i+1]){
//                        temp=b[i];
//                        b[i]=b[i+1];
//                        b[i+1]=temp;
//                    }
//                }
//            }
//            System.out.print(b[b.length-2]+" ");
//            System.out.println(b[1]);
//        }
//    }
//}