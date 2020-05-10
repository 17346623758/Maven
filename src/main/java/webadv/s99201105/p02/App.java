package webadv.s99201105.p02;

import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //if (args.length < 1) {
         //   System.err.println("Please provide an input!");
          //  System.exit(0);
       // }
        String ac="1733662";
        String password1="96cae35ce8a9b0244178bf28e4966c2ce1b8385723a96a6b838858cdd6ca0a1e"; 
        System.out.println("请输入账号:");
        Scanner scanner = new Scanner(System.in);
        String account=scanner.nextLine();
        System.out.println("请输入密码:");
        String password=scanner.nextLine();
        if(ac.equals(account)&&password1.equals(sha256hex(password))){
	System.out.println("密码正确");
}else{
	System.out.println("密码错误");
}
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}


