import java.util.Scanner;
public class Data_Compression_Size_Reduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fileSize = sc.nextInt();
        int compressionCycles = sc.nextInt();

        int CompressedSize  = fileSize>> compressionCycles;

        System.out.println(CompressedSize);
    }
}
