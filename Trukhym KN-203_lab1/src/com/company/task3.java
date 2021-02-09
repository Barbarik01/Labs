public class task3 {
    public static void main(String[] args) {
        if(args.length < 4)
        {
            System.out.print("\tArguments : ");
            for(int i = 0; i < args.length;i++) {
                System.out.print((i+1) + ")" + args[i] + "  ") ;
            }
        }
    }
}