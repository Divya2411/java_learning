public class MultiLevelInheritance {

        public static void main(String[] args) {
            multi obj = new multi();
            obj.num1 = 5;
            obj.num2 = 4;
            obj.sum();
            System.out.println(obj.result);
            obj.sub();
            System.out.println(obj.result);
            obj.multi();
            System.out.println(obj.result);
        }
    }
    class Add2 {
        int num1,num2,result;
        public void sum(){
            result = num1 + num2;

        }

    }
    class Sub extends Add2 {
        public void sub(){
            result = num1-num2;

        }

    }
class multi extends Sub {
    public void multi(){
        result = num1*num2;

    }

}



