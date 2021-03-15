import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 

public class BubbleSort{
    // Integer [] nums;
    ArrayList<Integer> nums;
    public BubbleSort(String pathname){
        try{
            
            File f = new File(pathname);
            Scanner s = new Scanner(f);
            nums = new ArrayList<>();
            while(s.hasNextLine()){
                int number = s.nextInt();
                // nums.add(s.nextInt());
                nums.add(number);
                // say(number);
            }   
            s.close();
            int numsSize = nums.size();
            bubbleSort(numsSize);
            // for(int i =1; i<=counter; i++){
            //     say("The number is "+ nums[i]+" at i:"+i);
            // }
            // bubbleSort(counter);
            // for(int i =1; i<=counter; i++){
            //     say("The number is "+ nums[i]+" at i:"+i);
            // }
        }catch(FileNotFoundException fe){
            say("error is :" +fe);
        }

    }

    // see if you want to change the arrayList as an input
    public void bubbleSort(int arrayLength){
        // say("Arraylength is "+ arrayLength);
        for(int i = 0; i<= arrayLength-2; i++){
            for(int j = arrayLength-1; j>=i+1; j--){
                int a = nums.get(j);
                int b = nums.get(j-1);
                if(a<b){
                    Collections.swap(nums, j-1, j);
                }
            }
        }
        say("After sorting");
        for(var d: nums){
            say("Number is "+ d);
        }
            // for(int i =1; i<=arrayLength; i++){
            //     say("The number is "+ nums[i]+" at i:"+i);
            // }

    }

    public static void say(Object o){
        System.out.println(o);
    }

    public static void main(String[] args) throws IOException {
            new BubbleSort("test1.txt");
        
    }
}