// findUnique(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2.0
// findUnique(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

//note: From the output sample, it is safe to say the output type is double
// * Since all values are equal except for one, if the repeating value is known and compared to the rest of the values 
// the uniques number would be easly identified

// > PLAN
// * First find the repeating value
//     - compare the first two values of the array if a match is found, that's the repeating value
//     - if a match is not found, check the third value, if it matches the first value, return the second and vice cersa
// * If the repeating value is found, compare the repeating value with the rest of the array to find a mismatch
// * return the mismatch

public class Solution_1 {
    public static double findUnique(double arr[]){
        // > FINDING THE REPEATING VALUE
        // * creating a variable to hold the repeating value
        double repeatingNumber;

        // * Checking the first two values
        if(arr[0] == arr[1])
            repeatingNumber = arr[0]; // or repeatingNumber = arr[1];

        // * if the first two mismatch, check the first and third 
        else if(arr[0] == arr[2])
            repeatingNumber = arr[0]; // or repeatingNumber = arr[2];

        // if the first and third also mismatch, then the first is actually the unique number
        else 
            return arr[0];

        //COMPARING THE REPEATING VALUE TO THE ARRAY TO FIND A MISMATCH
        for (double value : arr) {
            //if mismatch found
            if(value != repeatingNumber)
                //return value
                return value;
        }

        return 0;
    }
    public static void main(String[] args){
        System.out.println(findUnique(new double[]{ 1, 2, 1, 1, 1, 1 })); // => 2.0
        System.out.println(findUnique(new double[]{ 0, 0, 0.55, 0, 0 })); // => 0.55
    }
}