package CYOA_PURSUIT_HW_WEST_SOLOMON;

import java.util.ArrayList;
import java.util.Scanner;

public class Bully {
    Scanner scanner = new Scanner(System.in);
//    String go0, go1, go2;
    ArrayList<String> fightOrFlight = new ArrayList<>();
    int fof;





    public void startGame() {
        logo();
        instructions();
//        playerName();
        play();

    }

    private void logo() {
        System.out.println("><< ><<        ><<     ><<     ><<           ><<           ><<      ><<     ><<" +
                "\n><    ><<      ><<     ><<     ><<           ><<            ><<    ><<      ><<" +
                "\n><     ><<     ><<     ><<     ><<           ><<             ><< ><<        ><<" +
                "\n><<< ><        ><<     ><<     ><<           ><<               ><<          >< " +
                "\n><     ><<     ><<     ><<     ><<           ><<               ><<          >< " +
                "\n><      ><     ><<     ><<     ><<           ><<               ><<             " +
                "\n><<<< ><<        ><<<<<        ><<<<<<<<     ><<<<<<<<         ><<          ><<");
    }

    private void instructions() {
        System.out.println("A dark day in the outskirts of the big city. Its raining outside and class starts soon.");
        System.out.println("Waiting in line to pass through the metal detectors in the entrance. Someone steps on the back of your shoes.");
        System.out.println("You ignore it, scan your bag. In homeroom your friend is trying to get your attention but to no avail.");
        System.out.println("Your friend sounds like a muffled announcement. Your teacher has not arrived yet");
        System.out.println("BAM!!! An unknown assailant hav bludgeoned you with a world history textbook.");
    }

    public int input() {
        System.out.println("Fight or Flight? Press 1 for Fight or 0 for Flight.");
        do { fof = scanner.nextInt();
            }while (fof != 1 && fof != 0);
        return fof;
    }


    public  void go0(){
        input();
      switch (fof){
            case 1:
                System.out.println("Fight: You see red  and without thinking grab the nearest  thing to your right and throw it at the bully's face. " +
                                "\n *Scuffle ensues*");
                fightOrFlight.add("Fight");
                break;
            case 0:
                System.out.println("Flight: \"You use both arms to cover your noggin and the assailant sees the opportunity to flog you with the textbook. The rest of the class watches with in amusement.");
                fightOrFlight.add("Flight");
                break;
        }



    }

    private  void go1(){
        System.out.println("The substitute teacher walks in the classroom and notices the  harassment going on and tries to make all students pay attention"+
                "\n Fast forward  3 hours class lets out and you are at lunch. You are approached by the same bully. He accuses you of  taking his lunch money"+
                "\n A lunch custodian comes around and tells you to give it back.");
        input();
        switch (fof){
            case 1:
                System.out.println("Fight: You argue with the custodian and empty your pockets to show that you have no money left."+
                        "\nCustodian ignores both of you and continues to clean");
                fightOrFlight.add("Fight");
                break;
            case 0:
                System.out.println("Flight: You steal away avoiding any unneeded confrontation with real school authority figures");
                fightOrFlight.add("Flight");
                break;
        }



    }
    private  void go2(){
        System.out.println("You and the bully see each other outside at recess. He tells you that even though no teachers were around"+
                "\n He will meet you after school to get his money.");
        input();
        switch (fof){
            case 1:
                System.out.println("Fight: You see the opportunity in the moment and snuff the bully. He staggers back. You push him."+
                        "\n You run through his pockets, you take his GameBoy and $5.");
                fightOrFlight.add("Fight");
                break;
            case 0:
                System.out.println("Flight: You quake in fear and run away. You have a momentary respite and gather your thoughts.");
                fightOrFlight.add("Flight");
                break;
        }



    }
    private void play() {
        int fightCount=0;
        int flightCount=0;
        go0();
        go1();
        go2();
//        System.out.println(fightOrFlight);

        for (String prideCount:fightOrFlight) {
           if (prideCount.equals("Fight")){
               fightCount++;
           }else{
               flightCount++;
           }
        }
        if (flightCount > fightCount){
            System.out.println("You have completely forgotten about the events leading up to this."+
                    "\n The bully found you after school and begins to wail on you"+
                    "\n You have earned an achievement: WIMPY!");
        }else {
            System.out.println("You have completely forgotten about the events leading up to dismissal but the school bell rings"+
                    "\n You go home bruised but a winner."+
                    "\n You have earned an achievement: HEFTY HEFTY HEFTY!");
        }
//        if (go0.equals(" ")) {
//            do {
//
//                switch ()
//                input();
//                go0 = fof;
//                System.out.println(go0);
//                if (go0.equals("Fight")) {
//                    System.out.println("You see red  and without thinking grab the nearest  thing to your right and throw it at the bully's face. " +
//                            "\n *Scuffle ensues*");
//
//                    fightOrFlight.add("Fight");
//                    System.out.println(fightOrFlight.indexOf(0));
//                } else if (go0.equals("Flight")){
//                    System.out.println();
//                    fightOrFlight.add("Flight");
//                    System.out.println(fightOrFlight.indexOf(0));
//
//                }
//
//            } while (go2.equals(""));
//        }

    }


}
