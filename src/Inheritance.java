public class Inheritance {
    public static void main(String[] args) {
        AddSub obj = new AddSub();
        obj.num1 = 5;
        obj.num2 = 4;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
    }
}
    class Add1 {
        int num1,num2,result;
        public void sum(){
            result = num1 + num2;

        }

    }
    class AddSub extends Add1{
        public void sub(){
            result = num1-num2;

        }

    }


