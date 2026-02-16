package estudos.java.estruturado.arraysMultidimensionais;

public class ex2 {
    public static void main(String[] args) {
        int[][] arrayInt = {{1,2}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrayBase: arrayInt){
            System.out.println("\n-----------");
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
