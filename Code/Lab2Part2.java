package lab2part2;

/**
 *
 * @author Indra Bhurtel
 */
public class Lab2Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

		int ival1 = 5;
		int ival2;
		double fval1 = 3.0;
		double fval2;
		ival2 = 12;
		fval2 = 60.0;
		int tnum = ival2;
		System.out.println("Initial values are:");
		System.out.println("Integer ival1 = "+ival1);
		System.out.printf("Integer ival2 = %d\n",ival2); // note how it is printed
		System.out.println("Floating point fval1 = "+fval1);
		System.out.printf("Floating point fval2 = %5.2f\n\n",fval2);
		ival2 = ival2 / ival1;
		System.out.println( "orig ival2/ival1 = "+tnum+"/"+ival1+" = "+ival2 );
		fval2 = tnum / (double)ival1;
		System.out.println( "orig ival2/(double)ival1 = "+tnum+"/"+(double)ival1+" = "+ fval2 +"\n");
		ival2 = tnum;
		//System.out.println("resetting ival2 value = "+ival2+"\n");
		fval2 = ival2 / fval1;
		System.out.println( "ival2/fval1 = "+ival2+"/"+fval1+" = fval2 = "+fval2 );
		ival1 = ival2 % (int)fval1;
		System.out.println( "ival2 % (int) fval1 "+ival2+"%"+(int)fval1+"   = 1val1 = "+ival1 +"\n");
		ival2++;
		fval1 += ival2;
		System.out.println("after ival2++: ival2 value = "+ival2);
		System.out.println("after fval1 += ival2: fval1 value = "+fval1+"\n");
		System.out.print("ival1 = "+ival1+"\t");
		System.out.printf("& ival2 = %d\n",ival2); // note how it is printed
		System.out.print("fval1 = "+fval1+"\t");
		System.out.printf("& fval2 = %5.2f\n\n",fval2);
		System.out.println("fval1 >= ival1 is "+( fval1 >= ival1));
		System.out.println( "fval2 != ival2  is "+(fval2 != ival2));

	}
}

