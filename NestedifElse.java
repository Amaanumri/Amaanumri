public class NestedifElse {
    public static void main(String args[]){
        int age = 20;
        String gender = "Male";
        boolean isregistered = true;
        if(age > 18){
        System.out.println("You are Eligible");
        if(gender == "male"){
        System.out.println("you are invited");
        if(isregistered==true){
            System.out.println("you have account");
        }
        }else{
            System.out.println("you are not invited");
        }
        }else{
            System.out.println("You are not eligible");
        }
    }
}
