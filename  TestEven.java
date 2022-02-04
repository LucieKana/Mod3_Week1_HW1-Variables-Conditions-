public class TestEven{
    public static void main(String[] args){
        int num = 96;
        if(num%2!=0){
            System.out.println(num + " is odd");
        }
        else if(num%2 == 0 & num>=2 & num<=5)|(num%2 == 0 & num>20){
           System.out.println("Not cool");
        }
        else if(num%2 == 0 & num>=6 & num<=20){
            System.out.println("cool")
        }
    }
}