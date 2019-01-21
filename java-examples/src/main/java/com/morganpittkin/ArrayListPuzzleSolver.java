
package com.morganpittkin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPuzzleSolver
{
	public static void solvePuzzle(InputStream in, OutputStream out) throws IOException
	{
		Scanner scanner = new Scanner(in);
		int rowCount = scanner.nextInt();

		ArrayList<Integer>[] arrayLists = new ArrayList[rowCount];
		for (int i = 0; i < rowCount; i++)
		{
			int count = scanner.nextInt();
			arrayLists[i] = new ArrayList<Integer>(count);
			for (int j = 0; j < count; j++)
				arrayLists[i].add(scanner.nextInt());
		}
		int taskCount = scanner.nextInt();
		PrintStream print = new PrintStream(out);

		for (int task = 0; task < taskCount; task++)
		{
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			int value = arrayLists[row - 1].get(col - 1);
			print.println(value);
		}

	}
}
