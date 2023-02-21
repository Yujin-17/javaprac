package chap01_1;

class Exercise6_18 {

    static boolean isNumber(String str) {

        char tmp;
        for(int i = 0; i <str.length() ; i++){
            tmp = str.charAt(i);
            if(Character.isDigit(tmp) == false){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false
