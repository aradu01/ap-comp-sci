public class BinSearch {

    public static int Bin(int value, int[] entry) {

	int lower = 0;
	int index = entry.length / 2;
	int upper = entry.length;

	while (entry[index] != value) {

	    if (value < entry[index]) {
		index = upper - index / 2;
		upper = index;
	    }

	    else if (value > entry[index]) {
		index = lower + (entry.length - index) / 2;
		lower = index;

	    }

	    else {
		System.out.println("Problem");
	    }

	}

	return index;

    }

    public static void main(String[] args) {

	int[]a = new int[100];

	for (int b = 0; b < a.length; b++) {
	    a[b] = b;
	}

	System.out.println(Bin(98, a));

    }

}
