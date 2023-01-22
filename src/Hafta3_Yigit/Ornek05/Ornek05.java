package Hafta3_Yigit.Ornek05;
/**
 *
 * @author bugra
 */
public class Ornek05 {
    public static void main(String[] args) {
        InfixToPostfix itp = new InfixToPostfix();
        System.out.println(itp.convertToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
