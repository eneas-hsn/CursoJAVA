public class calculate {
    public static void main(String[] args) {
        int x= Integer.parseInt(args[1]);
        int y= Integer.parseInt(args[2]);
        if (args[0].equals("somar")){
            sum(x,y);
        } else if(args[0].equals("menos")){
            minus(x,y);
        } else if (args[0].equals("multi")){
            multi(x,y);
        } else if (args[0].equals("divi")){
            divi(x,y);
        }

    }
    static void sum(int x, int y){
        System.out.println(x+y);
    }
    static void minus(int x,int y){
        System.out.println(x-y);
    }
    static void multi(int x,int y){
        System.out.println(x*y);
    }
    static void divi(int x,int y){
        System.out.println(x/y);
    }
}
