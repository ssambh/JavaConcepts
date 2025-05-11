package programs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class TestClass {


	public static void main(String[] args) {
		ImportantPrograms ip = new ImportantPrograms();
		int num = 5;
		int[] arr = {1,3,4,6,9};
		int target = 3;
		ceiling(arr,target);
			
	}
	
	public static void ceiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]<target) {
				start = mid+1;
			}
			else if(arr[mid] >= target) {
				end = mid-1;
			}
		}
		System.out.println(start);
	}
	
	public static int ruleSet(String[][] str, String ruleKey, String ruleValue) {
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			if(ruleKey=="Type" && str[i][0]==ruleValue) {
				count++;
			}
			else if(ruleKey=="Color" && str[i][1]==ruleValue) {
				count++;
			}
			
			else if(ruleKey=="Name" && str[i][2] == ruleValue) {
				count++;
			}
		}
		return count;
	}
		
		

	public static int[] reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public static void vowelOrConstant(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.println(s.charAt(i) + " --> Vowel");
			} else {
				System.out.println(s.charAt(i) + "--> Consonent");
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			System.out.println("Neither Prime nor composite");
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void reverseNum(int n) {
		int num2 = 0;
		while (n > 0) {
			num2 = num2 * 10;
			int remainder = n % 10;
			n = n / 10;
			num2 = num2 + remainder;

		}
		System.out.println(num2);
	}

	public static void findNum(int n) {
		int count = 0;
		while (n > 0) {
			int remainder = n % 10;
			n = n / 10;
			if (remainder == 7) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void findMax(int[] arr) {
		int maxNum = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
				maxIndex = i + 1;
			}
		}
		System.out.println("Maximum Number is: " + maxNum);
		System.out.println("Maximum number index is: " + maxIndex);
	}

	// trim() can also be used but strip() uses unicode standard
	public static void removeLeadingAndTrailingSpace(String s) {
		String s1 = s.strip();
		System.out.println(s1);
	}

	public static void removeWhiteSpace(String s) {
		String s1 = s.replace(" ", "");
		String s2 = s.replaceAll("([a,e,i,o,u])", "");

		System.out.println(s1);
		System.out.println(s2);
	}

	public static void pallindrome(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		if (s1.equals(s)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;

		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < n - 2; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public static void primeNumberCheck(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime Number");
	}

	public static int[] bubble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int a = -1;
		int columnLen = matrix[0].length;
		for (int i = 0; i < matrix.length; i++) {
			if (target < matrix[i][columnLen - 1]) {
				a = i;
				break;
			}
		}

		if (a == -1) {
			return false;
		}

		for (int i = 0; i < columnLen; i++) {
			if (matrix[a][i] == target) {
				return true;
			}
		}
		return false;
	}

	public static int[] rotate(int[] arr, int a) {

		while (a > 0) {
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
			a--;
		}

		return arr;

	}

	public static boolean recur(String s, int l, int r) {

		if (l >= r) {
			return true;
		}
		if (s.charAt(l) != s.charAt(r)) {
			return false;
		}
		return recur(s, l + 1, r - 1);

	}

	public static void mergeSort(int[] arr) {
		int len = arr.length;

		if (len < 2) {
			return;
		}

		int mid = len / 2;
		int[] leftHalf = new int[mid];
		int[] rightHalf = new int[len - mid];

		for (int i = 0; i < mid; i++) {
			leftHalf[i] = arr[i];
		}
		for (int i = mid; i < len; i++) {
			rightHalf[i - mid] = arr[i];
		}

		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(arr, leftHalf, rightHalf);
	}

	public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {

		int leftLen = leftHalf.length;
		int rightLen = rightHalf.length;

		int i = 0, j = 0, k = 0;
		while (i < leftLen && j < rightLen) {
			if (leftHalf[i] < rightHalf[j]) {
				arr[k] = leftHalf[i];
				i++;
			} else {
				arr[k] = rightHalf[j];
				j++;
			}
			k++;
		}

		while (i < leftLen) {
			arr[k] = leftHalf[i];
			i++;
			k++;
		}
		while (j < rightLen) {
			arr[k] = rightHalf[j];
			j++;
			k++;
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static int[] swap(int[] arr, int l, int h) {
		int n = arr[l];
		arr[l] = arr[h];
		arr[h] = n;
		return arr;
	}

	public static void binarySearch() {
		int[] arr = { 2, 4, 5, 7, 99, 123, 234, 543, 567, 987 };
		int num = 99;
		int ind = 0;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == num) {
				ind = mid;
				break;
			}

			else if (arr[mid] < num) {
				left = mid;
			}

			else if (arr[mid] > num) {
				right = mid;
			}
		}
		System.out.println(ind);
	}

// To find maximum sub contiguous subarray.
	public static void cadanesAlgo() {
		int[] arr = { 2, -2, 5, -3, 0, 4, 0, 3, -5 };

		int current = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			current += arr[i];
			if (current < arr[i]) {
				current = arr[i];
			} else if (current > max) {
				max = current;
			}
		}
		System.out.println(max);
	}

	public static void reverseString(String s) {
		char[] arr = s.toCharArray();

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	public static void swapTwoNumbersWithoutVariable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
	}
}
