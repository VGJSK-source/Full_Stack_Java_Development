public class StringCase {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            args[i]=Character.toUpperCase(args[i].charAt(0))+"" + Character.toLowerCase(args[i].charAt(1))+"" + Character.toLowerCase(args[i].charAt(2)) +args[i].substring(3).toLowerCase();
            System.out.println(args[i]);
        }
        
    }
    
}
