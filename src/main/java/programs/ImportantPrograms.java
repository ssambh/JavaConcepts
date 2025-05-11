package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ImportantPrograms {
	
	//Order agnostic binary search, where the order of the array is not known
	public static int agnosticBinarySearch(int[] arr, int target) {
		boolean isAscending = arr[0] < arr[arr.length-1];
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(target == arr[mid]) {
				return mid;
			}
			
			if(isAscending) {
				if(target > arr[mid]) {
					start = mid+1;
				}
				else {
					end= mid-1;
				}
			}
			else {
				if(target > arr[mid]) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
		return -1;
	}
	
	/* Binary Search algorithm - The idea is to minimize the search space until the element is found, or
	 * start becomes greater than end(meaning the element is not found) where our while loop condition is
	 * violated. If it is found then it is somewhere in the search space and the answer will be the "mid"
	 * element as per the checks we put.
	 */
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(target < arr[mid]) {
				end = mid-1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	//Finding the peak in the mountain array. Shouldn't contain duplicate elements
	public static void findingPeak(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]<arr[mid+1]) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		System.out.println(arr[start]);
	}
	
	//Finding a number in an infinite int array. Might throw indexOutOfBound for a finite array.
	public static void searchInfinite(int[] arr, int target) {
		int start = 0;
		int end = start+1;
		int index = Integer.MIN_VALUE;
		
		while(target > arr[end]) {
			start = end+1;
			end = end + start*2;
		}
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target < arr[mid]) {
				end = mid-1;
			}
			else if(target > arr[mid]) {
				start = mid+1;
			}
			else {
				index = mid;
				break;
			}
		}
		System.out.println(index);
	}
	
	// Using binary search but differentiating on the  findStart boolean value.
	public static void firstAndLastOccurance(int[] arr, int target, boolean findStart) {
		int first = Integer.MIN_VALUE;
		int last = Integer.MAX_VALUE;
		
		int p1 = 0;
		int p2 = arr.length-1;
			while(p1<=p2) {
				int mid = p1 + (p2-p1)/2;
				
				if(target < arr[mid]) {
					p2 = mid-1;
				}
				else if(target > arr[mid]) {
					p1 = mid+1;
				}
				else {
					if(findStart) {
						first = mid; 
						p2 = mid-1;	
					}
					else {
						last = mid; 
						p1 = mid+1;
					}			
				}
			}
			System.out.println(first);
			System.out.println(last);
	}
	
	
	/* Ceiling value is the number in the array which is >= the target number. The idea is to either return
	 * the target if it is found(binary search) but return the next number in case the target is not found
	 * so if the target element is not found, then our while condition will always be violated and start will
	 * always be greated than end in that case, so we return the element at start as it is the next greater
	 * number than our target. 
	 */
	public static void ceilingValue(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int min = 0;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target<=arr[mid]) {
				min = arr[mid];
				end = mid-1;
			}
			else if(target >= arr[mid]) {
				start = mid+1;
			}
		}
		
		System.out.println(min);
	}
	
	public static void floorValue(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int min = 0;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target>=arr[mid]) {
				min = arr[mid];
				start = mid+1;
			}
			else if(target <=arr[mid]) {
				end = mid-1;	
			}
		}
		System.out.println(min);
	}
	
	//This program finds the sum of the elements present in the diagonals in 2D array.
	public static int diagonalSum(int[][] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i==j) {
					sum += arr[i][j] + arr[i][arr[i].length-i-1];
				}
			}
		}
		if(arr.length%2==1) {
			int num = arr[arr.length/2][arr.length/2];
			sum = sum- num;
		}
		
		return sum;
	}
	
	//This program reverses each row and then invert it's values(0 tp 1 or 1 to 0) of a 2D array
	public static void flipAndInvertArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			int p1 = 0;
			int p2 = arr[i].length-1;
			while(p1<p2) {
				int temp = arr[i][p1];
				arr[i][p1] = arr[i][p2];
				arr[i][p2] = temp;
				
				p1++;
				p2--;
			}
			
			int temp = 0;
			
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==0) {
					arr[i][j] = 1;
					continue;
				}
				if(arr[i][j]==1) {
					arr[i][j] = 0;
					continue;
				}
			}
		}
		
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	//Pangram means the sentence has all the english alphabets
	public static boolean isPangram(String s) {
		for(char c='a'; c<='z'; c++) {
			if(s.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}

	public boolean isomorphicStrings(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		Map<Character, Boolean> map1 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if (map.containsKey(a)) {
				if (map.get(a) != b) {
					return false;
				}
			} else {
				if (map1.containsKey(b)) {
					return false;
				} else {
					map.put(a, b);
					map1.put(b, true);
				}
			}
		}
		return true;
	}

	public int[] fibonacci(int k) {
		int[] arr = new int[k];

		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr;
	}

	public Stack<Integer> sumOf2(int arr[], int sum, int i, int j) {
		int m = i;
		int n = j;
		Stack<Integer> stack = new Stack<>();
		while (i < j) {
			if (arr[i] + arr[j] > sum) {
				j--;
			}
			if (arr[i] + arr[j] < sum) {
				i++;
			} else {
				stack.push(arr[i]);
				stack.push(arr[j]);
				break;
			}
		}
		return stack;
	}

	public Stack<Integer> sumOf3(int arr[], int sum) {

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length - 2; i++) {
			Stack<Integer> st = sumOf2(arr, sum - arr[i], i + 1, arr.length - 1);
			if (st.size() > 0) {
				if (arr[i] + st.firstElement() + st.lastElement() == sum) {
					stack = st;
					stack.push(arr[i]);
					return stack;
				}
			}

		}
		return stack;
	}

	public String decimalToBinary(int decimalNum) {
		StringBuilder s = new StringBuilder();
		while (decimalNum != 0) {
			s = s.append(decimalNum % 2);
			decimalNum = decimalNum / 2;
		}
		return s.reverse().toString();
	}

	public int binaryToDecimal(String s) {
		int decimalNum = 0;
		int n = 1;

		for (int i = s.length() - 1; i >= 0; i--) {
			decimalNum = decimalNum + (n * Character.getNumericValue(s.charAt(i)));
			n = n * 2;
		}
		return decimalNum;
	}

	// To find maximum sum contiguous subarray.
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
}
