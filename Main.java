import java.util.*;

public class Main {

    //1
    public static void longestWord() {
        String[] arr = {"cat", "dog", "red", "is", "am"};
        ArrayList arr2 = new ArrayList();
        int j =1;
        for (int i = 0; i <arr.length ; i++) {
        if(arr[i].length() >arr[j].length()){
            arr2.add(arr[i]);
        } else if (arr[i].length() == arr[j].length()) {
            arr2.add(arr[i]);
        }
        }
        System.out.println(arr2);
    }

    //2
    public static void occurrences(){
        int[] arrNum = {1,1,1,3,3,5};
        int c1,c2,c3;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        for (int n:arrNum) {
            if (n ==1){
                c1++;
            } else if (n ==3) {
                c2++;
            } else if (n == 9) {
                c3++;
            }
        }
        System.out.println("3 occurs "+c2+" times");
        System.out.println("1 occurs "+c1+" times");
        System.out.println("9 occurs "+c3+" times");

    }


    //3
    public static void largestNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of large elements");
        int k = input.nextInt();
        Integer [] numbers = new Integer []{1,4,17,7,25,3,100};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(k+" Largest elements of the said array are:");
        for (int i = 0; i < k; i++) {
            System.out.print(numbers[i]+" ");

        }
        System.out.println(" ");

    }




    //4
    public static void reverse(){
        int[] arr = {5,4,3,2,1};
        int l = arr.length-1;
        int temp1;
        System.out.println("Reversed array: ");
        for (int i = 0; i < arr.length ; i++) {
            if (l == i){
                break;
            }
            temp1 = arr[i];
            arr[i] = arr[l];
            arr[l] = temp1;
            l--;
            if (l == i){
                break;
            }
        }
        for (int n :arr) {
            System.out.print(n+" ");
        }
        System.out.println(" ");



    }
    //5
    public static void menu(){
        Scanner input = new Scanner(System.in);
        int n;
        String element = "";
        ArrayList<String> array = new ArrayList<String>();
        do {
            System.out.println("|--------------------------------------|");
            System.out.println("| 1. Accept elements of an array       |");
            System.out.println("|--------------------------------------|");
            System.out.println("| 2. Display elements of an array      |");
            System.out.println("|--------------------------------------|");
            System.out.println("| 3. search the element within array   |");
            System.out.println("|--------------------------------------|");
            System.out.println("| 4. sort the array                    |");
            System.out.println("|--------------------------------------|");
            System.out.println("| 5. to stop                           |");
            System.out.println("|--------------------------------------|");
            n = input.nextInt();

            switch (n){
                case 1:
                    element = input.nextLine();
                    System.out.println("<------------------------------------------------------------>");
                    System.out.println(" Enter an element ");
                    System.out.println("<------------------------------------------------------------>");
                    element = input.nextLine();
                    array.add(element);

                    break;
                case 2:
                    System.out.println("<------------------------------------------------------------>");
                    System.out.println(array);
                    System.out.println("<------------------------------------------------------------>");
                    break;
                case 3:
                    String search = input.nextLine();
                    System.out.println("<------------------------------------------------------------>");
                    System.out.println(" Type to search for the element in the array");
                    System.out.println("<------------------------------------------------------------>");
                    search = input.nextLine();
                    for (String s :array) {
                        if (s.equalsIgnoreCase(search)){
                            System.out.println("<------------------------------------------------------------>");
                            System.out.println(" Element: "+array.get(search.indexOf(s))+" exists in the array!");
                            System.out.println("<------------------------------------------------------------>");
                        }

                        else {
                            System.out.println("<------------------------------------------------------------>");
                            System.out.println("Element: " + search + " doesn't exist");
                            System.out.println("<------------------------------------------------------------>");
                        }
                    }
                    break;
                case 4: Collections.sort(array);
                    break;
                case 5:

            }
        } while (n != 5);
        System.out.println("Goodbye!");

    }



    //6
    public static void rand(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minimum  value of the range");
        int min = input.nextInt();
        System.out.println("Enter the maximum  value of the range");
        int max = input.nextInt();
        System.out.println("Enter the number of random numbers to generate");
        int rand = input.nextInt();
        int count = 0;
        int range = max-min-1;

        ArrayList<Integer> Array = new ArrayList<Integer>();

        for (int i = min; i <= max ; i++) {
            if ( count < rand ) {
                Array.add((int)((Math.random() * range)+min));
                count++;
            }
        }
        for (int i = 0; i < Array.size(); i++) {
            if (i<Array.size()-1) {
                System.out.print(Array.get(i) + "-");
            }
            else if (i == Array.size()-1){
                System.out.print(Array.get(i));
            }
        }
        System.out.println(" ");
    }

    //7

    public static void password(String pass){
        if(pass.matches("(.*[a-z].*)")){
            if (pass.matches(("(^(?=.*[@#$%^&])(?=\\S+$).{8,}$)"))){
                if (pass.length() >= 8) {
                    System.out.println("password is strong");
                } else if (pass.length() >= 6) {
                    System.out.println("password is ok");
                } else if (pass.isEmpty()) {
                    System.out.println("password is weak");
                }
            }
            else System.out.println("Password is weak");

        }
        else System.out.println("Password is weak");



    }




    //8

    public static void fib(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int nTerms = input.nextInt();
        int f,f0,f1;
        f0 = 0;
        f1 = 1;
        System.out.print(f0+" "+f1);
        for (int i = 2; i <nTerms ; i++) {
            f = f0+f1;
            f0 =f1;
            f1 = f;
            System.out.print(" "+f);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1
        longestWord();

        //2
        occurrences();

        //3
        largestNumber();

        //4
        reverse();

        //5
        menu();

        //6
        rand();

        //7
        System.out.println("Input password");
        String p = input.nextLine();
        password(p);

        //8
        fib();





    }
}