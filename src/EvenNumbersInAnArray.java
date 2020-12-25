public class EvenNumbersInAnArray{

    public static void main(String args[])
    {
        String names[]= {"John", "Jane", "Kuniko", "Shuichi"};
        int marks[]= {78, 80, 79, 81};
        System.out.println("Even Numbers");
        for (int i =0; i<marks.length;i++)
        {
            if(marks[i]%2==0)
            {
                System.out.println(marks[i] + " " + names[i]);
            }
        }
    }
}