public class StringFormat{
    public static void main(String[] args){
        int digit = 4;
        for(int i = 0; i<10; i++){
            String data = String.format("% "+digit+"d", i);
            System.out.print(data);
        }
    }
}

//out :    0   1   2   3   4   5   6   7   8   9