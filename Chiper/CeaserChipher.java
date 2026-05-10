import java.util.Scanner;

public class CeaserChipher{

    public static void main(String [] args){

    Scanner obtain = new Scanner (System.in);
    System.out.print("Enter The Word To Be Encoded: ");
    String wordCollected = obtain.nextLine();

    System.out.print("Enter The Key Number: ");
    int keyNumber = obtain.nextInt();

    String encryptionword ="";
    int count = 0;
    String decryptionword = "";
    


    
    for(count = 0; count < wordCollected.length(); count++){
    
    char alphabet = wordCollected.charAt(count);

    int encrypt = alphabet + keyNumber;

    char encryptword = (char) encrypt;
    
    encryptionword = encryptionword + encryptword;

    int decrypt = encryptword  - keyNumber;
    
    char decryptword = (char) decrypt; 

        decryptionword = decryptionword + decryptword;
        
   

 

        }
   System.out.printf("%nThe Encrepted Word: %s%n" ,encryptionword);



System.out.printf("%nThe Decrypted Word: %s%n" ,decryptionword);



    }

}
