/* Name: Zhiying Tan  */
import java.util.Random;
import java.util.*;

public class ListProblem {
    public static void main(String[] args)
    {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        ArrayList<Integer> list5 = new ArrayList<Integer>();

        ArrayList <ArrayList<Integer>> list = new ArrayList<>();

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);

        //Question 1: Initialize 5 list
        q1(list);

	   /* Question 2: find all the number divisible by 3 numbers
	    find 3 random number within the range from -10 to 10 */
        Random random=new Random();
        q2((random.nextInt(20) -10), (random.nextInt(20) -10), (random.nextInt(20) -10),list);


        /* Question3: print the sum of each list and find the total sum for question 6 */
        int finalsum = q3(list);

        //Question 4: number of distinct value per list
        q4(list);

        //Question 5: merge all 5 lists into 1 list called newList
        ArrayList<Integer> newList = q5(list);

        //question6: print out the global average value of the final list
        System.out.println("\nThe global average value will be: "+finalsum/5000 +"\n");

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
//Question 1

    public static void q1 (ArrayList<ArrayList<Integer>> list) {
        Random random = new Random();
        for(int i =0;i<1000;i++) {
            list.get(0).add((random.nextInt(20000) -10000));
            list.get(1).add((random.nextInt(20000) -10000));
            list.get(2).add((random.nextInt(20000) -10000));
            list.get(3).add((random.nextInt(20000) -10000));
            list.get(4).add((random.nextInt(20000) -10000));

        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
//Question 2
    public static void q2 (int a, int b, int c, ArrayList<ArrayList<Integer>> list) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i=0; i<5;i++) {
            for (int j=0;j<1000;j++) {
                if(list.get(i).get(j)%a!=0 || list.get(i).get(j)%b!=0 || list.get(i).get(j)%c!=0) {
                    temp.add(list.get(i).get(j));
                }
            }
		/* RemoveAll() time complexity = O(n)
		   and time complexity of clear() = O(n) */
            list.get(i).removeAll(temp);
            temp.clear();
        }

    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
//Question 3
// return the overall sum for the calculation of question 6
    public static int q3(ArrayList<ArrayList<Integer>> list)	{
        int sum =0;
        int finalsum  =0;
        for(int i=0; i<5; i++) {
            sum=0;
            for (int j=0; j<list.get(i).size();j++) {
                sum=sum+list.get(i).get(j);
            }
            System.out.println("The sum of list "+(i+1) +" is "+sum);
            finalsum=finalsum+sum;
        }
        System.out.println("\n");
        return finalsum;

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
//Question 4

    public static void q4(ArrayList<ArrayList<Integer>> list) {
        // Since Hashset does not have duplicate value
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0; i<5;i++) {
            for(int j =0;j<list.get(i).size();j++) {
                // duplicate value are unable to be added into this set
                set.add(list.get(i).get(j));
            }
            System.out.println("The number of distinct value of list "+(i+1) +" is "+set.size());
            set.clear();
        }

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
//Question 5

    public static ArrayList<Integer> q5(ArrayList<ArrayList<Integer>> list) {
        // add all the element to list1 and return list1
        ArrayList<Integer> newList = list.get(0);
        for(int i =1; i<5;i++) {
            newList.addAll(list.get(i));
        }

        return newList;

    }









}

