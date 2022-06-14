import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.crypto.AEADBadTagException;

public class kazuate {
    public static void main(String[] args){
        
        int x = 97;
        System.out.println("数当てゲームをしましょう!\n");
        for(int i=0; i<5; i++){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            System.out.println("予想を入力してください:");
            int y=-1;

            while(y>99||y<10){
                try {
                    line = br.readLine();
                    y = Integer.parseInt(line);
                    if(y>99||y<10){
                        System.out.println("10から99までの整数を入力してください");
                    }
                }  catch (IOException e) {
                    System.err.println("10から99までの整数を入力してください");
                }  catch (NumberFormatException e) {
                    System.err.println("10から99までの整数を入力してください");
                }  
            }                       
            
            if(x>(y+20)){
                System.out.println("20以上離れています");  
            }
            else{
                if(x != y){
                    System.out.println((y - x) + "離れています\n");
                }
                else{
                    if(x == y){
                        System.out.println("正解です！");
                        break;
                    }
                }
            }   
            if(i<4){
                System.err.println("あと" + (4-i) + "回\n");  
            }else{
                System.err.println("\nゲームオーバー！\n");  
            }
            
        }
               

    }

}
