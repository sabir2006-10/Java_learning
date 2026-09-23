import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] marks = new int[5];
        for(int i=0;i<marks.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the marks of student "+(i+1));
            marks[i] = sc.nextInt();
        }

        int totalmarks = total(marks);
       System.out.println("Total marks: " + totalmarks);  

       float averagemarks = average(totalmarks);
       System.out.println("average marks: " + averagemarks);  

       if(averagemarks>90){
        System.out.println("grade A");
       }
       else if(averagemarks>80){
        System.out.println("grade B");
       }
       else if(averagemarks>70){
        System.out.println("grade C");
       }
       else{
        System.out.println("fail");
       }
        }

        static int total(int[] marks){
        int tot=0;
        for(int i=0;i<marks.length;i++){
            tot=tot+marks[i];
        }
        return tot;
    }

    static float average(int totalmarks){
        return (float)totalmarks/5;
    }

}

