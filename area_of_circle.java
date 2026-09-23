import java.util.*;

public class area_of_circle {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in); 
       float pie = 3.1416f; 
       int rad = sc.nextInt();
       float area = (int)(pie * rad * rad);
       System.out.println(area);

    }
    
}
