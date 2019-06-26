/**
 * @purpose 	: Factory design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 11.06.19
 */

package com.bridgeit.DesignPattern;

public class ComputerFactoryTest {
		public static void main(String args[])
		{
			Computer PC=ComputerFactory.getComputer("PC", "4 GB", "500 GB", "2.5 Hz");
			Computer Server=ComputerFactory.getComputer("Server", "4G B", "1 TB","2.9 Hz");
			System.out.println("PC Features : "+PC);
			System.out.println("Server Features : "+Server);
		}
}
