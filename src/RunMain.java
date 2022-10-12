public class RunMain {

    public static void main(String[] args) {
        RunMain rn = new RunMain();
        //1. Length and breadth of a rectangle are 5 and 7 respectively. Write a program
        //to calculate the area and perimeter of the rectangle
        System.out.printf("Rectangle = %d \n", rn.rectangle(5, 7));

        //2. Write a program to calculate the perimeter of a triangle having sides of
        //length 2,3 and 5 units.
        System.out.printf("Perimeter = %d \n", rn.perimeter(2, 3, 5));

        //3. Write a program to add 8 to the number 2345 and then divide it by 3. Now,
        //the modulus of the quotient is taken with 5 and then multiply the resultant
        //value by 5. Display the final result.
        double x = rn.calculate(8, 2345);
        System.out.printf("result = %.2f\n", x);

        //5. Write a program to check if the two numbers 23 and 45 are equal.
        rn.checkNumber(23, 45);

        //6. Write a program to print the power of 7 raised to 5.
        int a = (int) Math.pow(3, 2);
        System.out.println("result: "+a);

        /*7. Assign values of variables 'a' and 'b' as 55 and 70 respectively and then
        check if both the conditions 'a < 50' and 'a < b' are true*/
        boolean m = rn.Assign_Values1();
        System.out.println("result: " + m);
;
        /*8. Now solve the above question to check if atleast one of the conditions 'a <
        50' or 'a < b' is true.*/
        boolean m1 = rn.Assign_Values2();
        System.out.println("result: " + m1);

        /*
        9. If the marks of Robert in three subjects are 78,45 and 62 respectively (each
        out of 100 ), write a program to calculate his total marks and percentage
        marks.
         */
        double x1 = rn.calculateMark(78,45,62);
        System.out.printf("result = %.2f\n", x1);
        double dex = x1/100;
        System.out.printf("result = %.2f/100\n", dex);

        /*
        10. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two
        programs to swap the values of the two variables.
        1 - first program by using a third variable
        2 - second program without using any third variable
        ( Swapping means interchanging the values of the two variables E.g.- If
        entered value of x is 5 and y is 10 then after swapping the value of x and y
        should become 10 and 5 respectively.)
         */
        rn.swap1(6,8);
        rn.swap2(6,8);
        /*
        The total number of students in a class are 90 out of which 45 are boys. If
        50% of the total students secured grade 'A' out of which 20 are boys, then
        write a program to calculate the total number of girls getting grade 'A'
         */
        System.out.println("result: " + rn.totalAStudent());

        /*
        12.Write a program to calculate the sum of the first and the second last digit of
         */
        System.out.println("result: " + rn.sum(5));

    }

    private int rectangle(int a, int b) {
        return (a + b) * 2;
    }

    private int perimeter(int a, int b, int c) {
        return a + b + c;
    }

    private double calculate(double index, double value) {
        return ((index + value) / 3) * 5;
    }

    private void checkNumber(int a, int b) {
        if (a == b)
            System.out.printf("result: yes\n");
        else
            System.out.printf("result: no\n");
    }

    private boolean Assign_Values1() {
        int a = 50;
        int b = 70;
        if (a < 50 && a < b)
            return true;
        else
            return false;
    }

    private boolean Assign_Values2() {
        int a = 50;
        int b = 70;
        if (a < 50 || a < b)
            return true;
        else
            return false;
    }

    private double calculateMark(int a, int b, int c) {
        return (a + b + c);
    }

    private void swap1(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("result : a = %d, b = %d\n", a, b);
    }

    private void swap2(int a, int b) {
        a += b;
        b = a - b;
        a = a - b;
        System.out.printf("result : a = %d, b = %d\n", a, b);
    }

    private int totalAStudent() {
        return (90 * 50 / 100) - 20;
    }

    private int sum(int a) {
        int sums = 0;
        for (int i = 1; i <= 5; i++) {

            if (i == 1 || i == 4) {
                sums += i;
            }
        }
        return sums;
    }

}
