package com.nt.algorithm;

public class ArrayStructures {
	private int[] theArray = new int[50];
	private int arraySize = 10;
   // here generating random values in array
	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}
	// here printing values of an array
	public void printArray() {
		System.out.println("---------- ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("---------- ");
		}
	}
// here returning values on particular index
	public int getIndex(int index) {
		if (index < arraySize)
			return theArray[index];
		return 0;
	}
// here searching values on particular indexes
	public boolean doesArrayContainThisValue(int searchValue) {
		boolean valueInArray = false;
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == searchValue) {
				valueInArray = true;
			}
		}
		return valueInArray;
	}
// here deleting index
	public void deleteIndex(int index) {
		if (index < arraySize) {
			for (int i = index; i < arraySize - 1; i++) {
				theArray[i] = theArray[i + 1];
			}
			arraySize--;
		}
	}

	// here adding value at last index
	public void insertValue(int value) {
		if (arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}

	// here searching values at indexes
	public String linearSearchForValue(int value) {

		boolean valueInArray = false;
		String indexesWithValue = "";
		System.out.print("The value is found on following: ");

		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueInArray = true;

				System.out.print(i + " ");
				indexesWithValue = indexesWithValue + i + " ";
			}
		}
		if (!valueInArray) {
			indexesWithValue = "None";
			System.out.println(indexesWithValue);

		}
		System.out.println();
		return indexesWithValue;
	}

	public static void main(String[] args) {

		ArrayStructures newArray = new ArrayStructures();

		newArray.generateRandomArray();

		newArray.printArray();

		System.out.println("index 5: " + newArray.getIndex(5));

		System.out.println("is 18 present: " + newArray.doesArrayContainThisValue(18));

		newArray.deleteIndex(3);
		newArray.printArray();

		newArray.insertValue(10);
		newArray.printArray();

		newArray.linearSearchForValue(13);
	}

}
