package day15multidimensionalarrayLists;

public class MultiDimentionalArrys03 {
    public static void main(String[] args) {

        int arr[][]={{5,0}, {-2, 4}, {65, -12,23}};
        int max=arr[0][0];
        for (int[] w:arr){
            for (int u: w){
                if (max<u){
                    max=u;
                }
            }

        }
        System.out.println(max);
























    }
}
