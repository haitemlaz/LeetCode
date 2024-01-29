import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
//        s=s.substring(1,s.length());
        int solution=0;
        Map <Character,Integer> ROM= new HashMap<>();
        ROM.put('I',1);
        ROM.put('V',5);
        ROM.put('X',10);
        ROM.put('L',50);
        ROM.put('C',100);
        ROM.put('D',500);
        ROM.put('M',1000);
        System.out.println(s);

        solution +=ROM.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

                solution +=ROM.get(s.charAt(i));
                System.out.println(s.charAt(i)+""+solution);
                if (s.charAt(i)!='I'){
                    switch (ROM.get(s.charAt(i))-ROM.get(s.charAt(i-1))){
                        case 4:
                        case 9:
                            solution-=2;
                        case 40:
                        case 90:
                            solution-=20;
                        case 400:
                        case 900:
                            solution-=200;
                    }
           }
        }

        return solution;
    }
}