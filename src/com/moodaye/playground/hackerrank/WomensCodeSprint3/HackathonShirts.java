package com.moodaye.playground.hackerrank.WomensCodeSprint3;

// Max points = 40; Difficulty = M
/**
 * 1 <= q <= 20
 * 1 <= n,v <= 5 * 10^4    n=number of participants; v=number of vendors
 * 1 <= si <= 10^9         si = t-shirt size
 * 1 <= smallestj <= largestj <= 10^9    vendor size range
 *
 * 
 * Complexity of brute force
 * 10^5 participants  ---> use a counting sort apprach to count the number of t-shirts of each size
 *                         Then - 10^5 operations to get this set.
 *                         
 * 10^5 vendors --> for each vendor - apply t-shirt range to counting sort array and reduce count.  
 *                  Then - worst case - vendor_range * number_of_vendors 
 *                  10^5 * 10^9 = 10^14
 *                  
 *                  So this won't work.
 *                  
 * We can try to remove redundancies from the vendor list - if 2 vendors have the same range or overlapping ranges 
 * they can be reduced to a single range.
 * 
 * To do this - compare the smallest and largest range limits for each vendor. 
 * 					if largest_i < smallest_j  ||  smallest_i > largest_j --> then no overlap
 * 					if smallest_i >= smallest_j && largest_i <= largest_j  ---> then complete overlap (we can ignore i)
 * 					if smallest_i =< smallest_j && largest_i >= largest_j ---> then i overlaps j - place j with i
 * 
 * ---------------------No overlap largest_i < smallest_j or smallest_i > largest_j-----------------
 *  ===========i=============  
 *                              ================j=====================
 *                              
 *                              
 *                              ================i=====================
 *  ===========j=============
 *                 
 * ---------------------Complete overlap-------------------------------------------------------------
 *                        ===i====
 * 			       ==========j=============
 *                 
 *                 ==========i=============
 * 			       ==========j=============
 *
 * ---------------------Complete overlap 2-------------------------------------------------------------
 * 			       ==========i=============
 *                        ===j====
 *                 
 * ---------------------Partial overlap------------------------------------------------------------------
 *            ===========i=============
 *                              ================j=====================
 *                              ================i=====================
 *            ===========j=============
 *            
 *            
 *  Next problem to solve is how to arrange these ranges so that there are minimal comparisons needed.
 *  Use 2 heaps - that support floor and ceiling questions. So when evaluating a range - check the heap_smallest for 
 *  all ranges where largest_i > smallest_heap. This is the subset of ranges where overlap is possible.  
 *  
 *   To confirm overlap
 */
public class HackathonShirts {

	public static void main(String[] args) {
		
		
		

	}
	
	private class Vendor implements Comparable<Vendor>{
		int smallest;
		int largest;
		Vendor(int smallest, int largest){
			this.smallest = smallest;
			this.largest = largest;
		}
		
		//client will have to check largest 
		//after getting this result.  Check will
		//depend on what the client is trying to 
		//ascertain
		@Override
		public int compareTo(Vendor o) {
			return (smallest - o.smallest);
		}
	}

}
