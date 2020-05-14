public class LargeOfThreeNos {
    public static void main(String[] args) {
        int no1=50;
        int no2=50;
        int no3=1;

        if(no1>no2 && no1>no3)
            System.out.println(no1);
        else if(no2>no3)
            System.out.println(no2);
        else
            System.out.println(no3);


    }
}
