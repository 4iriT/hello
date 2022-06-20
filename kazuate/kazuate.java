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

            if(x != y){
                if(x < y){
                    System.out.println("正解より大きいです");
                    if((x+20) < y){
                        System.out.println("20以上離れています");
                    }
                }
                else{
                    System.out.println("正解より小さいです");
                    if((x-20) > y){
                        System.out.println("20以上離れています");
                    }
                }
            }

            else{
                    System.out.println("正解です！");
                    break;              
            }   

            if(i<4){
                System.err.println("あと" + (4-i) + "回\n");  
            }else{
                System.err.println("\nゲームオーバー！\n");  
            }           
        }             
    }
}
