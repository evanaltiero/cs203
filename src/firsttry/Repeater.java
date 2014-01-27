    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */
    package firsttry;

    /**
     *
     * @author evanaltiero
     */
    public class Repeater {
    //Fields
        int numRepeats;
    //Constructors
        public Repeater(int num){
            this.numRepeats = num;
        }
    //Methods
        public void say(String word){
            for(int count = this.numRepeats; count > 0; count--){
                System.out.println(word);
                
        }
    }
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Repeater rep = new Repeater(3);
            rep.say("dope");
        }
    }
