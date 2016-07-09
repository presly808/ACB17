package ua.artcode.week2;

/**
 * Created by serhii on 02.07.16.
 */
public class _02LoopIntro {

    public static void main(String[] args) {


        // repeat -> one action
        // start,step,isEnd,end

        // start, condition, step

        // while - condition then action

        int i = 0;// start
        while (i < 10) {// exit condition
            System.out.println(i);// action
            i++;// step
        }

        // k = 0,
        // 0 < 10, action(prinln), k = 0 + 1,
        // 1 < 10, action, k = 1 + 1
        // 2 < 10, action, k = 2 + 1
        // 3 < 10, action, k = 3 + 1
        for(int k = 0; k < 10; k = k + 1){
            System.out.println(k);
            //
        }

        // action - condition
        int j = -1;
        do {
            j--;
            System.out.print(j + " ");
        } while (j > 0);





        //task1 0,2,4,6,8...98,100

        // 100 50 25 12 6 3 1 0

        // 0,1,2,3,4,5...50,49,48...0

        // task1 write all elements into arr

        // offset,length
        // 5, 10
        // 5,6,7,8,9,10,11,12,13,14,15

        // 10 ,3
        // 10,11,12


        // offset, length
        // 5,3
        // 5,4,3

        // while(<condition>){
        //
        //
        // }

    }

}
