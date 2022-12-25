//package com.algorithm.interviewquestions;
//
//
//import java.util.Arrays;
//
////List of integer where sum of odd number;
//public class demo {
//
//    public static void main(String[] args){
//        int[] arr = {1,4,2,5,6,7,8,3,6,5,3,4};
//        int n= arr.length;
//        int sum = 0;
//        for(int i=0; i<n;i++){
//            if(arr[i]%2 == 0){
//                sum += (arr[i]+1);
//            }
//        }
//        System.out.println(" Sum of number:"+sum);
//        // Java 8
//        int sumofOdd = Arrays.stream(arr).filter(p ->p%2 !=0).sum();
//
//        System.out.println(" Sum of stream:::"+sumofOdd);
//
//        /*
//        * 1. Liberary Management System.
//            Book-> Book name, Book Issues Date, Department_book,
//
//        *
//        *
//
//
//        Employee
//                e_id, e_name, e_salary;
//        Department
//                d_id, d_name, e_id(foreign Key);
//
//                 *
//                 * *  */
//        Q1. Aggigate sum of salary based on department
//                Select Sum(salary) from employee e, department d where e.e_id = d.e_id group by department;
//
//
//        Q2. Find employee from department who is getting highest salary within his department;
//        Q3. Server side pagination, boundary cases like 2 emp getting the same salary in the same department which try {
//            is highest
//
//
//
//    }
//}
