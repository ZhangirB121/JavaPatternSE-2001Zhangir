package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StalkerNetwork stalkerNetwork = new StalkerNetwork();
        Scanner sc = new Scanner(System.in);
        String stalkerName;
        System.out.print("What's your name: ");
        stalkerName=sc.next();

        Stalker someStalker = new Stalker(stalkerName);
        stalkerNetwork.registerStalker(someStalker);

        stalkerNetwork.addEvent("\n1) You will have to finish off one handsome man — he is one of the main bandits. \nRecently, the bandits on his orders intercepted my courier and gutted him to zero, and with those who touch my people, the conversation is short… \nIn general, if you do the job — I will not remain in debt. So, are you taking it?");
        stalkerNetwork.addEvent("\n\n2) There are animals developed nearby, it would be necessary to calm her somehow, well, you understand");
        stalkerNetwork.addEvent("\n\n3) One influential person behind the zone needs an artifact \"Medusa\", please bring it, of course for a good reward");

        System.out.print("\nChoose a task: ");
        int choice=sc.nextInt();

        if(choice == 1){
            stalkerNetwork.removeEvent("\n1) You will have to finish off one handsome man — he is one of the main bandits. \nRecently, the bandits on his orders intercepted my courier and gutted him to zero, and with those who touch my people, the conversation is short… \nIn general, if you do the job — I will not remain in debt. So, are you taking it?");
        }
        else if(choice == 2){
            stalkerNetwork.removeEvent("\n\n2) There are animals developed nearby, it would be necessary to calm her somehow, well, you understand");

        }

        else if(choice == 3){
            stalkerNetwork.removeEvent("\n\n3) One influential person behind the zone needs an artifact \"Medusa\", please bring it, of course for a good reward");
        } else{
            System.out.println("There is no such task");
        }
    }
}
