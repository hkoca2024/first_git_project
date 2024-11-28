package day01;

public class HelloWorld {


        public int myAtoi(String s) {
            // Your code here
            if (s == null || s.length() == 0) { return 0;} // Boş string kontrolü
            int start=0;
            int end=s.length();
            boolean negative=false;
            long result=0;
            if(s.charAt(0)=='-'){
                negative=true;
                start=1;
            }
            for(int i=start;i<end;i++){
                char c=s.charAt(i);
                if(c>='0'&&c<='9'){
                    int digit=c-'0';
                    result=result*10+digit;
                    if(negative&&-result<Integer.MIN_VALUE){
                        return Integer.MIN_VALUE ;
                    }
                    if(!negative&&result>Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                }else{
                    return 0;
                }
            }

            if(negative){
                result=-result;
            }


            return (int) result;
        }
    }
public static void main(String[] args) {
     HelloWorld sol= new HelloWorld();
    String s = "1231231231311133";
    int result = HelloWorld.myAtoi(s);
    System.out.println("The integer value is: " + result); // Outputs: 2147483647 }

}
