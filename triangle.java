public class triangle {

    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        for(int i = 0; i < height; i++)
        {
            for(int x = 0; x < (height + i); x++)
            {
                if(x < (height - i - 1))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }
}