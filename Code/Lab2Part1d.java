package lab2part1d;

import java.util.Scanner;

/**
 *
 * @author Indra Bhurtel
 */
public class Lab2Part1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

		Scanner input=new Scanner(System.in);
		/* *****
	       Declare the needed input object here using the names shown below in the program.
	       Also add any other needed lines to make the input object function.
		 ****** */
		//  When running the program, first input should be "SE" entered
		//  without the quote marks
		String abbrev;
		System.out.print("Please enter the abbreviation for your major "
				+ "(like CS or SE or CpE, etc.): ");
		abbrev = input.next();
		//  Input here should be "2021"
		System.out.print("Please enter an expected graduation year: ");
		int gradYear = input.nextInt();
		String sem = "Spr";
		char dot = '.';
		char comma = ',';
		String month = "May";
		String sp = " ";
		// should be semester (with a period), then month
		// then year with the words between as given
			System.out.println("As a "+abbrev+" major"+comma+" you should graduate in "
				+sem+dot+" semester"+comma+sp+month+sp+gradYear+dot);
	}
}
