package com.Trinnect.FRQ201503;
import java.util.*;

public class SparseArray
{
 /** The number of rows and columns in the sparse array. */
 private int numRows;
 private int numCols;
 /** The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
* list in no particular order. Each non-zero element is represented by exactly one entry in the list.
 */
 private List<SparseArrayEntry> entries;
 /** Constructs an empty SparseArray. */
 public SparseArray()
 { entries = new ArrayList<SparseArrayEntry>(); }
 /** Returns the number of rows in the sparse array. */
 public int getNumRows()
 { return numRows; }
 /** Returns the number of columns in the sparse array. */
 public int getNumCols()
 { return numCols; }
 /** Returns the value of the element at row index row and column index col in the sparse array.
* Precondition: 0  row < getNumRows()
 * 0  col < getNumCols()
 */
 public int getValueAt(int row, int col)
 { /* to be implemented in part (a) */ 
	 for(SparseArrayEntry x : entries)
		 if (x.getCol() == col && x.getRow() == row)
		 {
			 return x.getValue();
		 }
	 return 0;
		 
 }
 /** Removes the column col from the sparse array.
* Precondition: 0  col < getNumCols()
 */
 public void removeColumn(int col)
 { /* to be implemented in part (b) */ 
	this.numCols--;
	
	ArrayList<SparseArrayEntry> toRemove = new ArrayList<>();
	ArrayList<SparseArrayEntry> toReplace = new ArrayList<>();
	for(SparseArrayEntry x : entries)
			if(x.getCol() == col )
			{
				toRemove.add(x);
				
			}
			else if(x.getCol() > col)
			{
				toRemove.add(x);
				toReplace.add(new SparseArrayEntry(x.getRow(), x.getCol()-1, x.getValue())
			}
	for(SparseArrayEntry x : toRemove)
		entries.remove(x);
	
	for(SparseArrayEntry x : toReplace)
		entries.add(x);
 }
 // There may be instance variables, constructors, and methods that are not shown.
} 