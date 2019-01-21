
package com.morganpittkin;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import org.junit.Test;

public class ArrayListPuzzleSolverTest
{
	@Test
	public void testArrayListPuzzleSolver() throws IOException
	{
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("input.txt");
		Objects.requireNonNull(in);

		ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();

		ArrayListPuzzleSolver.solvePuzzle(in, bytesOut);

		String solution = "17" + System.lineSeparator() + "42" + System.lineSeparator();

		assertEquals(bytesOut.toString("UTF-8"), solution);
	}
}
